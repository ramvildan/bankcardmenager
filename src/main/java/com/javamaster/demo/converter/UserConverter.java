package com.javamaster.demo.converter;

import com.javamaster.demo.dto.UserDto;
import com.javamaster.demo.entity.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
public class UserConverter {

    public User fromUserDtoToUser(@Valid UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .surname(userDto.getSurname())
                .patronymic(userDto.getPatronymic())
                .email(userDto.getEmail())
                .build();
    }

    public UserDto fromUserToUserDto(User user) {
        if(isNull(user)) {
            return null;
        }
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .patronymic(user.getPatronymic())
                .email(user.getEmail())
                .build();
    }
}
