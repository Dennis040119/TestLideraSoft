use lcon11111111111;
----------------------------------------------------------------
/*Procedure Crud Plan de cuentas*/

DROP PROCEDURE SP_CrudLcoPcta;  
DELIMITER $$
CREATE PROCEDURE SP_CrudLcoPcta(/*40 parametros*/
	opcion int, 
	cia VARCHAR(50),
    pl_cuenta char(12),pl_descri char(80),pl_tipcta char(1),pl_anexo char(1),pl_anexo1  char(1),pl_anexo2  char(1),
	pl_docref char(1),pl_docref2 char(1),pl_fecvto char(1),pl_mon  char(2),pl_area char(1),pl_ctaabono char(12),pl_ctacargo char(12),pl_ctaajus char(1),
	pl_medpag char(1),pl_ancta char(1),pl_regcta char(1),pl_conbco char(1),pl_ccosto char(1),pl_frmbal1 char(5),pl_frmgyp1 char(5),pl_frmgyn1 char(5),pl_frmbal2 char(5),
    pl_frmgyp2 char(5),pl_frmgyn2 char(5),pl_frmbal3 char(5),pl_frmgyp3 char(5),pl_frmgyn3 char(5),pl_frmCosto char(5),pl_frmfluefec char(5),
    pl_adifcbm char(1),pl_catie char(1),pl_traccst char(1),pl_tasdetret  char(1),pl_ctaext varchar(15),pl_estado char(1),pl_usrcrea  varchar(10),pl_feccrea date,
    pl_hracrea time,pl_usract varchar(10),pl_fecact date, pl_hraact time)
BEGIN
    
    CASE opcion
		WHEN  '0' THEN
         if pl_cuenta='' then  
			SET @sql_text = concat('select * from lco',cia,'pcta where pl_estado = "V" Order by pl_cuenta');
		else 
            SET @sql_text = concat('select * from lco',cia,'pcta where pl_cuenta like "',pl_cuenta,'" and pl_estado ='," 'V' Order by pl_cuenta");
			end if;
			PREPARE stmt FROM @sql_text;
			EXECUTE stmt;
		when '1' THEN
			SET @sql_text = concat('insert into lco',cia,'pcta values("' ,pl_cuenta,'","' 
            ,pl_descri,'","' ,pl_tipcta,'","',pl_anexo,'","',pl_anexo1,'","' 
            ,pl_anexo2,'","' ,pl_docref,'","' ,pl_docref2,'","' ,pl_fecvto,'","',pl_mon,'","'
            ,pl_area,'","' ,pl_ctaabono,'","' ,pl_ctacargo,'","' ,pl_ctaajus,'","',pl_medpag,'","'
            ,pl_ancta,'","' ,pl_regcta,'","' ,pl_conbco,'","',pl_ccosto,'","',pl_frmbal1,'","',pl_frmgyp1,'","'
            ,pl_frmgyn1,'","',pl_frmbal2,'","',pl_frmgyp2,'","',pl_frmgyn2,'","',pl_frmbal3,'","'
            ,pl_frmgyp3,'","',pl_frmgyn3,'","',pl_frmCosto,'","',pl_frmfluefec,'","',pl_adifcbm,'","'
            ,pl_catie,'","',pl_traccst,'","',pl_tasdetret,'","',pl_ctaext,'","',pl_estado,'","',pl_usrcrea,'","',pl_feccrea,'","'
            ,pl_hracrea,'","',pl_usract,'","' ,pl_fecact,'","',pl_hraact,'");');
		  PREPARE stmt1 FROM @sql_text;
          EXECUTE stmt1;
         
		WHEN '2' THEN
			SET @sql_text = concat('UPDATE lco',cia,'pcta SET pl_descri = "',pl_descri, 
            '",pl_tipcta = "',pl_tipcta,'",pl_anexo ="',pl_anexo,'",pl_anexo1 ="',pl_anexo1,
            '",pl_anexo2 ="',pl_anexo2,'",pl_docref = "',pl_docref, '",pl_docref2 = "',pl_docref2,
            '",pl_fecvto = "',pl_fecvto, '",pl_mon ="',pl_mon, '",pl_area ="',pl_area, 
            '",pl_ctaabono = "',pl_ctaabono,'",pl_ctacargo = "',pl_ctacargo, '",pl_ctaajus ="',pl_ctaajus,
            '",pl_medpag ="',pl_medpag, '",pl_ancta = "',pl_ancta, '",pl_regcta = "',pl_regcta,'",pl_regcta ="',pl_regcta,
            '",pl_conbco ="',pl_conbco, '",pl_ccosto ="',pl_ccosto,'",pl_frmbal1 = "',pl_frmbal1, '",pl_frmgyp1 = "',pl_frmgyp1,
            '",pl_frmgyn1 ="',pl_frmgyn1,'",pl_frmbal2 ="',pl_frmbal2, '",pl_frmgyp2 = "',pl_frmgyp2,
            '",pl_frmgyn2 = "',pl_frmgyn2,'",pl_frmbal3 ="',pl_frmbal3,'",pl_frmgyp3 ="',pl_frmgyp3,
            '",pl_frmgyn3 = "',pl_frmgyn3,'",pl_frmCosto = "',pl_frmCosto,'",pl_frmfluefec ="',pl_frmfluefec,
            '",pl_adifcbm ="',pl_adifcbm,'",pl_catie = "',pl_catie,'",pl_traccst = "',pl_traccst,'",pl_tasdetret = "',pl_tasdetret,'",pl_ctaext = "',pl_ctaext,'",pl_estado ="',pl_estado,
            '",pl_usract = "',pl_usract,
            '",pl_fecact = "',pl_fecact, '",pl_hraact ="',pl_hraact,'"  where pl_cuenta = "',pl_cuenta,'"');
			PREPARE stmt1 FROM @sql_text;
			EXECUTE stmt1;
		WHEN '3' THEN
			SET @sql_text = concat('update  lco',cia,'pcta set pl_estado= "A" ,pl_usract = "',pl_usract,
            '",pl_fecact = "',pl_fecact, '",pl_hraact ="',pl_hraact,'" WHERE pl_cuenta = ',"'",pl_cuenta,"'");
			PREPARE stmt FROM @sql_text;
			EXECUTE stmt;
            
        WHEN '5' THEN
			SET @sql_text = concat('select * from lco',cia,'pcta where pl_cuenta like "',pl_cuenta,'"');
			PREPARE stmt FROM @sql_text;
			EXECUTE stmt;    
		
	END CASE;
END$$

DELIMITER ;



call SP_CrudLcoPcta(5,'0001','66678','Plan de cuenta 300','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'
'1','1','1','1','V','usercrea','2011-12-18','13:17:17','userract','2011-12-13','13:10:10');

insert into lco0001pcta values('pl03','Plan de cuenta 1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'
'1','1','1','V','userCrea','2011-12-18','13:17:17','userract','2011-12-18','13:17:17');


select*from lco0001pcta;
select * from lco0001pcta where pl_estado = "V" Order by pl_cuenta