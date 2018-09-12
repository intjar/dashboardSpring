package com.dashboard.dto;

import java.io.Serializable;

public class CapacityDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String installed_capacity="0.00";
	private String under_maintenance_capacity="0.00";
	private String online_capacity="0.00";

	public String getInstalled_capacity() {
		return installed_capacity;
	}

	public void setInstalled_capacity(String installed_capacity) {
		this.installed_capacity = installed_capacity;
	}

	public String getUnder_maintenance_capacity() {
		return under_maintenance_capacity;
	}

	public void setUnder_maintenance_capacity(String under_maintenance_capacity) {
		this.under_maintenance_capacity = under_maintenance_capacity;
	}

	public String getOnline_capacity() {
		return online_capacity;
	}

	public void setOnline_capacity(String online_capacity) {
		this.online_capacity = online_capacity;
	}

	@Override
	public String toString() {
		return "CapacityDTO [installed_capacity=" + installed_capacity + ", under_maintenance_capacity="
				+ under_maintenance_capacity + ", online_capacity=" + online_capacity + "]";
	}

}
