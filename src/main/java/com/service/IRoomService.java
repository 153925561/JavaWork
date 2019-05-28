package com.service;

import com.pojo.Room;

import java.util.List;

public interface IRoomService {
    Room findOneRoom(Long id) ;

    List<Room> findAllRoom();

    void updateRoom(long id, String build, String name, String people, String tel);

    void AddARoom(String build, String room, String people, String tel);

    int DeleteRoom(Long id);
}
