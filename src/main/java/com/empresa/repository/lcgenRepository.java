package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.empresa.entity.lcotgen;
import com.empresa.entity.lcotgenPk;

public interface lcgenRepository extends JpaRepository<lcotgen, lcotgenPk> {


	
	
	//METODO QUE LLAMA AL PROCEDURE PARA LISTAR REGISTROS ESPECIFICOS y todos los registros
	//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
	//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
	//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
	@Query(value="{call SP_CrudLcoGen(:opcion, :p_ciacont, :tl_codtabla, :tl_clave, :tl_descri,"
			+ " :tl_descri2, :tl_usrcrea, :tl_feccrea, :tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
			, nativeQuery = true)
	List<lcotgen> listaUno(@Param("opcion") int option,
			                  @Param("p_ciacont") String p_ciacont,
			                  @Param("tl_codtabla") String tl_codtabla,
			                  @Param("tl_clave") String tl_clave,
			                  @Param("tl_descri") String descri,
			                  @Param("tl_descri2") String descri2,
			                  @Param("tl_usrcrea") String tl_usrcrea,
			                  @Param("tl_feccrea") LocalDate tl_feccrea,
			                  @Param("tl_hracrea") LocalTime tl_hracrea,
			                  @Param("tl_usract") String tl_usract,
			                  @Param("tl_fecact") LocalDate tl_fecact,
			                  @Param("tl_hraact") LocalTime tl_hraact);
	
	//METODO QUE LLAMA AL PROCEDURE PARA CREAR LOS REGISTROS
	//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
	//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
	//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
	@Query(value="{call SP_CrudLcoGen(:opcion, :p_ciacont, :tl_codtabla, :tl_clave, :tl_descri,"
			+ " :tl_descri2, :tl_usrcrea, :tl_feccrea, :tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
			, nativeQuery = true)
	@Transactional
	@Modifying
	void registrarRegistro(@Param("opcion") int option,
			  			   @Param("p_ciacont") String p_ciacont,
			               @Param("tl_codtabla") String tl_codtabla,
			               @Param("tl_clave") String tl_clave,
			               @Param("tl_descri") String descri,
			               @Param("tl_descri2") String descri2,
		             	   @Param("tl_usrcrea") String tl_usrcrea,
			               @Param("tl_feccrea") LocalDate tl_feccrea,
			               @Param("tl_hracrea") LocalTime tl_hracrea,
			               @Param("tl_usract") String tl_usract,
			               @Param("tl_fecact") LocalDate tl_fecact,
			               @Param("tl_hraact") LocalTime tl_hraact);
	
	//METODO QUE LLAMA AL PROCEDURE PARA ACTUALIZAR LOS REGISTROS
	//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
	//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
	//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
	@Query(value="{call SP_CrudLcoGen(:opcion, :p_ciacont, :tl_codtabla, :tl_clave, :tl_descri,"
			+ " :tl_descri2, :tl_usrcrea, :tl_feccrea, :tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
			, nativeQuery = true)
	@Transactional
	@Modifying
	void actualizaRegistro(@Param("opcion") int option,
			               @Param("p_ciacont") String p_ciacont,
			               @Param("tl_codtabla") String tl_codtabla,
			               @Param("tl_clave") String tl_clave,
			               @Param("tl_descri") String descri,
			               @Param("tl_descri2") String descri2,
			               @Param("tl_usrcrea") String tl_usrcrea,
			               @Param("tl_feccrea") LocalDate tl_feccrea,
			               @Param("tl_hracrea") LocalTime tl_hracrea,
			               @Param("tl_usract") String tl_usract,
			               @Param("tl_fecact") LocalDate tl_fecact,
			               @Param("tl_hraact") LocalTime tl_hraact);
	
	//METODO QUE LLAMA AL PROCEDURE PARA ELIMINAR UN REGISTRO
	//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
	//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
	//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
	@Query(value="{call SP_CrudLcoGen(:opcion, :p_ciacont, :tl_codtabla, :tl_clave, :tl_descri,"
			+ " :tl_descri2, :tl_usrcrea, :tl_feccrea, :tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
			, nativeQuery = true)
	@Transactional
	@Modifying
	void eliminaRegistro(@Param("opcion") int option,
                         @Param("p_ciacont") String p_ciacont,
                         @Param("tl_codtabla") String tl_codtabla,
                         @Param("tl_clave") String tl_clave,
                         @Param("tl_descri") String descri,
                         @Param("tl_descri2") String descri2,
                         @Param("tl_usrcrea") String tl_usrcrea,
                         @Param("tl_feccrea") LocalDate tl_feccrea,
                         @Param("tl_hracrea") LocalTime tl_hracrea,
                         @Param("tl_usract") String tl_usract,
                         @Param("tl_fecact") LocalDate tl_fecact,
                         @Param("tl_hraact") LocalTime tl_hraact);
	
	
}


