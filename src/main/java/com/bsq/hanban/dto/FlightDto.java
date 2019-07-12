package com.bsq.hanban.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class FlightDto {
    @Id
    private long id;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")

    private Date takeoffTime;
    private String flyingTime;
    private String startPlace;
    private String endPlace;
    private long ticket;
    private double price;
}
