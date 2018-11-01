package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.repository.FlightDB;

@Service
@Transactional
public class FlightServiceImpl implements FlightService{
	   @Autowired
	    private FlightDB flightDb;
	    
	    @Override
	    public FlightModel addFlight(FlightModel flight) {
	        return flightDb.save(flight);
	    }

	    @Override
	    public void deleteByFlightNumber(String flightNumber) {
	        flightDb.deleteByFlightNumber(flightNumber);
	    }

	    @Override
	    public Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber) {
	        return flightDb.findByFlightNumber(flightNumber);
	    }

		@Override
		public Optional<FlightModel> getFlightDetailByFlightId(long flightId) {
			return flightDb.findById(flightId);
		}

		@Override
		public void updateFlight(long flightId, FlightModel flight) {
			flightDb.save(flight);
		}

		@Override
		public void deleteFlight(FlightModel flight) {
			flightDb.delete(flight);

		}

		@Override
		public List<FlightModel> getFlights() {
			return flightDb.findAll();
		}
}
