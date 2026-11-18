package com.seduc2.gta.service;

import com.seduc2.gta.entity.Arma;
import com.seduc2.gta.entity.Carro;
import com.seduc2.gta.repository.ArmaRepository;
import com.seduc2.gta.repository.CarroRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    private final CarroRepository repository;

    public CarroService(CarroRepository repository) {
        this.repository = repository;
    }

    public void registrar(Carro carro){
        repository.save(carro);
    }

    public List<Carro> mostrar(){
        return repository.findAll();
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    @Transactional
    public void alterar(Long id, Carro c){
        Carro carro = repository.getReferenceById(id);
        carro.setNome(c.getNome());
        carro.setCategoria(c.getCategoria());
        carro.setDescricao(c.getNome());
        carro.setMarca(c.getMarca());
    }
}
