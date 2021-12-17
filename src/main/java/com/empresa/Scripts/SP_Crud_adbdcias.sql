select*from adbdcias where cu_codcia = '2010036501' and cu_idbd = 'lcon11111111111' order by cu_idbd ;

use idadmin;
/*Procedure Crud tabla adbdcias*/
DROP PROCEDURE SP_CrudAdbdcias;  
DELIMITER $$
CREATE PROCEDURE SP_CrudAdbdcias(#11 parametros
	opcion int, cu_codcia char(20),cu_idbd char(20),cu_ServidorBD varchar(80),cu_userBD varchar(80),cu_paswBD varchar(80),cu_portBD char(10),
    cu_usucre char(10),cu_feccre date, cu_usumod char(10),cu_fecmod date
	)
BEGIN

    CASE opcion
    
		WHEN  '0' THEN	
		   if cu_codcia like '' and cu_idbd like '' then    
				select * from adbdcias order by cu_codcia;
			else
				if cu_idbd='' then
					select * from adbdcias where adbdcias.cu_codcia like cu_codcia order by cu_idbd;
				else
					select * from adbdcias where adbdcias.cu_codcia like cu_codcia and adbdcias.cu_idbd like cu_idbd order by adbdcias.cu_codcia;
			end if;
		end if;
		
		WHEN '1' THEN
			insert into adbdcias values (cu_codcia, cu_idbd, cu_ServidorBD, cu_userBD, cu_paswBD, cu_portBD, cu_usucre, cu_feccre, cu_usumod, cu_fecmod);
          
		WHEN '2' THEN
			update adbdcias  set cu_ServidorBD=cu_ServidorBD, cu_userBD=cu_userBD, cu_paswBD=cu_paswBD, 
            cu_portBD=cu_portBD,  cu_usumod=cu_usumod, cu_fecmod=cu_fecmod
			where adbdcias.cu_codcia = cu_codcia and adbdcias.cu_idbd = cu_idbd;
		WHEN '3' THEN
			delete from adbdcias where adbdcias.cu_codcia=cu_codcia and adbdcias.cu_idbd = cu_idbd;
		
		
	END CASE;
END$$

DELIMITER ;
call SP_CrudAdbdcias(0,'2010036525','lcon11111111122','localhost','root','123456','3306','fff','2021-10-03','lenin','2021-12-20')


