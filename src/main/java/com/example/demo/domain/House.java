package com.example.demo.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class House {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long houseId;

    private Long pricePerMeter;

    private Integer rooms;

    private Long totalMeters;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personId")
    private Pepole person;
    
}
