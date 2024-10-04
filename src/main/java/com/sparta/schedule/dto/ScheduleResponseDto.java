package com.sparta.schedule.dto;

import com.sparta.schedule.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {
    private Long id;
    private String psw;
    private String username;
    private LocalDateTime newdate;
    private LocalDateTime date;
    private String contents;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.psw = schedule.getPsw();
        this.username = schedule.getUsername();
        this.contents = schedule.getContents();
        this.date = schedule.getDate();
        this.newdate = schedule.getNewdate();
    }

    public ScheduleResponseDto(Long id, String username, String contents, String psw) {
        this.id = id;
        this.username = username;
        this.contents = contents;
        this.psw = psw;
        this.newdate = newdate;
        this.date = date;
    }

}