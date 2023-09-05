package com.example.bo.bos;

import com.example.bo.SuperBO;
import com.example.dto.ReservationDTO;

import java.util.List;

public interface ReservationBO extends SuperBO {

    Boolean saveReservation(ReservationDTO dto);

    Boolean updateReservation(ReservationDTO dto);

    Boolean deleteReservation(String id);

    String getLastId();

    ReservationDTO searchReservation(String text);

    List<ReservationDTO> getAllReservation();
}
