package com.dto;

import com.model.Session;
import com.model.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketDto {

    private Long sessionId;
    private String seat;
    private BigDecimal price;

public Ticket createTicketFromDto(){
Ticket ticket=new Ticket();
Session session=new Session();
ticket.setSession(session);
ticket.setPrice(price);
ticket.setSeat(seat);
return ticket;
}

}
