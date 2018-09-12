package com.dashboard.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dashboard.model.Capacity;
import com.dashboard.model.Generation;
@SuppressWarnings("unchecked")

@Repository
public class DashboardDaoImpl implements DashboardDao{

	private final Logger log = LoggerFactory.getLogger(DashboardDaoImpl.class);
	
	@Autowired
	private SessionFactory session;

	// ---Get capacity data daily, by Sector id, By Category Id Created by Intjar Ahmad-13-Aug-2018----------------- 
	@Override
	public List<Capacity> getDailyCapacity() {
		log.info("inside getCapacityById with param");
		Criteria criteria = session.getCurrentSession().createCriteria(Capacity.class);
		return criteria.list();
	}
	

	@Override
	public List<Capacity> getCapacityBySectorId(String sectorId) {
		log.info("inside getCapacityById with param sectorId={}",sectorId);
		Criteria criteria = session.getCurrentSession().createCriteria(Capacity.class);
		criteria.add(Restrictions.eq("zone_id", Integer.valueOf(sectorId)));
		return criteria.list();
	}

	@Override
	public List<Capacity> getCapacityByCategoryId(String categoryId) {
		log.info("inside getCapacityByCategoryId with param categoryId={}",categoryId);
		Criteria criteria = session.getCurrentSession().createCriteria(Capacity.class);
		criteria.add(Restrictions.eq("zone_id", Integer.valueOf(categoryId)));
		return criteria.list();
	}

	
	
	
	// ---Get Generation data daily, by Sector id, By Category Id Created by Intjar Ahmad-13-Aug-2018----------------- 
	@Override
	public List<Generation> getDailyGeneration() {
		log.info("inside getDailyGeneration ");
		Criteria criteria = session.getCurrentSession().createCriteria(Generation.class);
		return criteria.list();
	}

	@Override
	public List<Generation> getGenerationBySectorId(String sectorId) {
		log.info("inside getGenerationBySectorId with param sectorId={}",sectorId);
		Criteria criteria = session.getCurrentSession().createCriteria(Generation.class);
		criteria.add(Restrictions.eq("zone_id", Integer.valueOf(sectorId)));
		return criteria.list();
	}
	
	@Override
	public List<Generation> getGenerationByCategoryId(String categoryId) {
		log.info("inside getGenerationByCategoryId with param categoryId={}",categoryId);
		Criteria criteria = session.getCurrentSession().createCriteria(Generation.class);
		criteria.add(Restrictions.eq("zone_id", Integer.valueOf(categoryId)));
		return criteria.list();
	}
	
}
