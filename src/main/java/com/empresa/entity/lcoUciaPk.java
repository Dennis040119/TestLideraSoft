package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcoUciaPk implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String ul_codusr;
	String ul_codcia;
	
	
	
	
	public lcoUciaPk() {
		super();
	}
	public lcoUciaPk(String ul_codusr, String ul_codcia) {
		super();
		this.ul_codusr = ul_codusr;
		this.ul_codcia = ul_codcia;
	}
	public String getUl_codusr() {
		return ul_codusr;
	}
	public void setUl_codusr(String ul_codusr) {
		this.ul_codusr = ul_codusr;
	}
	public String getUl_codcia() {
		return ul_codcia;
	}
	public void setUl_codcia(String ul_codcia) {
		this.ul_codcia = ul_codcia;
	}
	

	
}
