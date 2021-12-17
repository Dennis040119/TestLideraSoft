package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcoAnexPk implements  Serializable {

	private static final long serialVersionUID = 1L;
	
	String al_tipanex;
	String al_codanex;
	
	
	
	public lcoAnexPk() {
		super();
	}
	public lcoAnexPk(String al_tipanex, String al_codanex) {
		super();
		this.al_tipanex = al_tipanex;
		this.al_codanex = al_codanex;
	}
	public String getAl_tipanex() {
		return al_tipanex;
	}
	public void setAl_tipanex(String al_tipanex) {
		this.al_tipanex = al_tipanex;
	}
	public String getAl_codanex() {
		return al_codanex;
	}
	public void setAl_codanex(String al_codanex) {
		this.al_codanex = al_codanex;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
