package com.estudos.tarefas.service;

import org.springframework.stereotype.Service;

import com.estudos.tarefas.model.Tarefa;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void deletar(Long id) {
        tarefaRepository.deleteById(id);
    }

    public Tarefa atualizar(Tarefa tarefa, Long id) {
        Tarefa existente = tarefaRepository.findById(id).orElseThrow();
        existente.setTitulo(tarefa.getTitulo());
        existente.setDescricao(tarefa.getDescricao());
        existente.setDataVencimento(tarefa.getDataVencimento());
        existente.setConcluida(tarefa.getConcluida());
        existente.setPrioridade(tarefa.getPrioridade());
        return tarefaRepository.save(existente);
    }
}