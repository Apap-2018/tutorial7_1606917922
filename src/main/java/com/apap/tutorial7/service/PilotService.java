package com.apap.tutorial7.service;

import java.util.Optional;

import com.apap.tutorial7.model.PilotModel;

public interface PilotService {
	 Optional<PilotModel> getPilotDetailByLicenseNumber(String licenseNumber);
	 PilotModel addPilot(PilotModel pilot);
	 void deletePilotByLicenseNumber(String licenseNumber);
	 Optional<PilotModel> getPilotDetailById(long id);
	 void deletePilot(PilotModel pilot);
	 void updatePilot(PilotModel pilot);
}
