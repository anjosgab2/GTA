package com.seduc2.gta.entity;

import com.seduc2.gta.enuns.CategoriaPersonagem;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personagem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String apelido;
    private CategoriaPersonagem categoriaPersonagem;
    private String foto;
    private String descricao;

    public Personagem (){ }

    public Personagem(String nome, String apelido, CategoriaPersonagem categoriaPersonagem, String foto, String descricao) {
        this.nome = nome;
        this.apelido = apelido;
        this.categoriaPersonagem = categoriaPersonagem;
        this.foto = foto;
        this.descricao = descricao;
    }

    public Personagem(Long id, String nome, String apelido, CategoriaPersonagem categoriaPersonagem, String foto, String descricao) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.categoriaPersonagem = categoriaPersonagem;
        this.foto = foto;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public CategoriaPersonagem getCategoria() {
        return categoriaPersonagem;
    }

    public void setCategoria(CategoriaPersonagem categoriaPersonagem) {
        this.categoriaPersonagem = categoriaPersonagem;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
