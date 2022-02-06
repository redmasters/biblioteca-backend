package io.red.bibliotecabackend.controllers;

import io.red.bibliotecabackend.models.Livro;
import io.red.bibliotecabackend.requests.LivroRequest;
import io.red.bibliotecabackend.services.LivroServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/obras")
public class LivroController {
    private final LivroServices services;

    public LivroController(LivroServices services) {
        this.services = services;
    }

    @GetMapping
    public List<Livro> listarTodos() {
        return services.listarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        services.deletar(id);
    }

    @PostMapping
    public Livro adicionarLivro(@RequestBody LivroRequest request){
        return services.adicionarLivro(request);
    }

    @PutMapping("{id}")
    public Livro editarLivro(@RequestBody LivroRequest request, @PathVariable Long id){
        return services.editarLivro(request, id);
    }


}
