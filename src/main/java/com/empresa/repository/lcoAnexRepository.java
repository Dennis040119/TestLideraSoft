package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcoAnex;
import com.empresa.entity.lcoAnexPk;
import com.empresa.entity.lcotgen;

public interface lcoAnexRepository extends JpaRepository<lcoAnex, lcoAnexPk> {
	
	@Query(value="{call SP_CrudLcoAnex(:opcion, :cia, :al_tipanex, :al_codanex, :al_razsoc,"
			+ " :al_razsoc2, :al_direcc, :al_apelpat, :al_apelmat, :al_prinom, :al_segnom, "
			+  " :al_tipper, :al_tipdocide, :al_nrodocide, :al_domic, :al_repleg, :al_carleg, "
			+  " :al_estado, :al_telf1, :al_telf2, :al_email, :al_host, :al_pais, "
			+  " :al_nacion, :al_tipdetr, :al_tipperc, :al_ubigeo, :al_codmon,:al_estcon,:al_cndcon,:al_numdetr, :al_usrcrea, "
			+ " :al_feccrea, :al_hracrea, :al_usract, :al_fecact, :al_hraact "
			+ ")}"
			, nativeQuery = true)
	List<lcoAnex> listar(@Param("opcion") int option,@Param("cia") String cia,@Param("al_tipanex") String al_tipanex,
	 @Param("al_codanex") String al_codanex, @Param("al_razsoc") String al_razsoc, @Param("al_razsoc2") String al_razsoc2,
	 @Param("al_direcc") String al_direcc,@Param("al_apelpat") String al_apelpat, @Param("al_apelmat") String al_apelmat,
	 @Param("al_prinom") String al_prinom,@Param("al_segnom") String al_segnom,  @Param("al_tipper") String al_tipper,
	 @Param("al_tipdocide") String al_tipdocide, @Param("al_nrodocide") String al_nrodocide,@Param("al_domic") String al_domic,@Param("al_repleg") String al_repleg,
	 @Param("al_carleg") String al_carleg,  @Param("al_estado") String al_estado,  @Param("al_telf1") String al_telf1,
	 @Param("al_telf2") String al_telf2, @Param("al_email") String al_email, @Param("al_host") String al_host,
	 @Param("al_pais") String al_pais, @Param("al_nacion") String al_nacion, @Param("al_tipdetr") String al_tipdetr,
	 @Param("al_tipperc") String al_tipperc, @Param("al_ubigeo") String al_ubigeo, @Param("al_codmon") String al_codmon,
	 @Param("al_estcon") String al_estcon,@Param("al_cndcon") String al_cndcon,@Param("al_numdetr") String al_numdetr,
	 @Param("al_usrcrea") String al_usrcrea,@Param("al_feccrea") LocalDate al_feccrea, @Param("al_hracrea") LocalTime al_hracrea,
     @Param("al_usract") String al_usract,  @Param("al_fecact") LocalDate al_fecact,  @Param("al_hraact") LocalTime al_hraact);
/*------------------------------------------------------------------------------------------------------------------------------------*/
	@Query(value="{call SP_CrudLcoAnex(:opcion, :cia, :al_tipanex, :al_codanex, :al_razsoc,"
			+ " :al_razsoc2, :al_direcc, :al_apelpat, :al_apelmat, :al_prinom, :al_segnom, "
			+  " :al_tipper, :al_tipdocide, :al_nrodocide, :al_domic, :al_repleg, :al_carleg, "
			+  " :al_estado, :al_telf1, :al_telf2, :al_email, :al_host, :al_pais, "
			+  " :al_nacion, :al_tipdetr, :al_tipperc, :al_ubigeo, :al_codmon,:al_estcon,:al_cndcon,:al_numdetr, :al_usrcrea, "
			+ " :al_feccrea, :al_hracrea, :al_usract, :al_fecact, :al_hraact "
			+ ")}"
			, nativeQuery = true)
	@Transactional
	@Modifying
	void RegistrarActu(@Param("opcion") int option,@Param("cia") String cia,@Param("al_tipanex") String al_tipanex,
			 @Param("al_codanex") String al_codanex, @Param("al_razsoc") String al_razsoc, @Param("al_razsoc2") String al_razsoc2,
			 @Param("al_direcc") String al_direcc,@Param("al_apelpat") String al_apelpat, @Param("al_apelmat") String al_apelmat,
			 @Param("al_prinom") String al_prinom,@Param("al_segnom") String al_segnom,  @Param("al_tipper") String al_tipper,
			 @Param("al_tipdocide") String al_tipdocide, @Param("al_nrodocide") String al_nrodocide,@Param("al_domic") String al_domic,@Param("al_repleg") String al_repleg,
			 @Param("al_carleg") String al_carleg,  @Param("al_estado") String al_estado,  @Param("al_telf1") String al_telf1,
			 @Param("al_telf2") String al_telf2, @Param("al_email") String al_email, @Param("al_host") String al_host,
			 @Param("al_pais") String al_pais, @Param("al_nacion") String al_nacion, @Param("al_tipdetr") String al_tipdetr,
			 @Param("al_tipperc") String al_tipperc, @Param("al_ubigeo") String al_ubigeo, @Param("al_codmon") String al_codmon,
			 @Param("al_estcon") String al_estcon,@Param("al_cndcon") String al_cndcon,@Param("al_numdetr") String al_numdetr,
			 @Param("al_usrcrea") String al_usrcrea,@Param("al_feccrea") LocalDate al_feccrea, @Param("al_hracrea") LocalTime al_hracrea,
		     @Param("al_usract") String al_usract,  @Param("al_fecact") LocalDate al_fecact,  @Param("al_hraact") LocalTime al_hraact);
}
