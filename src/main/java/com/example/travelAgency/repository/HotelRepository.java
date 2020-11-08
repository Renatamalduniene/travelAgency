package com.example.travelAgency.repository;

import com.example.travelAgency.model.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends CrudRepository <Hotel, Long> {

}
