package com.javamaster.demo.service;

import com.javamaster.demo.dto.UserDto;
import jakarta.validation.Valid;

import java.util.List;

public interface UserService {

    UserDto saveUser(@Valid UserDto userDto);

    void deleteUser(Integer userId);

    UserDto findById(Integer userId);

    List<UserDto> findAll();
}
