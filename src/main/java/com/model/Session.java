package com.model;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private LocalDateTime startTime;
    private Room room;
    private Movie movie;
    private List<Ticket> tickets;

    public List<Ticket> getTickets(){
        if(tickets == null){
            tickets = new ArrayList<>();
        }
        return tickets;
    }



}
