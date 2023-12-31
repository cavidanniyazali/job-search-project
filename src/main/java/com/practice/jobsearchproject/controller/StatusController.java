package com.practice.jobsearchproject.controller;

import com.practice.jobsearchproject.model.dto.response.StatusResponseDto;
import com.practice.jobsearchproject.service.StatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/statuses")
public class StatusController {
    private final StatusService statusService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StatusResponseDto> getAllStatuses() {
        return statusService.getAllStatuses();
    }
}