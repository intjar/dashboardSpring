package com.dashboard.dao;

import java.util.List;

import com.dashboard.model.Capacity;
import com.dashboard.model.Generation;


public interface DashboardDao {

	List<Capacity> getCapacityBySectorId(String sectorId);
	List<Capacity> getCapacityByCategoryId(String categoryId);
	
	List<Generation> getDailyGeneration();
	List<Generation> getGenerationBySectorId(String sectorId);
	List<Generation> getGenerationByCategoryId(String categoryId);
	List<Capacity> getDailyCapacity();

}
