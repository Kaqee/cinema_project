package com.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(EnumType.STRING)
private String title;

private MovieCategory movieCategory;
private int length;
private String description;
private int requiredAge;

private List<Marathon> marathons;

    public List<Marathon> getMarathons(){
        if (marathons == null){
            marathons = new ArrayList<>();
        }
        return marathons;
    }


}
