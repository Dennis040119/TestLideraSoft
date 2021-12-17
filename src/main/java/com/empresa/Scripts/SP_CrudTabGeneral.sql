/*Procedure Crud tablas generales*/


use lcon11111111111;

DROP PROCEDURE SP_CrudLcoGen;  
DELIMITER $$
CREATE PROCEDURE SP_CrudLcoGen(
	opcion int, 
	cia VARCHAR(50),
    tl_codtabla char(5),
    tl_clave varchar(18),
    tl_descri varchar(100),
    tl_descri2 varchar(100),
    tl_usrcrea  varchar(10),
    tl_feccrea date,
    tl_hracrea time,
    tl_usract varchar(10),
    tl_fecact date,
    tl_hraact time
     )
BEGIN
    
	
    
    CASE opcion
    
		WHEN  '0' THEN	
		   if tl_clave like '' and tl_codtabla like '' then    
				SET @sql_text = concat('select * from lco',cia,'tgen order by tl_codtabla');
				
			else
				if tl_clave='' then
					SET @sql_text = concat('select * from lco',cia,'tgen where tl_codtabla like "',tl_codtabla,'" order by tl_clave');
				
				else
					SET @sql_text = concat('select * from lco',cia,'tgen where tl_codtabla like "',tl_codtabla,'" and tl_clave like "', tl_clave ,'" order by tl_clave'); 
			end if;
		end if;
		PREPARE stmt FROM @sql_text;
		EXECUTE stmt;
           
		WHEN '1' THEN
			SET @sql_text = concat('insert into lco',cia,'tgen values("' ,tl_codtabla,'","' 
            ,tl_clave,'","'
            ,tl_descri,'","' 
            ,tl_descri2,'","' 
            ,tl_usrcrea,'","' 
            ,tl_feccrea,'","' 
            ,tl_hracrea,'","' 
            ,tl_usract,'","'
            ,tl_fecact,'","'
            ,tl_hraact,'");');
		  PREPARE stmt1 FROM @sql_text;
          EXECUTE stmt1;
          
		WHEN '2' THEN
			SET @sql_text = concat('UPDATE lco',cia,'tgen SET tl_descri = "',tl_descri, 
            '",tl_descri2 = "',tl_descri2,
            
            '",tl_usract = "',tl_usract,
            '",tl_fecact = "',tl_fecact,
            '",tl_hraact ="',tl_hraact,
            '"  where tl_codtabla ="',tl_codtabla,'" and tl_clave ="',tl_clave,'"');
			PREPARE stmt1 FROM @sql_text;
			EXECUTE stmt1;
		WHEN '3' THEN
			SET @sql_text = concat('delete from lco',cia,'tgen WHERE tl_codtabla = ',"'",tl_codtabla,"'",' AND tl_clave = ',"'",tl_clave,"'");
			PREPARE stmt FROM @sql_text;
			EXECUTE stmt;
		
	END CASE;
END$$

DELIMITER ;
call SP_CrudLcoGen(0,'0001','02','','CrudProcedure6','descripcrud','admin','2011-12-18','13:17:17','usract','2011-12-20','13:17:17');

select*from lco0001tgen where tl_codtabla like '00' and tl_clave like '01' ;