package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

//CLASE QUE REPRESENTA UNA TABLA DE LA BASE DE DATOS
@Data
@Entity
@Table(name="lco0001tgen")
public class lcotgen {

	@EmbeddedId
	private lcotgenPk pkID;
	
		@Column(name="tl_descri")
		private String tl_descri;
		
		@Column(name="tl_descri2")
		private String tl_descri2;
		
		@Column(name="tl_usrcrea")
		private String tl_usrcrea;
		
		@Column(name="tl_feccrea")
		private LocalDate tl_feccrea;
		
		@Column(name="tl_hracrea")
		private LocalTime tl_hracrea;
		
		@Column(name="tl_usract")
		private String tl_usract;
		
		@Column(name="tl_fecact")
		private LocalDate tl_fecact;
		
		@Column(name="tl_hraact")
		private LocalTime tl_hraact;

		public lcotgenPk getPkID() {
			return pkID;
		}

		public void setPkID(lcotgenPk pkID) {
			this.pkID = pkID;
		}

		public String getTl_descri() {
			return tl_descri;
		}

		public void setTl_descri(String tl_descri) {
			this.tl_descri = tl_descri;
		}

		public String getTl_descri2() {
			return tl_descri2;
		}

		public void setTl_descri2(String tl_descri2) {
			this.tl_descri2 = tl_descri2;
		}

		public String getTl_usrcrea() {
			return tl_usrcrea;
		}

		public void setTl_usrcrea(String tl_usrcrea) {
			this.tl_usrcrea = tl_usrcrea;
		}

		public LocalDate getTl_feccrea() {
			return tl_feccrea;
		}

		public void setTl_feccrea(LocalDate tl_feccrea) {
			this.tl_feccrea = tl_feccrea;
		}

		public LocalTime getTl_hracrea() {
			return tl_hracrea;
		}

		public void setTl_hracrea(LocalTime tl_hracrea) {
			this.tl_hracrea = tl_hracrea;
		}

		public String getTl_usract() {
			return tl_usract;
		}

		public void setTl_usract(String tl_usract) {
			this.tl_usract = tl_usract;
		}

		public LocalDate getTl_fecact() {
			return tl_fecact;
		}

		public void setTl_fecact(LocalDate tl_fecact) {
			this.tl_fecact = tl_fecact;
		}

		public LocalTime getTl_hraact() {
			return tl_hraact;
		}

		public void setTl_hraact(LocalTime tl_hraact) {
			this.tl_hraact = tl_hraact;
		}

		public lcotgen(lcotgenPk pkID, String tl_descri, String tl_descri2, String tl_usrcrea, LocalDate tl_feccrea,
				LocalTime tl_hracrea, String tl_usract, LocalDate tl_fecact, LocalTime tl_hraact) {
			super();
			this.pkID = pkID;
			this.tl_descri = tl_descri;
			this.tl_descri2 = tl_descri2;
			this.tl_usrcrea = tl_usrcrea;
			this.tl_feccrea = tl_feccrea;
			this.tl_hracrea = tl_hracrea;
			this.tl_usract = tl_usract;
			this.tl_fecact = tl_fecact;
			this.tl_hraact = tl_hraact;
		}

		public lcotgen() {
			super();
		}

		
		
		

	
	
	
	
	
	

	
	
}
