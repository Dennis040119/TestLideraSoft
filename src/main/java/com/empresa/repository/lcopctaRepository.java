package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcopcta;


public interface lcopctaRepository extends JpaRepository<lcopcta, String> {

	@Query(value="{call SP_CrudLcoPcta(:opcion, :tablename, "
		/*1*/	+ ":pl_cuenta, :pl_descri, :pl_tipcta,"
		/*2*/	+ ":pl_anexo, :pl_anexo1, :pl_anexo2, :pl_docref, :pl_docref2,:pl_fecvto, :pl_mon, :pl_area, "
		/*3*/	+ ":pl_ctaabono, :pl_ctacargo, :pl_ctaajus, :pl_medpag, :pl_ancta, :pl_regcta, :pl_conbco,:pl_ccosto,"
		/*4*/	+ ":pl_frmbal1, :pl_frmgyp1, :pl_frmgyn1, :pl_frmbal2, :pl_frmgyp2, :pl_frmgyn2, :pl_frmbal3,"
		/*5*/	+ ":pl_frmgyp3, :pl_frmgyn3, :pl_frmCosto, :pl_frmfluefec, :pl_adifcbm, :pl_catie,:pl_traccst, :pl_tasdetret,:pl_ctaext, "
		/*6*/	+ ":pl_estado, :pl_usrcrea, :pl_feccrea, :pl_hracrea, :pl_usract, :pl_fecact, :pl_hraact"
				+ ")}", nativeQuery = true)
	List<lcopcta> listAll(@Param("opcion") int option,@Param("tablename") String tablename,
/*1*/@Param("pl_cuenta") String pl_cuenta, @Param("pl_descri") String pl_descri,@Param("pl_tipcta") String pl_tipcta,
/*2*/@Param("pl_anexo") String pl_anexo,@Param("pl_anexo1") String pl_anexo1, @Param("pl_anexo2") String pl_anexo2,
/*2*/@Param("pl_docref") String pl_docref,@Param("pl_docref2") String pl_docref2,@Param("pl_fecvto") String pl_fecvto,@Param("pl_mon") String pl_mon, @Param("pl_area") String pl_area,
/*3*/@Param("pl_ctaabono") String pl_ctaabono,@Param("pl_ctacargo") String pl_ctacargo,@Param("pl_ctaajus") String pl_ctaajus,
/*3*/@Param("pl_medpag") String pl_medpag,@Param("pl_ancta") String pl_ancta,@Param("pl_regcta") String pl_regcta,@Param("pl_conbco") String pl_conbco,@Param("pl_ccosto") String pl_ccosto,
/*4*/@Param("pl_frmbal1") String pl_frmbal1,@Param("pl_frmgyp1") String pl_frmgyp1,@Param("pl_frmgyn1") String pl_frmgyn1,@Param("pl_frmbal2") String pl_frmbal2,
/*4*/@Param("pl_frmgyp2") String pl_frmgyp2,@Param("pl_frmgyn2") String pl_frmgyn2,@Param("pl_frmbal3") String pl_frmbal3,
/*5*/@Param("pl_frmgyp3") String pl_frmgyp3,@Param("pl_frmgyn3") String pl_frmgyn3, @Param("pl_frmCosto") String pl_frmCosto,@Param("pl_frmfluefec") String pl_frmfluefec,
/*5*/@Param("pl_adifcbm") String pl_adifcbm,@Param("pl_catie") String pl_catie,@Param("pl_traccst") String pl_traccst,@Param("pl_tasdetret") String pl_tasdetret,@Param("pl_ctaext") String pl_ctaext,
/*6*/@Param("pl_estado") String pl_estado, @Param("pl_usrcrea") String pl_usrcrea,@Param("pl_feccrea") LocalDate pl_feccrea,
/*6*/ @Param("pl_hracrea") LocalTime pl_hracrea,@Param("pl_usract") String pl_usract,@Param("pl_fecact") LocalDate pl_fecact, @Param("pl_hraact") LocalTime pl_hraact
			); 
	
	
	@Query(value="{call SP_CrudLcoPcta(:opcion, :tablename, "
			/*1*/	+ ":pl_cuenta, :pl_descri, :pl_tipcta,"
			/*2*/	+ ":pl_anexo, :pl_anexo1, :pl_anexo2, :pl_docref, :pl_docref2,:pl_fecvto, :pl_mon, :pl_area, "
			/*3*/	+ ":pl_ctaabono, :pl_ctacargo, :pl_ctaajus, :pl_medpag, :pl_ancta, :pl_regcta, :pl_conbco,:pl_ccosto,"
			/*4*/	+ ":pl_frmbal1, :pl_frmgyp1, :pl_frmgyn1, :pl_frmbal2, :pl_frmgyp2, :pl_frmgyn2, :pl_frmbal3,"
			/*5*/	+ ":pl_frmgyp3, :pl_frmgyn3, :pl_frmCosto, :pl_frmfluefec, :pl_adifcbm, :pl_catie,:pl_traccst, :pl_tasdetret,:pl_ctaext, "
			/*6*/	+ ":pl_estado, :pl_usrcrea, :pl_feccrea, :pl_hracrea, :pl_usract, :pl_fecact, :pl_hraact"
					+ ")}", nativeQuery = true)
	@Transactional
	@Modifying
		void RegistraPL(@Param("opcion") int option,@Param("tablename") String tablename,
				/*1*/@Param("pl_cuenta") String pl_cuenta, @Param("pl_descri") String pl_descri,@Param("pl_tipcta") String pl_tipcta,
				/*2*/@Param("pl_anexo") String pl_anexo,@Param("pl_anexo1") String pl_anexo1, @Param("pl_anexo2") String pl_anexo2,
				/*2*/@Param("pl_docref") String pl_docref,@Param("pl_docref2") String pl_docref2,@Param("pl_fecvto") String pl_fecvto,@Param("pl_mon") String pl_mon, @Param("pl_area") String pl_area,
				/*3*/@Param("pl_ctaabono") String pl_ctaabono,@Param("pl_ctacargo") String pl_ctacargo,@Param("pl_ctaajus") String pl_ctaajus,
				/*3*/@Param("pl_medpag") String pl_medpag,@Param("pl_ancta") String pl_ancta,@Param("pl_regcta") String pl_regcta,@Param("pl_conbco") String pl_conbco,@Param("pl_ccosto") String pl_ccosto,
				/*4*/@Param("pl_frmbal1") String pl_frmbal1,@Param("pl_frmgyp1") String pl_frmgyp1,@Param("pl_frmgyn1") String pl_frmgyn1,@Param("pl_frmbal2") String pl_frmbal2,
				/*4*/@Param("pl_frmgyp2") String pl_frmgyp2,@Param("pl_frmgyn2") String pl_frmgyn2,@Param("pl_frmbal3") String pl_frmbal3,
				/*5*/@Param("pl_frmgyp3") String pl_frmgyp3,@Param("pl_frmgyn3") String pl_frmgyn3, @Param("pl_frmCosto") String pl_frmCosto,@Param("pl_frmfluefec") String pl_frmfluefec,
				/*5*/@Param("pl_adifcbm") String pl_adifcbm,@Param("pl_catie") String pl_catie,@Param("pl_traccst") String pl_traccst,@Param("pl_tasdetret") String pl_tasdetret,@Param("pl_ctaext") String pl_ctaext,
				/*6*/@Param("pl_estado") String pl_estado, @Param("pl_usrcrea") String pl_usrcrea,@Param("pl_feccrea") LocalDate pl_feccrea,
				/*6*/ @Param("pl_hracrea") LocalTime pl_hracrea,@Param("pl_usract") String pl_usract,@Param("pl_fecact") LocalDate pl_fecact, @Param("pl_hraact") LocalTime pl_hraact
);
	
}
