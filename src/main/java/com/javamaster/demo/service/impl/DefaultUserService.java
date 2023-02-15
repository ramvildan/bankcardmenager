package com.javamaster.demo.service.impl;

import com.javamaster.demo.converter.UserConverter;
import com.javamaster.demo.dto.UserDto;
import com.javamaster.demo.entity.User;
import com.javamaster.demo.repository.UserRepository;
import com.javamaster.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {

    private final UserRepository userRepository;

    private final UserConverter userConverter;

    @Override
    public UserDto saveUser(@Valid UserDto userDto) {
        User savedUser = userRepository.save(userConverter.fromUserDtoToUser(userDto));
        return userConverter.fromUserToUserDto(savedUser);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserDto findById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }
}
