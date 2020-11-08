package com.example.travelAgency.repository;

import com.example.travelAgency.model.Trip;
import com.example.travelAgency.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {

    List<User> findAll();

}
