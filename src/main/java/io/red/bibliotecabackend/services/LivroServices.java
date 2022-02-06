package io.red.bibliotecabackend.services;

import io.red.bibliotecabackend.models.Livro;
import io.red.bibliotecabackend.repository.LivroRepository;
import io.red.bibliotecabackend.requests.LivroRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServices {
    private final LivroRepository repository;

    public LivroServices(LivroRepository repository) {
        this.repository = repository;
    }

    public List<Livro> listarTodos(){
        return repository.findAll();
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }


    public Livro adicionarLivro(LivroRequest request) {

        Livro livro = new Livro();
        livro.setTitulo(request.titulo());
        livro.setAutores(request.autores());
        livro.setFoto(request.foto());

        return repository.save(livro);
    }

    public Livro editarLivro(LivroRequest request, Long id) {
        final var livro = repository.findById(id).orElseThrow(() -> new RuntimeException("Livro nao encontrado"));

        Livro livroEditado = new Livro(
            livro.getId(),
            request.titulo(),
            request.editora(),
            request.foto(),
            request.autores()
        );

        return repository.save(livroEditado);
    }
}
