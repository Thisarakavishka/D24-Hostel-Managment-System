package com.example.bo.bos;

import com.example.bo.SuperBO;
import com.example.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBO {

    Boolean saveStudent(StudentDTO dto);

    Boolean updateStudent(StudentDTO dto);

    Boolean deleteStudent(String id);

    String getLastId();

    StudentDTO searchStudent(String text);

    List<StudentDTO> getAllStudents();

    List<StudentDTO> getUnpaidStudents();
}
