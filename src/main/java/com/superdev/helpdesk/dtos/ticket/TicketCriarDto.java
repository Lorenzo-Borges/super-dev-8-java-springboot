package com.superdev.helpdesk.dtos.ticket;

import com.superdev.helpdesk.enums.Setor;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TicketCriarDto(
        @Schema(example = "Não consigo acessar a VPN")
        @NotBlank
        @Size(min=5, max=120)
        String titulo,

        @Schema(example = "Desde ontem a VPN retorna erro de autenticação ao conectar de casa.")
        @Size(min = 10, max = 5000)
        String descricao,

        @Schema(description = "define o setor: TI / RH / FINANCEIRO / ADMINISTRATIVO / MANUTENCAO", example = "TI")
        Setor setor,

        @Schema(description = "Id do usuario que abre o ticket", example = "1")
        Integer solicitanteId
) {
}
