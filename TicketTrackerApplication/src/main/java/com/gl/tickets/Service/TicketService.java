package com.gl.tickets.Service;

import java.util.List;

import com.gl.tickets.entity.Ticket;

public interface TicketService {
	
	List<Ticket> getAllTickets();
	
	Ticket saveTicket(Ticket ticket);
	
	Ticket getTicketById(Long id);
	   
	Ticket editTicket(Ticket ticket);
	
	Ticket viewTicket(Long id);

	void deleteTicketById(Long id);
	List<Ticket>getTicketsbyTitleAndShortDesc (String searchString);
	
}
