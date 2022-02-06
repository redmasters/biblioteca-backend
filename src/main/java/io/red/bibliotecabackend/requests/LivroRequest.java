package io.red.bibliotecabackend.requests;

public record LivroRequest(
    String titulo,
    String editora,
    String foto,
    String autores
) {
}
