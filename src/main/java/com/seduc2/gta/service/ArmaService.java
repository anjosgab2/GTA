package com.seduc2.gta.service;

import com.seduc2.gta.entity.Arma;
import com.seduc2.gta.repository.ArmaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaService {

    private final ArmaRepository repository;

    public ArmaService(ArmaRepository repository) {
        this.repository = repository;
    }

    public void registrar(Arma arma){
        repository.save(arma);
    }

    public List<Arma> mostrar(){
        return repository.findAll();
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    @Transactional
    public void alterar(Long id, Arma a){
        Arma arma = repository.getReferenceById(id);
        arma.setNome(a.getNome());
        arma.setCategoria(a.getCategoria());
        arma.setDescricao(a.getDescricao());
        arma.setFabricante(a.getFabricante());
    }
}
