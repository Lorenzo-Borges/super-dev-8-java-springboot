package com.superdev.helpdesk.dtos.ticket;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.PathVariable;

public record TicketAssociarDto(
        Integer usuarioId
) {
}
