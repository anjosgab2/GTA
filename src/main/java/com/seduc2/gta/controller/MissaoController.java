package com.seduc2.gta.controller;

import com.seduc2.gta.entity.Missao;
import com.seduc2.gta.service.MissaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/missoes")
public class MissaoController {

    private final MissaoService service;

    public MissaoController(MissaoService service) {
        this.service = service;
    }

    @PostMapping
    public void registrar(@RequestBody Missao missao){
        service.registrar(missao);
    }

    @GetMapping
    public List<Missao> mostrar(){
        return service.mostrar();
    }

    @DeleteMapping ("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping ("/{id}")
    public void alterar(@PathVariable Long id
    , @RequestBody Missao missao){
        service.alterar(id, missao);
    }
}
