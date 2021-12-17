package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lconume;
import com.empresa.entity.lconumePk;

public interface lconumeRepository extends JpaRepository<lconume, lconumePk>{
	
	@Query(value="{call SP_CrudLcoNume(:opcion, :p_ciacont, :nl_subdia,"
			+ " :nl_anio, :nl_mes, :nl_nume, :nl_usrcrea, :nl_feccrea, :nl_hracrea, :nl_usract,"
			+ " :nl_fecact, :nl_hraact)}", nativeQuery = true)
	List<Object[]> listarNume(@Param("opcion") int opcion,
							 @Param("p_ciacont") String p_ciacont,
							 @Param("nl_subdia") String nl_subdia,
							 @Param("nl_anio") String nl_anio,
							 @Param("nl_mes") String nl_mes,
							 @Param("nl_nume") int nl_nume,
							 @Param("nl_usrcrea") String nl_usrcrea,
							 @Param("nl_feccrea") LocalDate feccrea,
							 @Param("nl_hracrea") LocalTime hracrea,
							 @Param("nl_usract") String nl_usract,
							 @Param("nl_fecact") LocalDate nl_fecact,
							 @Param("nl_hraact") LocalTime nl_hraact);
	
	
	@Query(value="{call SP_CrudLcoNume(:opcion, :p_ciacont, :nl_subdia,"
			+ " :nl_anio, :nl_mes, :nl_nume, :nl_usrcrea, :nl_feccrea, :nl_hracrea, :nl_usract,"
			+ " :nl_fecact, :nl_hraact)}", nativeQuery = true)
	List<lconume> listarNumeEspecifico(@Param("opcion") int opcion,
							  @Param("p_ciacont") String p_ciacont,
							  @Param("nl_subdia") String nl_subdia,
							  @Param("nl_anio") String nl_anio,
							  @Param("nl_mes") String nl_mes,
							  @Param("nl_nume") int nl_nume,
							  @Param("nl_usrcrea") String nl_usrcrea,
							  @Param("nl_feccrea") LocalDate feccrea,
							  @Param("nl_hracrea") LocalTime hracrea,
							  @Param("nl_usract") String nl_usract,
							  @Param("nl_fecact") LocalDate nl_fecact,
							  @Param("nl_hraact") LocalTime nl_hraact);
	
	@Query(value="{call SP_CrudLcoNume(:opcion, :p_ciacont, :nl_subdia,"
			+ " :nl_anio, :nl_mes, :nl_nume, :nl_usrcrea, :nl_feccrea, :nl_hracrea, :nl_usract,"
			+ " :nl_fecact, :nl_hraact)}", nativeQuery = true)
	@Modifying
	@Transactional
	void crearNume(@Param("opcion") int opcion,
							 @Param("p_ciacont") String p_ciacont,
							 @Param("nl_subdia") String nl_subdia,
							 @Param("nl_anio") String nl_anio,
							 @Param("nl_mes") String nl_mes,
							 @Param("nl_nume") int nl_nume,
							 @Param("nl_usrcrea") String nl_usrcrea,
							 @Param("nl_feccrea") LocalDate feccrea,
							 @Param("nl_hracrea") LocalTime hracrea,
							 @Param("nl_usract") String nl_usract,
							 @Param("nl_fecact") LocalDate nl_fecact,
							 @Param("nl_hraact") LocalTime nl_hraact);
	
	@Query(value="{call SP_CrudLcoNume(:opcion, :p_ciacont, :nl_subdia,"
			+ " :nl_anio, :nl_mes, :nl_nume, :nl_usrcrea, :nl_feccrea, :nl_hracrea, :nl_usract,"
			+ " :nl_fecact, :nl_hraact)}", nativeQuery = true)
	@Modifying
	@Transactional
	void editarNume(@Param("opcion") int opcion,
							 @Param("p_ciacont") String p_ciacont,
							 @Param("nl_subdia") String nl_subdia,
							 @Param("nl_anio") String nl_anio,
							 @Param("nl_mes") String nl_mes,
							 @Param("nl_nume") int nl_nume,
							 @Param("nl_usrcrea") String nl_usrcrea,
							 @Param("nl_feccrea") LocalDate feccrea,
							 @Param("nl_hracrea") LocalTime hracrea,
							 @Param("nl_usract") String nl_usract,
							 @Param("nl_fecact") LocalDate nl_fecact,
							 @Param("nl_hraact") LocalTime nl_hraact);
	
	@Query(value="{call SP_CrudLcoNume(:opcion, :p_ciacont, :nl_subdia,"
			+ " :nl_anio, :nl_mes, :nl_nume, :nl_usrcrea, :nl_feccrea, :nl_hracrea, :nl_usract,"
			+ " :nl_fecact, :nl_hraact)}", nativeQuery = true)
	@Modifying
	@Transactional
	void eliminarRegistroNume(@Param("opcion") int opcion,
							 @Param("p_ciacont") String p_ciacont,
							 @Param("nl_subdia") String nl_subdia,
							 @Param("nl_anio") String nl_anio,
							 @Param("nl_mes") String nl_mes,
							 @Param("nl_nume") int nl_nume,
							 @Param("nl_usrcrea") String nl_usrcrea,
							 @Param("nl_feccrea") LocalDate feccrea,
							 @Param("nl_hracrea") LocalTime hracrea,
							 @Param("nl_usract") String nl_usract,
							 @Param("nl_fecact") LocalDate nl_fecact,
							 @Param("nl_hraact") LocalTime nl_hraact);

}
