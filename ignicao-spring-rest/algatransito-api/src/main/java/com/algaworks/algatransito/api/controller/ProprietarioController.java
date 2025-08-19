package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Joao Silva");
        proprietario1.setEmail("joao@joao.com");
        proprietario1.setTelefone("11 11111-1111");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Maria Costa");
        proprietario2.setEmail("maria@maria.com");
        proprietario2.setTelefone("22 22222-2222");

        return Arrays.asList(proprietario1, proprietario2);
    }
}
