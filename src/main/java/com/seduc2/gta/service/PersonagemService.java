package com.seduc2.gta.service;

import com.seduc2.gta.entity.Personagem;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.seduc2.gta.repository.PersonagemRepository;

import java.util.List;

@Service
public class PersonagemService {

    private final PersonagemRepository repository;

    public PersonagemService(PersonagemRepository repository) {
        this.repository = repository;
    }

   public void registrar(Personagem p){
        repository.save(p);
   }
   public List<Personagem> mostrar(){
        return repository.findAll();
   }

   public void deletar(Long id){
        repository.deleteById(id);
   }

   @Transactional
   public void alterar(Long id, Personagem p){
        Personagem personagem = repository.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setDescricao(p.getDescricao());
   }
}
