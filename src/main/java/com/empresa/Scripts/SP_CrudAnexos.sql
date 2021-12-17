
/*Procedure Crud tabla anexo*/



DROP PROCEDURE SP_CrudLcoAnex;  
DELIMITER $$
CREATE PROCEDURE SP_CrudLcoAnex(#33 parametros
	opcion int, 
	cia VARCHAR(50),al_tipanex char(1),al_codanex varchar(18),al_razsoc varchar(100),al_razsoc2 varchar(100),al_direcc  varchar(150),
	al_apelpat varchar(40),al_apelmat varchar(40),al_prinom varchar(40),al_segnom  varchar(40),al_tipper char(1),al_tipdocide char(2),al_nrodocide varchar(20),
    al_domic  char(2),al_repleg varchar(100),al_carleg varchar(30),al_estado char(1),al_telf1  varchar(25),al_telf2 varchar(25),
    al_email varchar(100),al_host varchar(100),al_pais char(5),al_nacion  char(6),al_tipdetr char(8),al_tipperc char(8),al_ubigeo char(6),al_codmon char(2),
    al_estcon varchar(20) , al_cndcon varchar(20), al_numdetr varchar(30),
    al_usrcrea varchar(10),al_feccrea date,al_hracrea time,al_usract varchar(10),al_fecact date,al_hraact time
	)
BEGIN

    CASE opcion
    
		WHEN  '0' THEN	
		   if al_tipanex like '' and al_codanex like '' then    
				SET @sql_text = concat('select * from lco',cia,'anex where al_estado="V" order by al_tipanex');
				
			else
				if al_codanex='' then
					SET @sql_text = concat('select * from lco',cia,'anex where al_tipanex like "',al_tipanex,'" and al_estado="V" order by al_tipanex');
				
				else
					SET @sql_text = concat('select * from lco',cia,'anex where al_tipanex like "',al_tipanex,'" and al_codanex like "', al_codanex ,'" and al_estado="V" order by al_tipanex'); 
			end if;
		end if;
		PREPARE stmt FROM @sql_text;
		EXECUTE stmt;
         
		WHEN '1' THEN
			SET @sql_text = concat('insert into lco',cia,'anex values("' ,al_tipanex,'","' 
            ,al_codanex,'","',al_razsoc,'","' ,al_razsoc2,'","' ,al_direcc,'","' ,al_apelpat,'","'
            ,al_apelmat,'","' ,al_prinom,'","' ,al_segnom,'","' ,al_tipper,'","',al_tipdocide,'","' 
            ,al_nrodocide,'","' ,al_domic,'","' ,al_repleg,'","',al_carleg,'","' ,al_estado,'","' ,al_telf1,'","' 
            ,al_telf2,'","',al_email,'","' ,al_host,'","',al_pais,'","' ,al_nacion,'","',al_tipdetr,'","' 
            ,al_tipperc,'","' ,al_ubigeo,'","' ,al_codmon,'","' ,al_estcon,'","' ,al_cndcon,'","' ,al_numdetr,'","',al_usrcrea,'","' ,al_feccrea,'","' ,al_hracrea,'","' 
			,al_usract,'","',al_fecact,'","',al_hraact,'");');
		  PREPARE stmt1 FROM @sql_text;
          EXECUTE stmt1;
          
		WHEN '2' THEN
			SET @sql_text = concat('UPDATE lco',cia,'anex SET al_razsoc = "',al_razsoc, 
            '",al_razsoc2 = "',al_razsoc2,
            '",al_direcc ="',al_direcc,
            '",al_apelpat ="',al_apelpat,
			'",al_apelmat = "',al_apelmat,
            '",al_prinom ="',al_prinom,
            '",al_segnom ="',al_segnom,
			'",al_tipper = "',al_tipper,
            '",al_tipdocide ="',al_tipdocide,
            '",al_nrodocide ="',al_nrodocide,
			'",al_domic = "',al_domic,
            '",al_repleg ="',al_repleg,
            '",al_carleg ="',al_carleg,
			'",al_estado = "',al_estado,
            '",al_telf1 ="',al_telf1,
            '",al_telf2 ="',al_telf2,
			'",al_email = "',al_email,
            '",al_host ="',al_host,
            '",al_pais ="',al_pais,
			'",al_nacion = "',al_nacion,
            '",al_tipdetr ="',al_tipdetr,
            '",al_tipperc ="',al_tipperc,
			'",al_ubigeo = "',al_ubigeo,
            '",al_codmon ="',al_codmon,
            '",al_estcon ="',al_estcon,
            '",al_cndcon ="',al_cndcon,
            '",al_numdetr ="',al_numdetr,
            '",al_usract = "',al_usract,
            '",al_fecact = "',al_fecact,
            '",al_hraact ="',al_hraact,
            '"  where al_tipanex ="',al_tipanex,'" and al_codanex ="',al_codanex,'"');
			PREPARE stmt1 FROM @sql_text;
			EXECUTE stmt1;
		WHEN '3' THEN
			SET @sql_text = concat('update lco',cia,'anex set al_estado= ','"A"',' where al_tipanex ="',al_tipanex,'" and al_codanex ="',al_codanex,'"');
			PREPARE stmt FROM @sql_text;
			EXECUTE stmt;
		WHEN '4' THEN
        if al_tipanex like '' and al_codanex like '' then    
				SET @sql_text = concat('select * from lco',cia,'anex order by al_tipanex');
				
			else
				if al_codanex='' then
					SET @sql_text = concat('select * from lco',cia,'anex where al_tipanex like "',al_tipanex,'" order by al_tipanex');
				
				else
					SET @sql_text = concat('select * from lco',cia,'anex where al_tipanex like "',al_tipanex,'" and al_codanex like "', al_codanex ,'" order by al_tipanex'); 
			end if;
		end if;
			
			PREPARE stmt FROM @sql_text;
			EXECUTE stmt;
	END CASE;
END$$

DELIMITER ;


call SP_CrudLcoAnex(4,'0001','2','anexo2','anexo','1','1','1','1','1','1','1','1','1','1','1','1','V','1','1','1','1','1','1','1','1','1','1','varchar20','varchar20','varchar30','usercrea','2011-12-18','13:17:17','userract','2011-12-20','10:10:10');

select*from lco0001anex;

