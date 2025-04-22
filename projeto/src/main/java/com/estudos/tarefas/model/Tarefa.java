package com.estudos.tarefas.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    

    private Long id; 
    private String titulo;
    private String descricao;
    private LocalDate dataVencimento;
    private Boolean concluida;
    private String prioridade;
}

