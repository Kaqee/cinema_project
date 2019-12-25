package com.dto;

import com.model.Movie;
import com.model.Room;
import com.model.Session;

import java.time.LocalDateTime;

public class SessionDto {

    private Long movieId;
    private Long roomId;
    private LocalDateTime startTime;


public Session createSessionFromDto(){
    Session session=new Session();
    Movie movie=new Movie();
    Room room=new Room();

    movie.setId(movieId);
    room.setId(roomId);
    session.setStartTime(startTime);
    session.setRoom(room);
    session.setMovie(movie);
    return session;

}

}
