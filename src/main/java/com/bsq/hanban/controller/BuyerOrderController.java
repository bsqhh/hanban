package com.bsq.hanban.controller;

import com.bsq.hanban.dto.FlightDto;
import com.bsq.hanban.entity.Flight;
import com.bsq.hanban.service.FlightService;
import com.bsq.hanban.utils.ResultVOUtil;
import com.bsq.hanban.vo.FlightVo;
import com.bsq.hanban.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/buyer/product")
public class BuyerOrderController {

    @Autowired
    public FlightService flightService;


    @GetMapping("/list")
    public ResultVO<List<FlightDto>> list() {
       List<Flight> list=flightService.findAll();
       return ResultVOUtil.success(list);
    }

}
