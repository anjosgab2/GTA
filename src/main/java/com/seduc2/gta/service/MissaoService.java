package com.seduc2.gta.service;

import com.seduc2.gta.entity.Missao;
import com.seduc2.gta.repository.MissaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoService {

    private final MissaoRepository repository;

    public MissaoService(MissaoRepository repository) {
        this.repository = repository;
    }

    public void registrar(Missao missao){
        repository.save(missao);
    }

    public List<Missao> mostrar(){
        return repository.findAll();
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    @Transactional
    public void alterar(Long id, Missao m){
        Missao missao = new Missao();
        missao.setNome(m.getNome());
        missao.setDescricao(m.getDescricao());
        missao.setDificuldade(m.getDificuldade());
        missao.setLocal(m.getLocal());
    }
}
