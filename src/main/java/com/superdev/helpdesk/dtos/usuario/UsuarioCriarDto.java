package com.superdev.helpdesk.dtos.usuario;

import com.superdev.helpdesk.enums.Papel;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public record UsuarioCriarDto(
        @Schema(description="Define o  do usuario", example="Ana da Silva")
        @NotBlank @Size(min=2, max=50)
        String nome,

        @Schema(description="Define o email do usuario", example="ana@gamil.com")
        @NotBlank @Size(min=3, max=35)
        String email,

        @Schema(description="Define o papel do usuario", example="SOLICITANTE")
        Papel papel
) {}
