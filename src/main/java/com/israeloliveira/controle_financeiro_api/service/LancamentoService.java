package com.israeloliveira.controle_financeiro_api.service;

import com.israeloliveira.controle_financeiro_api.model.Lancamento;
import com.israeloliveira.controle_financeiro_api.repository.LancamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LancamentoService {

    private final LancamentoRepository repository;

    public LancamentoService(LancamentoRepository repository) {
        this.repository = repository;
    }

    public List<Lancamento> listarTodos() {
        return repository.findAll();
    }

    public Lancamento salvar(Lancamento lancamento) {
        return repository.save(lancamento);
    }

    public Optional<Lancamento> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Optional<Lancamento> atualizar(Long id, Lancamento novosDados) {
        return repository.findById(id).map(lancamento -> {
            lancamento.setDescricao(novosDados.getDescricao());
            lancamento.setValor(novosDados.getValor());
            lancamento.setTipo(novosDados.getTipo());
            lancamento.setData(novosDados.getData());

            return repository.save(lancamento);
        });
    }

    public boolean excluir(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }
}