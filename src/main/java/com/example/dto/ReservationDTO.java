package com.example.dto;

import lombok.*;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReservationDTO {
    private String res_id;
    private Date date;
    private String student_id;
    private String room_type_id;
    private String status;
}
