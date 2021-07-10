package br.com.acacio.demo.controller;

import br.com.acacio.demo.model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {
    @GetMapping
    public List<Curso> getCursos() {
        List<Curso> cursos = new ArrayList<>();
        Curso curso = new Curso();
        curso.setNome("Python");
        cursos.add(curso);
        Curso curso1 = new Curso();
        curso1.setNome("PHP");
        cursos.add(curso1);
        return cursos;
    }
}
