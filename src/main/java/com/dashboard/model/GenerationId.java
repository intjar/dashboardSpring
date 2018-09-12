package com.dashboard.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class GenerationId implements Serializable {

	@Id
	@Column
	private Date generation_date;
	@Id
	@Column
	private Integer zone_id;
	@Id
	@Column
	private Integer state_id;

	public GenerationId() {

	}

	public GenerationId(Date generation_date, Integer zone_id, Integer state_id) {
		this.generation_date = generation_date;
		this.zone_id = zone_id;
		this.state_id = state_id;
	}

}