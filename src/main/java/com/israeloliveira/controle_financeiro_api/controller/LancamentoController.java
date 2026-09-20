package com.israeloliveira.controle_financeiro_api.controller;

import com.israeloliveira.controle_financeiro_api.model.Lancamento;
import com.israeloliveira.controle_financeiro_api.service.LancamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    private final LancamentoService service;

    public LancamentoController(LancamentoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Lancamento> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Lancamento criar(@RequestBody Lancamento lancamento) {
        return service.salvar(lancamento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lancamento> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lancamento> atualizar(
            @PathVariable Long id,
            @RequestBody Lancamento lancamento) {

        return service.atualizar(id, lancamento)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (service.excluir(id)) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}