package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lco0001pcta")
public class lcopcta {

	@Id
	private String pl_cuenta ;
	
	@Column(name="pl_descri")
	private String pl_descri ;
	
	@Column(name="pl_tipcta")
	private String pl_tipcta ;
	
	@Column(name="pl_anexo")
	private String pl_anexo ;
	
	@Column(name="pl_anexo1")
	private String pl_anexo1 ;
	
	@Column(name="pl_anexo2")
	private String pl_anexo2 ;
	
	@Column(name="pl_docref")
	private String pl_docref ;
	
	@Column(name="pl_docref2")
	private String pl_docref2 ;
	
	@Column(name="pl_fecvto")
	private String pl_fecvto ;
	
	@Column(name="pl_mon")
	private String pl_mon ;
	
	@Column(name="pl_area")
	private String pl_area ;
	
	@Column(name="pl_ctaabono")
	private String pl_ctaabono ;
	
	@Column(name="pl_ctacargo")
	private String pl_ctacargo ;
	
	@Column(name="pl_ctaajus")
	private String pl_ctaajus ;
	
	@Column(name="pl_medpag")
	private String pl_medpag ;
	
	@Column(name="pl_ancta")
	private String pl_ancta ;
	
	@Column(name="pl_regcta")
	private String pl_regcta ;
	
	@Column(name="pl_conbco")
	private String pl_conbco ;
	
	@Column(name="pl_ccosto")
	private String pl_ccosto ;
	
	@Column(name="pl_frmbal1")
	private String pl_frmbal1 ;
	
	@Column(name="pl_frmgyp1")
	private String pl_frmgyp1 ;
	
	@Column(name="pl_frmgyn1")
	private String pl_frmgyn1 ;
	
	@Column(name="pl_frmbal2")
	private String pl_frmbal2 ;
	
	@Column(name="pl_frmgyp2")
	private String pl_frmgyp2 ;
	
	@Column(name="pl_frmgyn2")
	private String pl_frmgyn2 ;
	
	@Column(name="pl_frmbal3")
	private String pl_frmbal3 ;
	
	@Column(name="pl_frmgyp3")
	private String pl_frmgyp3 ;
	
	@Column(name="pl_frmgyn3")
	private String pl_frmgyn3 ;
	
	@Column(name="pl_frmCosto")
	private String pl_frmCosto ;
	
	@Column(name="pl_frmfluefec")
	private String pl_frmfluefec ;
	
	@Column(name="pl_adifcbm")
	private String pl_adifcbm ;
	
	@Column(name="pl_catie")
	private String pl_catie ;
	
	@Column(name="pl_traccst")
	private String pl_traccst ;
	
	@Column(name="pl_tasdetret")
	private String pl_tasdetret ;
	
	@Column(name="pl_ctaext")
	private String pl_ctaext ;
	
	@Column(name="pl_estado")
	private String pl_estado ;
	
	@Column(name="pl_usrcrea")
	private String pl_usrcrea ;
	
	@Column(name="pl_feccrea")
	private LocalDate pl_feccrea ;
	
	@Column(name="pl_hracrea")
	private LocalTime pl_hracrea ;
	
	@Column(name="pl_usract")
	private String pl_usract ;
	
	@Column(name="pl_fecact")
	private LocalDate pl_fecact ;
	
	@Column(name="pl_hraact")
	private LocalTime pl_hraact ;

	
	
	
	public lcopcta() {
		super();
	}

	public lcopcta(String pl_cuenta, String pl_descri, String pl_tipcta, String pl_anexo, String pl_anexo1,
			String pl_anexo2, String pl_docref, String pl_docref2, String pl_fecvto, String pl_mon, String pl_area,
			String pl_ctaabono, String pl_ctacargo, String pl_ctaajus, String pl_medpag, String pl_ancta,
			String pl_regcta, String pl_conbco, String pl_ccosto, String pl_frmbal1, String pl_frmgyp1,
			String pl_frmgyn1, String pl_frmbal2, String pl_frmgyp2, String pl_frmgyn2, String pl_frmbal3,
			String pl_frmgyp3, String pl_frmgyn3, String pl_frmCosto, String pl_frmfluefec, String pl_adifcbm,
			String pl_catie, String pl_traccst, String pl_tasdetret, String pl_ctaext, String pl_estado,
			String pl_usrcrea, LocalDate pl_feccrea, LocalTime pl_hracrea, String pl_usract, LocalDate pl_fecact,
			LocalTime pl_hraact) {
		super();
		this.pl_cuenta = pl_cuenta;
		this.pl_descri = pl_descri;
		this.pl_tipcta = pl_tipcta;
		this.pl_anexo = pl_anexo;
		this.pl_anexo1 = pl_anexo1;
		this.pl_anexo2 = pl_anexo2;
		this.pl_docref = pl_docref;
		this.pl_docref2 = pl_docref2;
		this.pl_fecvto = pl_fecvto;
		this.pl_mon = pl_mon;
		this.pl_area = pl_area;
		this.pl_ctaabono = pl_ctaabono;
		this.pl_ctacargo = pl_ctacargo;
		this.pl_ctaajus = pl_ctaajus;
		this.pl_medpag = pl_medpag;
		this.pl_ancta = pl_ancta;
		this.pl_regcta = pl_regcta;
		this.pl_conbco = pl_conbco;
		this.pl_ccosto = pl_ccosto;
		this.pl_frmbal1 = pl_frmbal1;
		this.pl_frmgyp1 = pl_frmgyp1;
		this.pl_frmgyn1 = pl_frmgyn1;
		this.pl_frmbal2 = pl_frmbal2;
		this.pl_frmgyp2 = pl_frmgyp2;
		this.pl_frmgyn2 = pl_frmgyn2;
		this.pl_frmbal3 = pl_frmbal3;
		this.pl_frmgyp3 = pl_frmgyp3;
		this.pl_frmgyn3 = pl_frmgyn3;
		this.pl_frmCosto = pl_frmCosto;
		this.pl_frmfluefec = pl_frmfluefec;
		this.pl_adifcbm = pl_adifcbm;
		this.pl_catie = pl_catie;
		this.pl_traccst = pl_traccst;
		this.pl_tasdetret = pl_tasdetret;
		this.pl_ctaext = pl_ctaext;
		this.pl_estado = pl_estado;
		this.pl_usrcrea = pl_usrcrea;
		this.pl_feccrea = pl_feccrea;
		this.pl_hracrea = pl_hracrea;
		this.pl_usract = pl_usract;
		this.pl_fecact = pl_fecact;
		this.pl_hraact = pl_hraact;
	}

	public String getPl_cuenta() {
		return pl_cuenta;
	}

	public void setPl_cuenta(String pl_cuenta) {
		this.pl_cuenta = pl_cuenta;
	}

	public String getPl_descri() {
		return pl_descri;
	}

	public void setPl_descri(String pl_descri) {
		this.pl_descri = pl_descri;
	}

	public String getPl_tipcta() {
		return pl_tipcta;
	}

	public void setPl_tipcta(String pl_tipcta) {
		this.pl_tipcta = pl_tipcta;
	}

	public String getPl_anexo() {
		return pl_anexo;
	}

	public void setPl_anexo(String pl_anexo) {
		this.pl_anexo = pl_anexo;
	}

	public String getPl_anexo1() {
		return pl_anexo1;
	}

	public void setPl_anexo1(String pl_anexo1) {
		this.pl_anexo1 = pl_anexo1;
	}

	public String getPl_anexo2() {
		return pl_anexo2;
	}

	public void setPl_anexo2(String pl_anexo2) {
		this.pl_anexo2 = pl_anexo2;
	}

	public String getPl_docref() {
		return pl_docref;
	}

	public void setPl_docref(String pl_docref) {
		this.pl_docref = pl_docref;
	}

	public String getPl_docref2() {
		return pl_docref2;
	}

	public void setPl_docref2(String pl_docref2) {
		this.pl_docref2 = pl_docref2;
	}

	public String getPl_fecvto() {
		return pl_fecvto;
	}

	public void setPl_fecvto(String pl_fecvto) {
		this.pl_fecvto = pl_fecvto;
	}

	public String getPl_mon() {
		return pl_mon;
	}

	public void setPl_mon(String pl_mon) {
		this.pl_mon = pl_mon;
	}

	public String getPl_area() {
		return pl_area;
	}

	public void setPl_area(String pl_area) {
		this.pl_area = pl_area;
	}

	public String getPl_ctaabono() {
		return pl_ctaabono;
	}

	public void setPl_ctaabono(String pl_ctaabono) {
		this.pl_ctaabono = pl_ctaabono;
	}

	public String getPl_ctacargo() {
		return pl_ctacargo;
	}

	public void setPl_ctacargo(String pl_ctacargo) {
		this.pl_ctacargo = pl_ctacargo;
	}

	public String getPl_ctaajus() {
		return pl_ctaajus;
	}

	public void setPl_ctaajus(String pl_ctaajus) {
		this.pl_ctaajus = pl_ctaajus;
	}

	public String getPl_medpag() {
		return pl_medpag;
	}

	public void setPl_medpag(String pl_medpag) {
		this.pl_medpag = pl_medpag;
	}

	public String getPl_ancta() {
		return pl_ancta;
	}

	public void setPl_ancta(String pl_ancta) {
		this.pl_ancta = pl_ancta;
	}

	public String getPl_regcta() {
		return pl_regcta;
	}

	public void setPl_regcta(String pl_regcta) {
		this.pl_regcta = pl_regcta;
	}

	public String getPl_conbco() {
		return pl_conbco;
	}

	public void setPl_conbco(String pl_conbco) {
		this.pl_conbco = pl_conbco;
	}

	public String getPl_ccosto() {
		return pl_ccosto;
	}

	public void setPl_ccosto(String pl_ccosto) {
		this.pl_ccosto = pl_ccosto;
	}

	public String getPl_frmbal1() {
		return pl_frmbal1;
	}

	public void setPl_frmbal1(String pl_frmbal1) {
		this.pl_frmbal1 = pl_frmbal1;
	}

	public String getPl_frmgyp1() {
		return pl_frmgyp1;
	}

	public void setPl_frmgyp1(String pl_frmgyp1) {
		this.pl_frmgyp1 = pl_frmgyp1;
	}

	public String getPl_frmgyn1() {
		return pl_frmgyn1;
	}

	public void setPl_frmgyn1(String pl_frmgyn1) {
		this.pl_frmgyn1 = pl_frmgyn1;
	}

	public String getPl_frmbal2() {
		return pl_frmbal2;
	}

	public void setPl_frmbal2(String pl_frmbal2) {
		this.pl_frmbal2 = pl_frmbal2;
	}

	public String getPl_frmgyp2() {
		return pl_frmgyp2;
	}

	public void setPl_frmgyp2(String pl_frmgyp2) {
		this.pl_frmgyp2 = pl_frmgyp2;
	}

	public String getPl_frmgyn2() {
		return pl_frmgyn2;
	}

	public void setPl_frmgyn2(String pl_frmgyn2) {
		this.pl_frmgyn2 = pl_frmgyn2;
	}

	public String getPl_frmbal3() {
		return pl_frmbal3;
	}

	public void setPl_frmbal3(String pl_frmbal3) {
		this.pl_frmbal3 = pl_frmbal3;
	}

	public String getPl_frmgyp3() {
		return pl_frmgyp3;
	}

	public void setPl_frmgyp3(String pl_frmgyp3) {
		this.pl_frmgyp3 = pl_frmgyp3;
	}

	public String getPl_frmgyn3() {
		return pl_frmgyn3;
	}

	public void setPl_frmgyn3(String pl_frmgyn3) {
		this.pl_frmgyn3 = pl_frmgyn3;
	}

	public String getPl_frmCosto() {
		return pl_frmCosto;
	}

	public void setPl_frmCosto(String pl_frmCosto) {
		this.pl_frmCosto = pl_frmCosto;
	}

	public String getPl_frmfluefec() {
		return pl_frmfluefec;
	}

	public void setPl_frmfluefec(String pl_frmfluefec) {
		this.pl_frmfluefec = pl_frmfluefec;
	}

	public String getPl_adifcbm() {
		return pl_adifcbm;
	}

	public void setPl_adifcbm(String pl_adifcbm) {
		this.pl_adifcbm = pl_adifcbm;
	}

	public String getPl_catie() {
		return pl_catie;
	}

	public void setPl_catie(String pl_catie) {
		this.pl_catie = pl_catie;
	}

	public String getPl_traccst() {
		return pl_traccst;
	}

	public void setPl_traccst(String pl_traccst) {
		this.pl_traccst = pl_traccst;
	}

	public String getPl_tasdetret() {
		return pl_tasdetret;
	}

	public void setPl_tasdetret(String pl_tasdetret) {
		this.pl_tasdetret = pl_tasdetret;
	}

	public String getPl_ctaext() {
		return pl_ctaext;
	}

	public void setPl_ctaext(String pl_ctaext) {
		this.pl_ctaext = pl_ctaext;
	}

	public String getPl_estado() {
		return pl_estado;
	}

	public void setPl_estado(String pl_estado) {
		this.pl_estado = pl_estado;
	}

	public String getPl_usrcrea() {
		return pl_usrcrea;
	}

	public void setPl_usrcrea(String pl_usrcrea) {
		this.pl_usrcrea = pl_usrcrea;
	}

	public LocalDate getPl_feccrea() {
		return pl_feccrea;
	}

	public void setPl_feccrea(LocalDate pl_feccrea) {
		this.pl_feccrea = pl_feccrea;
	}

	public LocalTime getPl_hracrea() {
		return pl_hracrea;
	}

	public void setPl_hracrea(LocalTime pl_hracrea) {
		this.pl_hracrea = pl_hracrea;
	}

	public String getPl_usract() {
		return pl_usract;
	}

	public void setPl_usract(String pl_usract) {
		this.pl_usract = pl_usract;
	}

	public LocalDate getPl_fecact() {
		return pl_fecact;
	}

	public void setPl_fecact(LocalDate pl_fecact) {
		this.pl_fecact = pl_fecact;
	}

	public LocalTime getPl_hraact() {
		return pl_hraact;
	}

	public void setPl_hraact(LocalTime pl_hraact) {
		this.pl_hraact = pl_hraact;
	}
	
	
	
	
	
	
	
    
}
