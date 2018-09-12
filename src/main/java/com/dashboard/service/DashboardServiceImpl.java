package com.dashboard.service;

import java.text.DecimalFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dashboard.dao.DashboardDao;
import com.dashboard.dto.CapacityDTO;
import com.dashboard.dto.GenerationDTO;
import com.dashboard.model.Capacity;
import com.dashboard.model.Generation;

@Service
public class DashboardServiceImpl implements DashboardService {

	private final Logger log = LoggerFactory.getLogger(DashboardServiceImpl.class);
	

	@Autowired
	private DashboardDao dashboarddao;
	
	DecimalFormat twoDForm = new DecimalFormat("0.00"); 
	
	@Override
	@Transactional
	public CapacityDTO getCapacity(String sectorId, String categoryId) {
		log.info("inside getCapacity with param sectorId:{},categoryId :{}",sectorId,categoryId);
		CapacityDTO responseDto = new CapacityDTO();
		try {
			List<Capacity> CapacityList=null;
			
			if(sectorId != null)
				CapacityList = this.dashboarddao.getCapacityBySectorId(sectorId);
			else if(categoryId != null)
				CapacityList = this.dashboarddao.getCapacityByCategoryId(categoryId);
			else {
				CapacityList = this.dashboarddao.getDailyCapacity();
			}
			System.out.println("--------------------------------------------------------------");
			
			Double installed_capacity = 0.0, under_maintenance_capacity = 0.0,online_capacity = 0.0;
			if (CapacityList != null && CapacityList.size() > 0) {
				for (Capacity capObj : CapacityList) {
					installed_capacity = installed_capacity + capObj.getInstalled_capacity();
					under_maintenance_capacity = under_maintenance_capacity + capObj.getUnder_maintenance_capacity();
					online_capacity = online_capacity + capObj.getOnline_capacity();
				}
			}
			responseDto.setInstalled_capacity(twoDForm.format(installed_capacity));
			responseDto.setOnline_capacity(twoDForm.format(online_capacity));
			responseDto.setUnder_maintenance_capacity(twoDForm.format(under_maintenance_capacity));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return responseDto;

	}

	@Override
	@Transactional
	public GenerationDTO getGeneration(String sectorId, String categoryId) {
		log.info("inside getGeneration with param sectorId:{},categoryId {}",sectorId,categoryId);
		GenerationDTO genDto = new GenerationDTO();
		try {
			
			List<Generation> GenerationList=null;
			if(sectorId !=null)
				GenerationList = this.dashboarddao.getGenerationBySectorId(sectorId);
			else if(categoryId !=null)
				GenerationList = this.dashboarddao.getGenerationByCategoryId(categoryId);
			else
				GenerationList = this.dashboarddao.getDailyGeneration();
				
			System.out.println("--------------------------------------------------------------");
			
			Double programGeneration = 0.00, actualGeneration = 0.00,deviationGeneration = 0.00;
			if (GenerationList != null && GenerationList.size() > 0) {
				for (Generation genObj : GenerationList) {
					programGeneration = programGeneration + genObj.getProgram_generation();
					actualGeneration = actualGeneration + genObj.getActual_generation();
				}
			}
			if(programGeneration >0)
				deviationGeneration=(((actualGeneration/programGeneration)*100)-100);

			genDto.setProgramGeneration(twoDForm.format(programGeneration));
			genDto.setActualGeneration(twoDForm.format(actualGeneration));
			genDto.setDeviationGeneration(twoDForm.format(deviationGeneration));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return genDto;
		
	}

}
