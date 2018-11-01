package com.apap.tutorial7.repository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apap.tutorial7.model.PilotModel;

@Repository
public interface PilotDB extends JpaRepository<PilotModel, Long>{
	  Optional<PilotModel> findByLicenseNumber(String licenseNumber);
	  void deleteByLicenseNumber(String licenseNumber);
}
