package com.sparta.schedule.entity;

import com.sparta.schedule.dto.ScheduleRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
//스케줄 데이터를 저장할 schedule 클래스
public class Schedule {
    private Long id;
    private String psw;
    private String username;
    private LocalDateTime newdate;
    private LocalDateTime date;
    private String contents;

    public Schedule(ScheduleRequestDto requestDto) {
        this.id = requestDto.getId();
        this.psw = requestDto.getPsw();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.newdate = requestDto.getNewdate();
        this.date = requestDto.getDate();
    }
}
