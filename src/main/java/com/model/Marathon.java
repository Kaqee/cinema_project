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
public class Marathon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;

    private LocalDateTime startTime;

    private List<Movie> movies;

    public List<Movie> getMovies(){
        if(movies == null){
            movies = new ArrayList<>();
        }
        return movies;
    }


}
