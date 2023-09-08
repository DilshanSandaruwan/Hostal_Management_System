/*
 * Kasun Miuranga
 * Copyright (c) 2023
 */

package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.CustomDTO;
import lk.ijse.dto.ReservationDTO;
import lk.ijse.dto.RoomsDTO;
import lk.ijse.dto.StudentDTO;

import java.util.ArrayList;

public interface ReservationBO extends SuperBO {
    String getCurrentID();

    ArrayList<RoomsDTO> getRoomsData();

    ArrayList<StudentDTO> getStudentData();

    ArrayList<CustomDTO> getReservationData();

    boolean addReservation(ReservationDTO reservationDTO);

    boolean deleteReservation(ReservationDTO reservationDTO);

    boolean updateReservation(ReservationDTO reservationDTO);

}
