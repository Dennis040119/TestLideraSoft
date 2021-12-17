package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="lco0001nume21")
public class lconume {
	
	@EmbeddedId
	private lconumePk pkID;
	
	@Column(name="nl_nume")
	private int nl_nume;
	
	@Column(name="nl_usrcrea")
	private String nl_usrcrea;
	
	@Column(name="nl_feccrea")
	private LocalDate nl_feccrea;
	
	@Column(name="nl_hracrea")
	private LocalTime nl_hracrea;
	
	@Column(name="nl_usract")
	private String nl_usract;
	
	@Column(name="nl_fecact", nullable = true)
	private LocalDate nl_fecact;
	
	@Column(name="nl_hraact", nullable = true)
	private LocalTime nl_hraact;

	public lconumePk getPkID() {
		return pkID;
	}

	public void setPkID(lconumePk pkID) {
		this.pkID = pkID;
	}

	public int getNl_nume() {
		return nl_nume;
	}

	public void setNl_nume(int nl_nume) {
		this.nl_nume = nl_nume;
	}

	public String getNl_usrcrea() {
		return nl_usrcrea;
	}

	public void setNl_usrcrea(String nl_usrcrea) {
		this.nl_usrcrea = nl_usrcrea;
	}

	public LocalDate getNl_feccrea() {
		return nl_feccrea;
	}

	public void setNl_feccrea(LocalDate nl_feccrea) {
		this.nl_feccrea = nl_feccrea;
	}

	public LocalTime getNl_hracrea() {
		return nl_hracrea;
	}

	public void setNl_hracrea(LocalTime nl_hracrea) {
		this.nl_hracrea = nl_hracrea;
	}

	public String getNl_usract() {
		return nl_usract;
	}

	public void setNl_usract(String nl_usract) {
		this.nl_usract = nl_usract;
	}

	public LocalDate getNl_fecact() {
		return nl_fecact;
	}

	public void setNl_fecact(LocalDate nl_fecact) {
		this.nl_fecact = nl_fecact;
	}

	public LocalTime getNl_hraact() {
		return nl_hraact;
	}

	public void setNl_hraact(LocalTime nl_hraact) {
		this.nl_hraact = nl_hraact;
	}

	public lconume(lconumePk pkID, int nl_nume, String nl_usrcrea, LocalDate nl_feccrea, LocalTime nl_hracrea,
			String nl_usract, LocalDate nl_fecact, LocalTime nl_hraact) {
		super();
		this.pkID = pkID;
		this.nl_nume = nl_nume;
		this.nl_usrcrea = nl_usrcrea;
		this.nl_feccrea = nl_feccrea;
		this.nl_hracrea = nl_hracrea;
		this.nl_usract = nl_usract;
		this.nl_fecact = nl_fecact;
		this.nl_hraact = nl_hraact;
	}

	public lconume() {
		super();
	}
	
	

	
	

}
