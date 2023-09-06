package com.example.dao;

import java.util.List;

public interface CrudDAO<T> extends SuperDAO {

    Boolean add(T entity) throws Exception;

    Boolean update(T entity) throws Exception;

    Boolean delete(String id) throws Exception;

    Boolean exist(String id) throws Exception;

    String getLastId() throws Exception;

    List<T> getAll() throws Exception;

}