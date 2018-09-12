package com.dashboard.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "dash_capacity_t")
@IdClass(CapacityId.class)
public class Capacity  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private Date reporting_date;
	@Id
	@Column
	private Integer zone_id;
	@Id
	@Column
	private Integer state_id;

	
	@Column
	private Double installed_capacity;
	@Column
	private Double monitored_capacity;
	@Column
	private Double under_maintenance_capacity;
	@Column
	private Double online_capacity;
	@Column
	private Double shutdown_capacity;
	@Column
	private Double unscheduled_capacity;

	
	public Date getReporting_date() {
		return reporting_date;
	}

	public void setReporting_date(Date reporting_date) {
		this.reporting_date = reporting_date;
	}

	public Integer getZone_id() {
		return zone_id;
	}

	public void setZone_id(Integer zone_id) {
		this.zone_id = zone_id;
	}

	public Integer getState_id() {
		return state_id;
	}

	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}

	public Double getInstalled_capacity() {
		return installed_capacity;
	}

	public void setInstalled_capacity(Double installed_capacity) {
		this.installed_capacity = installed_capacity;
	}

	public Double getMonitored_capacity() {
		return monitored_capacity;
	}

	public void setMonitored_capacity(Double monitored_capacity) {
		this.monitored_capacity = monitored_capacity;
	}

	public Double getUnder_maintenance_capacity() {
		return under_maintenance_capacity;
	}

	public void setUnder_maintenance_capacity(Double under_maintenance_capacity) {
		this.under_maintenance_capacity = under_maintenance_capacity;
	}

	public Double getOnline_capacity() {
		return online_capacity;
	}

	public void setOnline_capacity(Double online_capacity) {
		this.online_capacity = online_capacity;
	}

	public Double getShutdown_capacity() {
		return shutdown_capacity;
	}

	public void setShutdown_capacity(Double shutdown_capacity) {
		this.shutdown_capacity = shutdown_capacity;
	}

	public Double getUnscheduled_capacity() {
		return unscheduled_capacity;
	}

	public void setUnscheduled_capacity(Double unscheduled_capacity) {
		this.unscheduled_capacity = unscheduled_capacity;
	}

	@Override
	public String toString() {
		return "Capacity [installed_capacity=" + installed_capacity + ", monitored_capacity=" + monitored_capacity
				+ ", under_maintenance_capacity=" + under_maintenance_capacity + ", online_capacity=" + online_capacity
				+ ", shutdown_capacity=" + shutdown_capacity + ", unscheduled_capacity=" + unscheduled_capacity + "]";
	}

}
