package com.example.demo.repository;

import com.example.demo.domain.Pepole;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PepoleRepository extends JpaRepository<Pepole,Long> {


    @Query(value = "select a.age_range Max(select case when e.age < 15 then 'Under 15' when e.age between 15 and 20 then '15-20' when e.age between 25 and 40 then '25-40' when e.age between 40 and 70 then '40-70' when e.age > 70 then 'Uper 70' end as age_range,Sum(select count(*) from follow f where f.from.person_id = e.person_id) as count FROM pepole p  group by age_range) as a", nativeQuery = true )
    String avrageFollowerGroupByAge();


    @Query(value = "select var(select AVG(house.total_meters * house.price_per_meter) from house) from people p group by p.follws", nativeQuery = true )
    Object varinseOfAGroup();

    
}
