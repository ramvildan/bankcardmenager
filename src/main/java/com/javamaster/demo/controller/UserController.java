package com.javamaster.demo.controller;

import com.javamaster.demo.dto.UserDto;
import com.javamaster.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "User controller")
@RestController
@RequestMapping("/v1/user")
@RequiredArgsConstructor
@Log4j2
public class UserController {

    private final UserService userService;

    @PostMapping("/v1/save")
    @ApiOperation("save User")
    public UserDto saveUser(@RequestBody UserDto userDto) {
        log.info("saveUser: userDto = {}", userDto);
        return userService.saveUser(userDto);
    }


}
