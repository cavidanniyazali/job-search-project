package com.practice.jobsearchproject.controller;

import com.google.cloud.storage.Storage;
import com.practice.jobsearchproject.model.CustomUserDetails;
import com.practice.jobsearchproject.model.dto.request.UserRequestDto;
import com.practice.jobsearchproject.model.dto.response.AuthenticationResponse;
import com.practice.jobsearchproject.model.dto.response.UserResponse;
import com.practice.jobsearchproject.model.mapper.UserMapper;
import com.practice.jobsearchproject.service.FileService;
import com.practice.jobsearchproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserMapper userMapper;
    private final UserService userService;

    private final FileService fileService;
    @GetMapping
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers()
                .stream()
                .map(userMapper::toUserResponse)
                .collect(Collectors.toList());
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AuthenticationResponse createUser(@Valid @RequestBody UserRequestDto userDto) {
        return userService.createUser(userDto);
    public void createUser(@RequestPart("userDto") @Valid UserRequestDto userDto, @RequestPart("file") MultipartFile file) throws IOException {
        userService.createUser(userDto, file);
    }

    @PutMapping
    public void updateUser(@Valid @RequestPart("userDto") UserRequestDto userDto,
                           @RequestPart("file") MultipartFile file,
                           @AuthenticationPrincipal CustomUserDetails userDetails) throws IOException {
    userService.updateUser(userDto, file, userDetails);
    public void updateUser(@Valid @RequestBody UserRequestDto userDto,
                           @AuthenticationPrincipal CustomUserDetails userDetails) {
        userService.updateUser(userDto, userDetails);
    }
}
