package com.dashboard.dto;

import java.io.Serializable;

public class GenerationDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String programGeneration="0.00";
	private String actualGeneration="0.00";
	private String deviationGeneration="0.00";

	public String getProgramGeneration() {
		return programGeneration;
	}

	public void setProgramGeneration(String programGeneration) {
		this.programGeneration = programGeneration;
	}

	public String getActualGeneration() {
		return actualGeneration;
	}

	public void setActualGeneration(String actualGeneration) {
		this.actualGeneration = actualGeneration;
	}

	public String getDeviationGeneration() {
		return deviationGeneration;
	}

	public void setDeviationGeneration(String deviationGeneration) {
		this.deviationGeneration = deviationGeneration;
	}

	@Override
	public String toString() {
		return "GenerationDTO [programGeneration=" + programGeneration + ", actualGeneration=" + actualGeneration
				+ ", deviationGeneration=" + deviationGeneration + "]";
	}

}
