package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode
@Embeddable
public class lconumePk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="nl_subdia")
	private String nl_subdia;
	
	@Column(name="nl_anio")
	private String nl_anio;
	
	@Column(name="nl_mes")
	private String nl_mes;

	public String getNl_subdia() {
		return nl_subdia;
	}

	public void setNl_subdia(String nl_subdia) {
		this.nl_subdia = nl_subdia;
	}

	public String getNl_anio() {
		return nl_anio;
	}

	public void setNl_anio(String nl_anio) {
		this.nl_anio = nl_anio;
	}

	public String getNl_mes() {
		return nl_mes;
	}

	public void setNl_mes(String nl_mes) {
		this.nl_mes = nl_mes;
	}

	public lconumePk(String nl_subdia, String nl_anio, String nl_mes) {
		super();
		this.nl_subdia = nl_subdia;
		this.nl_anio = nl_anio;
		this.nl_mes = nl_mes;
	}

	public lconumePk() {
		super();
	}
	
	
	
	

}
