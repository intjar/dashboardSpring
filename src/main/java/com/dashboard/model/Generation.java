package com.dashboard.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "dash_daily_gen_tt")
@IdClass(GenerationId.class)
public class Generation implements Serializable {

	private static final long serialVersionUID = 11L;

	@Id
	@Column
	private Date generation_date;
	@Id
	@Column
	private Integer zone_id;
	@Id
	@Column
	private Integer state_id;

	@Column
	private Double program_generation;
	@Column
	private Double actual_generation;

	@Column
	private Double program_generation_cumulative;
	@Column
	private Double actual_generation_cumulative;

	@Column
	private Double program_generation_cumulative_ly;
	@Column
	private Double actual_generation_cumulative_ly;

	public Date getGeneration_date() {
		return generation_date;
	}

	public void setGeneration_date(Date generation_date) {
		this.generation_date = generation_date;
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

	public Double getProgram_generation() {
		return program_generation;
	}

	public void setProgram_generation(Double program_generation) {
		this.program_generation = program_generation;
	}

	public Double getActual_generation() {
		return actual_generation;
	}

	public void setActual_generation(Double actual_generation) {
		this.actual_generation = actual_generation;
	}

	public Double getProgram_generation_cumulative() {
		return program_generation_cumulative;
	}

	public void setProgram_generation_cumulative(Double program_generation_cumulative) {
		this.program_generation_cumulative = program_generation_cumulative;
	}

	public Double getActual_generation_cumulative() {
		return actual_generation_cumulative;
	}

	public void setActual_generation_cumulative(Double actual_generation_cumulative) {
		this.actual_generation_cumulative = actual_generation_cumulative;
	}

	public Double getProgram_generation_cumulative_ly() {
		return program_generation_cumulative_ly;
	}

	public void setProgram_generation_cumulative_ly(Double program_generation_cumulative_ly) {
		this.program_generation_cumulative_ly = program_generation_cumulative_ly;
	}

	public Double getActual_generation_cumulative_ly() {
		return actual_generation_cumulative_ly;
	}

	public void setActual_generation_cumulative_ly(Double actual_generation_cumulative_ly) {
		this.actual_generation_cumulative_ly = actual_generation_cumulative_ly;
	}

	@Override
	public String toString() {
		return "Generation [generation_date=" + generation_date + ", zone_id=" + zone_id + ", state_id=" + state_id
				+ ", program_generation=" + program_generation + ", actual_generation=" + actual_generation
				+ ", program_generation_cumulative=" + program_generation_cumulative + ", actual_generation_cumulative="
				+ actual_generation_cumulative + ", program_generation_cumulative_ly="
				+ program_generation_cumulative_ly + ", actual_generation_cumulative_ly="
				+ actual_generation_cumulative_ly + "]";
	}

}
