package com.hainum.chat.payload;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@ToString
public class MessageDto implements Serializable {
    private String message;
    private int user;
    private String nickname;
    private LocalDate timeStamp;
    private int roomNum;

    public MessageDto(String message, int user, int roomNum,String nickname) {
        this.user = user;
        this.message = message;
        this.roomNum=roomNum;
        this.timeStamp=LocalDate.now();
        this.nickname=nickname;
    }
}