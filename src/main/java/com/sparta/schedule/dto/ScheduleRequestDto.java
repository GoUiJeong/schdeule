package com.sparta.schedule.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleRequestDto {
    private Long id;
    private String psw;
    private String username;
    private LocalDateTime newdate;
    private LocalDateTime date;
    private String contents;
}
