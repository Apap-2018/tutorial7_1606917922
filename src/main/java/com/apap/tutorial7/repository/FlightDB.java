package com.apap.tutorial7.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tutorial7.model.FlightModel;

@Repository
public interface FlightDB extends JpaRepository<FlightModel, Long>{
	 void deleteByFlightNumber(String flightNumber);
	 Optional<FlightModel> findByFlightNumber(String flightNumber);
}
