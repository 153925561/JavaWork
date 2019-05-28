package com.service.impl;

import com.dao.RoomMapper;
import com.pojo.Room;
import com.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImpl implements IRoomService {
    @Autowired
    private RoomMapper roomMapper;

    @Override
    public Room findOneRoom(Long id) {

        Room room=roomMapper.selectByPrimaryKey(id);
        return room;
    }

    public List<Room> findAllRoom() {
      List<Room> rooms=roomMapper.selectAll();
      return  rooms;
    }

    @Override
    public void updateRoom(long id, String build, String name, String people, String tel) {
        roomMapper.updateRoom(id,build,name,people,tel);

    }

    @Override
    public void AddARoom(String build, String room, String people, String tel) {
        roomMapper.AddARoom(build,room,people,tel);
    }

    @Override
    public int DeleteRoom(Long id) {
        int room=roomMapper.deleteByPrimaryKey(id);
        return room;
    }


}
