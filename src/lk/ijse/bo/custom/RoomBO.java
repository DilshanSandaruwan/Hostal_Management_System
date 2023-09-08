package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;

import java.util.ArrayList;

public interface RoomBO extends SuperBO {
    Boolean addRoom(RoomsDTO roomsDTO);

    Boolean deleteRoom(RoomsDTO roomsDTO);

    ArrayList<RoomsDTO> getRoomsData();

    //String getCurrentID();

    Boolean updateRoom(RoomsDTO roomsDTO);
}
