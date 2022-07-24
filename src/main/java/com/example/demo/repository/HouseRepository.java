package com.example.demo.repository;

import com.example.demo.domain.House;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HouseRepository extends JpaRepository<House,Long> {

    @Query(value = "select AVG(house.total_meters * house.price_per_meter) from house", nativeQuery = true )
    Long sumOfPepoleReches();
    
}
