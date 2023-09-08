package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.RoomsDTO;

import java.util.ArrayList;

public interface RoomsBO extends SuperBO {

    Boolean addRoom(RoomsDTO roomsDTO);

    Boolean deleteRoom(RoomsDTO roomsDTO);

    ArrayList<RoomsDTO> getRoomsData();

    Boolean updateRoom(RoomsDTO roomsDTO);
}
