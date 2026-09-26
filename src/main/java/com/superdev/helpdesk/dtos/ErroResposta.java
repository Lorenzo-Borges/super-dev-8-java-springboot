package com.superdev.helpdesk.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public record ErroResposta(
    @Schema(example = "nao_encontrado")
    String codigo,

    @Schema(example = "Categoria nao encontrada")
    String  mensagem,

    List<?> detalhes
)
{}
