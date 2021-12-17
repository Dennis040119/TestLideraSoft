package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lcocias")
public class lcoCias {
	
	@Id
	String cl_codcia ;
	
	String cl_desc1;
	String cl_desc2;
	String cl_nruc;
	String cl_telef;
	String cl_email;
	String cl_host;
	String cl_usrcrea;
	LocalDate cl_feccrea;
	LocalTime cl_hracrea;
	String cl_usract;
	LocalDate cl_fecact;
	LocalTime cl_hraact;
	String cl_estado;
	
	
	
	public lcoCias() {
		super();
	}
	
	public lcoCias(String cl_codcia, String cl_desc1, String cl_desc2, String cl_nruc, String cl_telef, String cl_email,
			String cl_host, String cl_usrcrea, LocalDate cl_feccrea, LocalTime cl_hracrea, String cl_usract,
			LocalDate cl_fecact, LocalTime cl_hraact, String cl_estado) {
		super();
		this.cl_codcia = cl_codcia;
		this.cl_desc1 = cl_desc1;
		this.cl_desc2 = cl_desc2;
		this.cl_nruc = cl_nruc;
		this.cl_telef = cl_telef;
		this.cl_email = cl_email;
		this.cl_host = cl_host;
		this.cl_usrcrea = cl_usrcrea;
		this.cl_feccrea = cl_feccrea;
		this.cl_hracrea = cl_hracrea;
		this.cl_usract = cl_usract;
		this.cl_fecact = cl_fecact;
		this.cl_hraact = cl_hraact;
		this.cl_estado = cl_estado;
	}
	public String getCl_codcia() {
		return cl_codcia;
	}
	public void setCl_codcia(String cl_codcia) {
		this.cl_codcia = cl_codcia;
	}
	public String getCl_desc1() {
		return cl_desc1;
	}
	public void setCl_desc1(String cl_desc1) {
		this.cl_desc1 = cl_desc1;
	}
	public String getCl_desc2() {
		return cl_desc2;
	}
	public void setCl_desc2(String cl_desc2) {
		this.cl_desc2 = cl_desc2;
	}
	public String getCl_nruc() {
		return cl_nruc;
	}
	public void setCl_nruc(String cl_nruc) {
		this.cl_nruc = cl_nruc;
	}
	public String getCl_telef() {
		return cl_telef;
	}
	public void setCl_telef(String cl_telef) {
		this.cl_telef = cl_telef;
	}
	public String getCl_email() {
		return cl_email;
	}
	public void setCl_email(String cl_email) {
		this.cl_email = cl_email;
	}
	public String getCl_host() {
		return cl_host;
	}
	public void setCl_host(String cl_host) {
		this.cl_host = cl_host;
	}
	public String getCl_usrcrea() {
		return cl_usrcrea;
	}
	public void setCl_usrcrea(String cl_usrcrea) {
		this.cl_usrcrea = cl_usrcrea;
	}
	public LocalDate getCl_feccrea() {
		return cl_feccrea;
	}
	public void setCl_feccrea(LocalDate cl_feccrea) {
		this.cl_feccrea = cl_feccrea;
	}
	public LocalTime getCl_hracrea() {
		return cl_hracrea;
	}
	public void setCl_hracrea(LocalTime cl_hracrea) {
		this.cl_hracrea = cl_hracrea;
	}
	public String getCl_usract() {
		return cl_usract;
	}
	public void setCl_usract(String cl_usract) {
		this.cl_usract = cl_usract;
	}
	public LocalDate getCl_fecact() {
		return cl_fecact;
	}
	public void setCl_fecact(LocalDate cl_fecact) {
		this.cl_fecact = cl_fecact;
	}
	public LocalTime getCl_hraact() {
		return cl_hraact;
	}
	public void setCl_hraact(LocalTime cl_hraact) {
		this.cl_hraact = cl_hraact;
	}
	public String getCl_estado() {
		return cl_estado;
	}
	public void setCl_estado(String cl_estado) {
		this.cl_estado = cl_estado;
	}

	
	
}
