package com.bsq.hanban.service;

import com.bsq.hanban.entity.Flight;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FlightService {

    //添加机票信息
    Flight save(Flight flight);

    //查询机票信息
    List<Flight> findAll();


}
