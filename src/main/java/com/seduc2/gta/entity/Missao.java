package com.seduc2.gta.entity;

import com.seduc2.gta.enuns.Dificuldade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Missao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String local;
    private String descricao;
    private Dificuldade dificuldade;
    private Long foto;

    public Missao (){}

    public Missao(String nome, String local, String descricao, Dificuldade dificuldade, Long foto) {
        this.nome = nome;
        this.local = local;
        this.descricao = descricao;
        this.dificuldade = dificuldade;
        this.foto = foto;
    }

    public Missao(Long id, String nome, String local, String descricao, Dificuldade dificuldade, Long foto) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.descricao = descricao;
        this.dificuldade = dificuldade;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Long getFoto() {
        return foto;
    }

    public void setFoto(Long foto) {
        this.foto = foto;
    }
}
