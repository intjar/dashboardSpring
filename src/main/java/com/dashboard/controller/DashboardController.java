package com.dashboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.dto.CapacityDTO;
import com.dashboard.dto.GenerationDTO;
import com.dashboard.service.DashboardService;

@RestController
public class DashboardController {

	private final Logger log = LoggerFactory.getLogger(DashboardController.class);

	@Autowired
	private DashboardService DashboardService;

	@RequestMapping(value = "/getCapacity", method = RequestMethod.GET)
	public CapacityDTO capacityData(
		@RequestParam(value = "sectorId",required=false) String sectorId,
		@RequestParam(value = "categoryId",required=false) String categoryId){
		log.info("inside /capacity with param sectorId:{},categoryId :{}",sectorId,categoryId);
		CapacityDTO response = this.DashboardService.getCapacity(sectorId,categoryId);
		return response;
	}
	
	
	@RequestMapping(value="/getGeneration", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE})
	public GenerationDTO generationData(
		@RequestParam(value = "sectorId",required=false) String sectorId,
		@RequestParam(value = "categoryId",required=false) String categoryId){
		log.info("inside /generation with param sectorId:{},categoryId :{}",sectorId,categoryId);
		
		GenerationDTO response = this.DashboardService.getGeneration(sectorId,categoryId);
		return response;
		
	}
	

}

