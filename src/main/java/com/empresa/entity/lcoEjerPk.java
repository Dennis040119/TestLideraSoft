package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcoEjerPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	String el_codcia;
	String el_ejerc;
	public lcoEjerPk(String el_codcia, String el_ejerc) {
		super();
		this.el_codcia = el_codcia;
		this.el_ejerc = el_ejerc;
	}
	public lcoEjerPk() {
		super();
	}
	public String getel_codcia() {
		return el_codcia;
	}
	public void setel_codcia(String el_codcia) {
		this.el_codcia = el_codcia;
	}
	public String getel_ejerc() {
		return el_ejerc;
	}
	public void setel_ejerc(String el_ejerc) {
		this.el_ejerc = el_ejerc;
	}
	
	
}
