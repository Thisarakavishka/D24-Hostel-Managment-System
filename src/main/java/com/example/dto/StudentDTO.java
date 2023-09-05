package com.example.dto;

import lombok.*;

import java.sql.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StudentDTO {
    private String student_id;
    private String name;
    private String address;
    private String contact_no;
    private Date dob;
    private String gender;
}
