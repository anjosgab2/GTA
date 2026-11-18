package com.seduc2.gta.controller;

import com.seduc2.gta.entity.Arma;
import com.seduc2.gta.service.ArmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/armas")
public class ArmaController {

    private final ArmaService service;

    public ArmaController(ArmaService service) {
        this.service = service;
    }

    @PostMapping
    public void registrar(@RequestBody Arma arma){
        service.registrar(arma);
    }

    @GetMapping
    public List<Arma> mostrar(){
        return service.mostrar();
    }

    @DeleteMapping ("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping  ("/{id}")
    public void alterar (@PathVariable Long id
    , @RequestBody Arma arma){
        service.alterar(id, arma);
    }
}
