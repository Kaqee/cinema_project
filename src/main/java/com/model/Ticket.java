package com.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String seat;
    private BigDecimal price;

    private Session session;

}
