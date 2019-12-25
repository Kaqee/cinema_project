package com.dto;

import com.model.Movie;
import com.model.MovieCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {

    private String title;
    @Enumerated(EnumType.STRING)
    private MovieCategory category;
    private int length;
    private String description;
    private int requiredAge;
    private String posterFilePath;


    public Movie createMovieFromDto(){
        Movie movie=new Movie();
        movie.setTitle(title);
        movie.setMovieCategory(category);
movie.setRequiredAge(requiredAge);
movie.setLength(length);
movie.setDescription(description);
return movie;

    }
}
