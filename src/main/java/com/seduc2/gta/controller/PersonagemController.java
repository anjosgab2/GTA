package com.seduc2.gta.controller;

import com.seduc2.gta.entity.Personagem;
import org.springframework.web.bind.annotation.*;
import com.seduc2.gta.service.PersonagemService;

import java.util.List;

@RestController
@RequestMapping("/api/personagens")
public class PersonagemController {

    private final PersonagemService service;

    public PersonagemController(PersonagemService service) {
        this.service = service;
    }

    @PostMapping
    public void registrar(@RequestBody Personagem personagem){
        service.registrar(personagem);
    }

    @GetMapping
    public List<Personagem> mostrar(){
        return service.mostrar();
    }

    @DeleteMapping ("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping ("/{id}")
    public void alterar(@PathVariable Long id
            , @RequestBody Personagem p){
        service.alterar(id, p);
    }
}
