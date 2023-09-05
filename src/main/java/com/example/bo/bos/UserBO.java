package com.example.bo.bos;

import com.example.dto.UserDTO;

import java.util.List;

public interface UserBO {

    Boolean saveUser(UserDTO dto);

    Boolean updateUser(UserDTO dto);

    Boolean deleteUser(String userName);

    UserDTO searchUser(String text);

    List<UserDTO> getAllUsers();
}
