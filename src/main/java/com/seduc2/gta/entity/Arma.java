package com.seduc2.gta.entity;

import com.seduc2.gta.enuns.CategoriaArma;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arma {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private CategoriaArma categoria;
    private String fabricante;
    private String foto;
    private String descricao;

    public Arma (){ }

    public Arma(String nome, CategoriaArma categoria, String fabricante, String foto, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.foto = foto;
        this.descricao = descricao;
    }

    public Arma(Long id, String nome, CategoriaArma categoria, String fabricante, String foto, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
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

    public CategoriaArma getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaArma categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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
