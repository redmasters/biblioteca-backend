package io.red.bibliotecabackend.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "editora")
    private String editora;

    @Column(name = "foto")
    private String foto;

    @Column(name = "autores")
    private String autores;

    public Livro() {
    }

    public Livro(Long id, String titulo, String editora, String foto, String autores) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        this.foto = foto;
        this.autores = autores;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String getFoto() {
        return foto;
    }

    public String getAutores() {
        return autores;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
}
