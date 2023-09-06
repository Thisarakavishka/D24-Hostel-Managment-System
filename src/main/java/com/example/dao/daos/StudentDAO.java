package com.example.dao.daos;

import com.example.dao.CrudDAO;
import com.example.dto.StudentDTO;

import java.util.List;

public interface StudentDAO extends CrudDAO<StudentDTO> {
    List<StudentDTO> getUnpaidStudents() throws Exception;
}
