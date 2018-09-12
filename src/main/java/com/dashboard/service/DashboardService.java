package com.dashboard.service;
import com.dashboard.dto.CapacityDTO;
import com.dashboard.dto.GenerationDTO;

public interface DashboardService {

	CapacityDTO getCapacity(String sectorId, String categoryId);
	
	GenerationDTO getGeneration(String sectorId, String categoryId);
}
