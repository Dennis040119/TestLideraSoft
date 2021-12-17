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


import com.empresa.entity.lcoCias;

@Repository
public interface lcoCiasRepository extends JpaRepository<lcoCias, String> {
	
	@Query(value="{call SP_CrudLcocias(:opcion,:cl_codcia, :cl_desc1, :cl_desc2, :cl_nruc, :cl_telef, :cl_email, "
			+ ":cl_host, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract, :cl_fecact, :cl_hraact, :cl_estado)}"
			, nativeQuery = true)
	List<lcoCias> listar(@Param("opcion") int option,
			                  @Param("cl_codcia") String cl_codcia,
			                  @Param("cl_desc1") String cl_desc1,
			                  @Param("cl_desc2") String cl_desc2,
			                  @Param("cl_nruc") String cl_nruc,
			                  @Param("cl_telef") String cl_telef,
			                  @Param("cl_email") String cl_email,
			                  @Param("cl_host") String cl_host,
			                  @Param("cl_usrcrea") String cl_usrcrea,
			                  @Param("cl_feccrea") LocalDate cl_feccrea,
			                  @Param("cl_hracrea") LocalTime cl_hracrea,
			                  @Param("cl_usract") String cl_usract,
			                  @Param("cl_fecact") LocalDate cl_fecact,
			                  @Param("cl_hraact") LocalTime cl_hraact,
			                  @Param("cl_estado") String cl_estado);
	
	@Query(value="{call SP_CrudLcocias(:opcion,:cl_codcia, :cl_desc1, :cl_desc2, :cl_nruc, :cl_telef, :cl_email, "
			+ ":cl_host, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract, :cl_fecact, :cl_hraact, :cl_estado)}"
			, nativeQuery = true)
	@Transactional
	@Modifying
	void Registrar(@Param("opcion") int option,
			                  @Param("cl_codcia") String cl_codcia,
			                  @Param("cl_desc1") String cl_desc1,
			                  @Param("cl_desc2") String cl_desc2,
			                  @Param("cl_nruc") String cl_nruc,
			                  @Param("cl_telef") String cl_telef,
			                  @Param("cl_email") String cl_email,
			                  @Param("cl_host") String cl_host,
			                  @Param("cl_usrcrea") String cl_usrcrea,
			                  @Param("cl_feccrea") LocalDate cl_feccrea,
			                  @Param("cl_hracrea") LocalTime cl_hracrea,
			                  @Param("cl_usract") String cl_usract,
			                  @Param("cl_fecact") LocalDate cl_fecact,
			                  @Param("cl_hraact") LocalTime cl_hraact,
			                  @Param("cl_estado") String cl_estado);

}
