package com.at1_t2_springboot.concessionaria.controller;
import com.at1_t2_springboot.concessionaria.model.Carro;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private Map<Long, Carro> banco = new HashMap<>();

    public CarroController() {
        banco.put(1L, new Carro(1L, "Civic", "Honda", 120000.0));
        banco.put(2L, new Carro(2L, "Corolla", "Toyota", 130000.0));
    }

    @GetMapping
    public Collection<Carro> listar() {
        return banco.values();
    }

    @GetMapping("/{id}")
    public Carro buscar(@PathVariable Long id) {
        return banco.get(id);
    }

    @PostMapping
    public Carro criar(@RequestBody Carro carro) {
        banco.put(carro.getId(), carro);
        return carro;
    }
}
