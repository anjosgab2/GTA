package com.seduc2.gta.controller;

import com.seduc2.gta.entity.Carro;
import com.seduc2.gta.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carros")
public class CarroController {

    private final CarroService service;

    public CarroController(CarroService service) {
        this.service = service;
    }

    @PostMapping
    public void registrar(@RequestBody Carro carro){
        service.registrar(carro);
    }

    @GetMapping
    public List<Carro> mostrar(){
        return service.mostrar();
    }

    @DeleteMapping ("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping ("/{id}")
    public void alterar(@PathVariable Long id
    , @RequestBody Carro carro){
        service.alterar(id, carro);
    }
}
