package com.example.demo.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pepole {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long personId;

    private String firstName;

    private String lastName;

    private Integer age;

    private Boolean gender;

    private String tel;



    @OneToMany(mappedBy="personId", fetch=FetchType.LAZY)
    List<Pepole> follws;


    @OneToMany(mappedBy="personId", fetch=FetchType.LAZY)
    List<House> houses;
    
}
