package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lcoejer")
public class lcoEjer {

	@EmbeddedId
	lcoEjerPk pk; 
	
	String el_usrcrea;
	
	LocalDate el_feccrea;
	
	LocalTime el_hracrea;
	
	String el_usract;
	
	LocalDate el_fecact;
	
	LocalTime el_hraact;
	
	String el_estado;

	public lcoEjer(lcoEjerPk pk, String el_usrcrea, LocalDate el_feccrea, LocalTime el_hracrea, String el_usract,
			LocalDate el_fecact, LocalTime el_hraact, String el_estado) {
		super();
		this.pk = pk;
		this.el_usrcrea = el_usrcrea;
		this.el_feccrea = el_feccrea;
		this.el_hracrea = el_hracrea;
		this.el_usract = el_usract;
		this.el_fecact = el_fecact;
		this.el_hraact = el_hraact;
		this.el_estado = el_estado;
	}

	public lcoEjer() {
		super();
	}

	public lcoEjerPk getPk() {
		return pk;
	}

	public void setPk(lcoEjerPk pk) {
		this.pk = pk;
	}

	public String getel_usrcrea() {
		return el_usrcrea;
	}

	public void setel_usrcrea(String el_usrcrea) {
		this.el_usrcrea = el_usrcrea;
	}

	public LocalDate getel_feccrea() {
		return el_feccrea;
	}

	public void setel_feccrea(LocalDate el_feccrea) {
		this.el_feccrea = el_feccrea;
	}

	public LocalTime getel_hracrea() {
		return el_hracrea;
	}

	public void setel_hracrea(LocalTime el_hracrea) {
		this.el_hracrea = el_hracrea;
	}

	public String getel_usract() {
		return el_usract;
	}

	public void setel_usract(String el_usract) {
		this.el_usract = el_usract;
	}

	public LocalDate getel_fecact() {
		return el_fecact;
	}

	public void setel_fecact(LocalDate el_fecact) {
		this.el_fecact = el_fecact;
	}

	public LocalTime getel_hraact() {
		return el_hraact;
	}

	public void setel_hraact(LocalTime el_hraact) {
		this.el_hraact = el_hraact;
	}

	public String getel_estado() {
		return el_estado;
	}

	public void setel_estado(String el_estado) {
		this.el_estado = el_estado;
	}
	
	

}
