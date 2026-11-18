package com.seduc2.gta.entity;

import com.seduc2.gta.enuns.CategoriaArma;
import com.seduc2.gta.enuns.CategoriaCarro;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String marca;
    private CategoriaCarro categoria;
    private String foto;

    public Carro (){}

    public Carro(String nome, String descricao, String marca, CategoriaCarro categoria, String foto) {
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.categoria = categoria;
        this.foto = foto;
    }

    public Carro(Long id, String nome, String descricao, String marca, CategoriaCarro categoria, String foto) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.categoria = categoria;
        this.foto = foto;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public CategoriaCarro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCarro categoria) {
        this.categoria = categoria;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
