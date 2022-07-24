package com.example.demo.service;

import com.example.demo.repository.FollowRepository;
import com.example.demo.repository.HouseRepository;
import com.example.demo.repository.PepoleRepository;

import org.springframework.stereotype.Service;

@Service
public class InterviewService {

    private final FollowRepository followRepository;

    private final HouseRepository houseRepository;

    private final PepoleRepository pepoleRepository;

    public InterviewService(FollowRepository followRepository,
            HouseRepository houseRepository,
            PepoleRepository pepoleRepository){

        this.followRepository=followRepository;
        this.houseRepository=houseRepository;
        this.pepoleRepository=pepoleRepository;
    }

    
    public Long sumOfPepoleReches(){

        return houseRepository.sumOfPepoleReches();
    }

    public String avrageFollowerGroupByAge(){
        return pepoleRepository.avrageFollowerGroupByAge();
    }

    public String varinseOfAGroup(){
        return pepoleRepository.avrageFollowerGroupByAge();
    }
}
