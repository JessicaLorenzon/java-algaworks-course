package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.api.model.VeiculoRepresentationModel;
import com.algaworks.algatransito.domain.model.Veiculo;
import com.algaworks.algatransito.domain.repository.VeiculoRepository;
import com.algaworks.algatransito.domain.service.RegistroVeiculoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoRepository veiculoRepository;
    private final RegistroVeiculoService registroVeiculoService;

    @GetMapping
    private List<Veiculo> listar() {
        return veiculoRepository.findAll();
    }

    @GetMapping("/{veiculoId}")
    public ResponseEntity<VeiculoRepresentationModel> buscar(@PathVariable Long veiculoId) {
        return veiculoRepository.findById(veiculoId)
                .map(veiculo -> {
                    var veiculoRepresentationModel = new VeiculoRepresentationModel();
                    veiculoRepresentationModel.setId(veiculo.getId());
                    veiculoRepresentationModel.setNomeProprietario(veiculo.getProprietario().getNome());
                    veiculoRepresentationModel.setMarca(veiculo.getMarca());
                    veiculoRepresentationModel.setModelo(veiculo.getModelo());
                    veiculoRepresentationModel.setNumeroPlaca(veiculo.getPlaca());
                    veiculoRepresentationModel.setStatus(veiculo.getStatus());
                    veiculoRepresentationModel.setDataCadastro(veiculo.getDataCadastro());
                    veiculoRepresentationModel.setDataApreensao(veiculo.getDataApreensao());
                    return veiculoRepresentationModel;
                })
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Veiculo cadastrar(@Valid @RequestBody Veiculo veiculo) {

        return registroVeiculoService.cadastrar(veiculo);
    }
}
