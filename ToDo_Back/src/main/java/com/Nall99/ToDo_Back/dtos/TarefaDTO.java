package com.Nall99.ToDo_Back.dtos;

import java.time.LocalDateTime;

public record TarefaDTO(
        Long id,
        String titulo,
        String descricao,
        String status,
        LocalDateTime criadoEm,
        LocalDateTime atualizadoEm
) {}
