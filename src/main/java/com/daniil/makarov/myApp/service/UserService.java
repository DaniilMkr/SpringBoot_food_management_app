package com.daniil.makarov.myApp.service;

import com.daniil.makarov.myApp.dto.UserDto;
import com.daniil.makarov.myApp.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
