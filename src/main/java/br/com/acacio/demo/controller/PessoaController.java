package br.com.acacio.demo.controller;

import br.com.acacio.demo.model.Pessoa;
import br.com.acacio.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("galera")
public class PessoaController {
    @Autowired
    private PessoaRepository pessoasRepository;
    @GetMapping
    public List<Pessoa> getPessoas() {
        List<Pessoa> pessoas = pessoasRepository.findAll();
        return pessoas;
    }
}
