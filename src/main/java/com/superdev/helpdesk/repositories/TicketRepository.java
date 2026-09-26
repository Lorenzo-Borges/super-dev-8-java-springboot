package com.superdev.helpdesk.repositories;

import com.superdev.helpdesk.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
