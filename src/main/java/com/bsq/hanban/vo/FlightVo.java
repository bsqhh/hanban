package com.bsq.hanban.vo;

import com.bsq.hanban.enums.ProductStatusEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
//商品详情
public class FlightVo {
    @JsonProperty("id")
    private long id;

    @JsonProperty("takeoffTime")
    private Date takeoffTime;

    @JsonProperty("flyingTime")
    private String flyingTime;

    @JsonProperty("startPlace")
    private String startPlace;

    @JsonProperty("endPlace")
    private String endPlace;

    @JsonProperty("ticket")
    private long ticket;

    @JsonProperty("price")
    private double price;
}
