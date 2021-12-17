package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoEjer;
import com.empresa.entity.lcoEjerPk;


@Repository
public interface lcoEjerRepository extends JpaRepository<lcoEjer, lcoEjerPk> {

	
	@Query(value="{call SP_CrudLcoEjer(:opcion, :el_codcia, :el_ejerc, :el_usrcrea, :el_feccrea,"
			+ " :el_hracrea, :el_usract, :el_fecact, :el_hraact, :el_estado)}"
			, nativeQuery = true)
	List<lcoEjer> listar(@Param("opcion") int option,
			                  @Param("el_codcia") String el_codcia,
			                  @Param("el_ejerc") String el_ejerc,
			                  @Param("el_usrcrea") String el_usrcrea,
			                  @Param("el_feccrea") LocalDate el_feccrea,
			                  @Param("el_hracrea") LocalTime el_hracrea,
			                  @Param("el_usract") String el_usract,
			                  @Param("el_fecact") LocalDate el_fecact,
			                  @Param("el_hraact") LocalTime el_hraact,
			                  @Param("el_estado") String el_estado);
	
	@Query(value="{call SP_CrudLcoEjer(:opcion, :el_codcia, :el_ejerc, :el_usrcrea, :el_feccrea,"
			+ " :el_hracrea, :el_usract, :el_fecact, :el_hraact, :el_estado)}"
			, nativeQuery = true)
	@Transactional
	@Modifying
	void registrar(@Param("opcion") int option,
			                  @Param("el_codcia") String el_codcia,
			                  @Param("el_ejerc") String el_ejerc,
			                  @Param("el_usrcrea") String el_usrcrea,
			                  @Param("el_feccrea") LocalDate el_feccrea,
			                  @Param("el_hracrea") LocalTime el_hracrea,
			                  @Param("el_usract") String el_usract,
			                  @Param("el_fecact") LocalDate el_fecact,
			                  @Param("el_hraact") LocalTime el_hraact,
			                  @Param("el_estado") String el_estado);
			                  
}
