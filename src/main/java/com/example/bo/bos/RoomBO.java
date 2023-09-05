package com.example.bo.bos;

import com.example.bo.SuperBO;
import com.example.dto.RoomDTO;

import java.util.List;

public interface RoomBO extends SuperBO {

    Boolean saveRoom(RoomDTO dto);

    Boolean updateRoom(RoomDTO dto);

    Boolean deleteRoom(String id);

    String getLastId();

    RoomDTO searchRoom(String text);

    List<RoomDTO> getAllRooms();
}