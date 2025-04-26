package com.exemplo.doisApis.api1.controller;

import com.exemplo.doisApis.api1.Fip;
import com.exemplo.doisApis.api1.FipService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fip")
public class FipController {

    private final FipService service;

    public FipController(FipService service) {
        this.service = service;
    }

    @GetMapping
    public List<Fip> listar() {
        return service.listar();
    }

    @PostMapping
    public Fip salvar(@RequestBody Fip fip) {
        return service.salvar(fip);
    }

    @PutMapping("/{id}")
    public Fip atualizar(@PathVariable Long id, @RequestBody Fip fip) {
        return service.atualizar(id, fip);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
