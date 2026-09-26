package com.superdev.helpdesk.dtos.categoria;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioCriarDto(
        @NotBlank @Size(min=2, max=50)
        String nome,

        @NotBlank @Size(min=3, max=35)
        String email
) {}
