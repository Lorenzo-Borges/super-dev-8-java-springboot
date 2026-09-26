package com.superdev.helpdesk.controller;


import com.superdev.helpdesk.dtos.ticket.*;
import com.superdev.helpdesk.models.Ticket;
import com.superdev.helpdesk.services.TicketService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
@Tag(name="Ticket")

public class TicketController {
    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ticket> listar() {
        return service.listar();
    }

    @PostMapping
    public Ticket criar(@RequestBody @Valid TicketCriarDto dado){
        return service.criar(dado);
    }

    @PostMapping("/{id}/associar")
    @Operation(summary = "Associar o ticket ao atendente")
    public Ticket associar(@PathVariable int id, @RequestBody @Valid TicketAssociarDto dado) {
        return service.associar(id, dado);
    }

    @PostMapping("{id}/cancelar")
    @Operation(summary = "Cancelar ticket aberto")
    public Ticket cancelar(@PathVariable int id, @RequestBody @Valid TicketCancelarDto dado){
        return  service.cancelar(id, dado);
    }

    @PostMapping("{id}/resolver")
    @Operation(summary = "Ticket resolvido")
    public Ticket resolver(@PathVariable int id, @RequestBody @Valid TicketResolverDto dado){
        return service.resolver(id, dado);
    }
    
    @PostMapping("{id}/definir-prioridade")
    @Operation(summary = "Determinada prioridade")
    public Ticket definirPrioridade(@PathVariable int id, @RequestBody @Valid TicketDefinirPrioridadeDto dado){
        return service.finalize(id, dado);
    }
}
