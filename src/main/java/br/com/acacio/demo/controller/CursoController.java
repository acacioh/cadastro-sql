package br.com.acacio.demo.controller;

import br.com.acacio.demo.model.Curso;
import br.com.acacio.demo.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {
    @Autowired //fala p/ Spring iniciar esse cara
    private CursoRepository cursoRepository;
    @GetMapping
    public List<Curso> getCursos() {
        List<Curso> cursos = cursoRepository.findAll();
        return cursos;
    }
}
