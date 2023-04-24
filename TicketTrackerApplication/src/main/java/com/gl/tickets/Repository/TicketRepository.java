package com.gl.tickets.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.tickets.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
	List<Ticket> findByTitleOrShortDiscription(String searchString, String searchString2);
	
}
