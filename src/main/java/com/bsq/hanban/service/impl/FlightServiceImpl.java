package com.bsq.hanban.service.impl;

import com.bsq.hanban.dao.FlightDao;
import com.bsq.hanban.entity.Flight;
import com.bsq.hanban.enums.ProductStatusEnum;
import com.bsq.hanban.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    public FlightDao flightDao;

    @Override
    public Flight save(Flight flight) {
        return flightDao.save(flight);
    }

    @Override
    public List<Flight> findAll() {
        return flightDao.findAll();
    }
}
