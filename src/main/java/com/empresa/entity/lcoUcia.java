package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lcoucia")
public class lcoUcia {
	
	@EmbeddedId
	lcoUciaPk pk ;
	
	String ul_usrcrea;
	
	LocalDate ul_feccrea;
	
	LocalTime ul_hracrea;
	
	String ul_usract;
	
	LocalDate ul_fecact;
	
	LocalTime ul_hraact;
	
	

	public lcoUcia() {
		super();
	}

	public lcoUcia(lcoUciaPk pk, String ul_usrcrea, LocalDate ul_feccrea, LocalTime ul_hracrea, String ul_usract,
			LocalDate ul_fecact, LocalTime ul_hraact) {
		super();
		this.pk = pk;
		this.ul_usrcrea = ul_usrcrea;
		this.ul_feccrea = ul_feccrea;
		this.ul_hracrea = ul_hracrea;
		this.ul_usract = ul_usract;
		this.ul_fecact = ul_fecact;
		this.ul_hraact = ul_hraact;
	}

	public lcoUciaPk getPk() {
		return pk;
	}

	public void setPk(lcoUciaPk pk) {
		this.pk = pk;
	}

	public String getUl_usrcrea() {
		return ul_usrcrea;
	}

	public void setUl_usrcrea(String ul_usrcrea) {
		this.ul_usrcrea = ul_usrcrea;
	}

	public LocalDate getUl_feccrea() {
		return ul_feccrea;
	}

	public void setUl_feccrea(LocalDate ul_feccrea) {
		this.ul_feccrea = ul_feccrea;
	}

	public LocalTime getUl_hracrea() {
		return ul_hracrea;
	}

	public void setUl_hracrea(LocalTime ul_hracrea) {
		this.ul_hracrea = ul_hracrea;
	}

	public String getUl_usract() {
		return ul_usract;
	}

	public void setUl_usract(String ul_usract) {
		this.ul_usract = ul_usract;
	}

	public LocalDate getUl_fecact() {
		return ul_fecact;
	}

	public void setUl_fecact(LocalDate ul_fecact) {
		this.ul_fecact = ul_fecact;
	}

	public LocalTime getUl_hraact() {
		return ul_hraact;
	}

	public void setUl_hraact(LocalTime ul_hraact) {
		this.ul_hraact = ul_hraact;
	}

	
	
}
