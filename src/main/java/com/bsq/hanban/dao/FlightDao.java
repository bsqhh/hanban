package com.bsq.hanban.dao;

import com.bsq.hanban.entity.Flight;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightDao extends JpaRepository<Flight, Integer> {
    //List<Flight> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
