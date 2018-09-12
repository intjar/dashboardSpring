package com.dashboard.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class CapacityId implements Serializable {

	@Id
	@Column
	private Date reporting_date;
	@Id
	@Column
	private Integer zone_id;
	@Id
	@Column
	private Integer state_id;

	public CapacityId() {

	}

	public CapacityId(Date reporting_date, Integer zone_id, Integer state_id) {
		this.reporting_date = reporting_date;
		this.zone_id = zone_id;
		this.state_id = state_id;
	}

}
