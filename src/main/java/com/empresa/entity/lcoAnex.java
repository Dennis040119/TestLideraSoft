package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lco0001anex")
public class lcoAnex {
	

	@EmbeddedId
	private lcoAnexPk pkID;
	
	private String al_razsoc;

	
	private String al_razsoc2;

	private String al_direcc;

	private String al_apelpat;

	private String al_apelmat;

	private String al_prinom;

	private String al_segnom;

	private String al_tipper;

	private String al_tipdocide;

	private String al_nrodocide;

	private String al_domic;

	private String al_repleg;

	private String al_carleg;

	private String al_estado;

	private String al_telf1;

	private String al_telf2;

	private String al_email;

	private String al_host;

	private String al_pais;

	private String al_nacion;

	private String al_tipdetr;

	private String al_tipperc;

	private String al_ubigeo;

	private String al_codmon;

	private String al_estcon;
	
	private String al_cndcon;
	
	private String al_numdetr;
	
	private String al_usrcrea;

	private LocalDate al_feccrea;

	private LocalTime al_hracrea;

	private String al_usract;

	private LocalDate al_fecact;

	private LocalTime al_hraact;
	
	
	public lcoAnex() {
		super();
	}
	
	public lcoAnex(lcoAnexPk pkID, String al_razsoc, String al_razsoc2, String al_direcc, String al_apelpat,
			String al_apelmat, String al_prinom, String al_segnom, String al_tipper, String al_tipdocide,
			String al_nrodocide, String al_domic, String al_repleg, String al_carleg, String al_estado, String al_telf1,
			String al_telf2, String al_email, String al_host, String al_pais, String al_nacion, String al_tipdetr,
			String al_tipperc, String al_ubigeo, String al_codmon, String al_estcon, String al_cndcon,
			String al_numdetr, String al_usrcrea, LocalDate al_feccrea, LocalTime al_hracrea, String al_usract,
			LocalDate al_fecact, LocalTime al_hraact) {
		super();
		this.pkID = pkID;
		this.al_razsoc = al_razsoc;
		this.al_razsoc2 = al_razsoc2;
		this.al_direcc = al_direcc;
		this.al_apelpat = al_apelpat;
		this.al_apelmat = al_apelmat;
		this.al_prinom = al_prinom;
		this.al_segnom = al_segnom;
		this.al_tipper = al_tipper;
		this.al_tipdocide = al_tipdocide;
		this.al_nrodocide = al_nrodocide;
		this.al_domic = al_domic;
		this.al_repleg = al_repleg;
		this.al_carleg = al_carleg;
		this.al_estado = al_estado;
		this.al_telf1 = al_telf1;
		this.al_telf2 = al_telf2;
		this.al_email = al_email;
		this.al_host = al_host;
		this.al_pais = al_pais;
		this.al_nacion = al_nacion;
		this.al_tipdetr = al_tipdetr;
		this.al_tipperc = al_tipperc;
		this.al_ubigeo = al_ubigeo;
		this.al_codmon = al_codmon;
		this.al_estcon = al_estcon;
		this.al_cndcon = al_cndcon;
		this.al_numdetr = al_numdetr;
		this.al_usrcrea = al_usrcrea;
		this.al_feccrea = al_feccrea;
		this.al_hracrea = al_hracrea;
		this.al_usract = al_usract;
		this.al_fecact = al_fecact;
		this.al_hraact = al_hraact;
	}




	public lcoAnexPk getPkID() {
		return pkID;
	}

	public void setPkID(lcoAnexPk pkID) {
		this.pkID = pkID;
	}

	public String getAl_razsoc() {
		return al_razsoc;
	}

	public void setAl_razsoc(String al_razsoc) {
		this.al_razsoc = al_razsoc;
	}

	public String getAl_razsoc2() {
		return al_razsoc2;
	}

	public void setAl_razsoc2(String al_razsoc2) {
		this.al_razsoc2 = al_razsoc2;
	}

	public String getAl_direcc() {
		return al_direcc;
	}

	public void setAl_direcc(String al_direcc) {
		this.al_direcc = al_direcc;
	}

	public String getAl_apelpat() {
		return al_apelpat;
	}

	public void setAl_apelpat(String al_apelpat) {
		this.al_apelpat = al_apelpat;
	}

	public String getAl_apelmat() {
		return al_apelmat;
	}

	public void setAl_apelmat(String al_apelmat) {
		this.al_apelmat = al_apelmat;
	}

	public String getAl_prinom() {
		return al_prinom;
	}

	public void setAl_prinom(String al_prinom) {
		this.al_prinom = al_prinom;
	}

	public String getAl_segnom() {
		return al_segnom;
	}

	public void setAl_segnom(String al_segnom) {
		this.al_segnom = al_segnom;
	}

	public String getAl_tipper() {
		return al_tipper;
	}

	public void setAl_tipper(String al_tipper) {
		this.al_tipper = al_tipper;
	}

	public String getAl_tipdocide() {
		return al_tipdocide;
	}

	public void setAl_tipdocide(String al_tipdocide) {
		this.al_tipdocide = al_tipdocide;
	}

	public String getAl_nrodocide() {
		return al_nrodocide;
	}

	public void setAl_nrodocide(String al_nrodocide) {
		this.al_nrodocide = al_nrodocide;
	}

	public String getAl_domic() {
		return al_domic;
	}

	public void setAl_domic(String al_domic) {
		this.al_domic = al_domic;
	}

	public String getAl_repleg() {
		return al_repleg;
	}

	public void setAl_repleg(String al_repleg) {
		this.al_repleg = al_repleg;
	}

	public String getAl_carleg() {
		return al_carleg;
	}

	public void setAl_carleg(String al_carleg) {
		this.al_carleg = al_carleg;
	}

	public String getAl_estado() {
		return al_estado;
	}

	public void setAl_estado(String al_estado) {
		this.al_estado = al_estado;
	}

	public String getAl_telf1() {
		return al_telf1;
	}

	public void setAl_telf1(String al_telf1) {
		this.al_telf1 = al_telf1;
	}

	public String getAl_telf2() {
		return al_telf2;
	}

	public void setAl_telf2(String al_telf2) {
		this.al_telf2 = al_telf2;
	}

	public String getAl_email() {
		return al_email;
	}

	public void setAl_email(String al_email) {
		this.al_email = al_email;
	}

	public String getAl_host() {
		return al_host;
	}

	public void setAl_host(String al_host) {
		this.al_host = al_host;
	}

	public String getAl_pais() {
		return al_pais;
	}

	public void setAl_pais(String al_pais) {
		this.al_pais = al_pais;
	}

	public String getAl_nacion() {
		return al_nacion;
	}

	public void setAl_nacion(String al_nacion) {
		this.al_nacion = al_nacion;
	}

	public String getAl_tipdetr() {
		return al_tipdetr;
	}

	public void setAl_tipdetr(String al_tipdetr) {
		this.al_tipdetr = al_tipdetr;
	}

	public String getAl_tipperc() {
		return al_tipperc;
	}

	public void setAl_tipperc(String al_tipperc) {
		this.al_tipperc = al_tipperc;
	}

	public String getAl_ubigeo() {
		return al_ubigeo;
	}

	public void setAl_ubigeo(String al_ubigeo) {
		this.al_ubigeo = al_ubigeo;
	}

	public String getAl_codmon() {
		return al_codmon;
	}

	public void setAl_codmon(String al_codmon) {
		this.al_codmon = al_codmon;
	}

	public String getAl_estcon() {
		return al_estcon;
	}

	public void setAl_estcon(String al_estcon) {
		this.al_estcon = al_estcon;
	}

	public String getAl_cndcon() {
		return al_cndcon;
	}

	public void setAl_cndcon(String al_cndcon) {
		this.al_cndcon = al_cndcon;
	}

	public String getAl_numdetr() {
		return al_numdetr;
	}

	public void setAl_numdetr(String al_numdetr) {
		this.al_numdetr = al_numdetr;
	}

	public String getAl_usrcrea() {
		return al_usrcrea;
	}

	public void setAl_usrcrea(String al_usrcrea) {
		this.al_usrcrea = al_usrcrea;
	}

	public LocalDate getAl_feccrea() {
		return al_feccrea;
	}

	public void setAl_feccrea(LocalDate al_feccrea) {
		this.al_feccrea = al_feccrea;
	}

	public LocalTime getAl_hracrea() {
		return al_hracrea;
	}

	public void setAl_hracrea(LocalTime al_hracrea) {
		this.al_hracrea = al_hracrea;
	}

	public String getAl_usract() {
		return al_usract;
	}

	public void setAl_usract(String al_usract) {
		this.al_usract = al_usract;
	}

	public LocalDate getAl_fecact() {
		return al_fecact;
	}

	public void setAl_fecact(LocalDate al_fecact) {
		this.al_fecact = al_fecact;
	}

	public LocalTime getAl_hraact() {
		return al_hraact;
	}

	public void setAl_hraact(LocalTime al_hraact) {
		this.al_hraact = al_hraact;
	}

	
	
	
	

}
