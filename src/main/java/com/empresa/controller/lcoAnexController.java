package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoAnex;
import com.empresa.entity.lcoAnexPk;
import com.empresa.entity.lcotgen;
import com.empresa.entity.lcotgenPk;
import com.empresa.service.lcoAnexService;

@RestController
@RequestMapping("/rest/lcoAnex")
@CrossOrigin(origins = "http://localhost:4200")
public class lcoAnexController {
	
	
	@Autowired
	private lcoAnexService service;
	
	@GetMapping(value={"/ListarAnex/{p_ciacont}/{al_tipanex}",
			"/ListarAnex/{p_ciacont}/{al_tipanex}/{al_codanex}",
			"/ListarAnex/{p_ciacont}"})
	@ResponseBody
	public ResponseEntity<List<lcoAnex>> listaPorCodigo(@PathVariable("p_ciacont") String p_ciacont,
														@PathVariable(value="al_tipanex",required = false) String al_tipanex,
														@PathVariable(value="al_codanex", required=false) String al_codanex) throws Exception{
		
		//CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
		
		//CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lcoAnexPk pk = new lcoAnexPk();
		//SETEAMOS EL CODIGO DE TABLA, CON EL CODIGO DE TABLA QUE VIENE POR PARAMETRO EN LA URL
		if(al_codanex != null) {
											//SI VIENE POR PARAMETRO EL CODIGO CLAVE ENTONCES SETEAMOS ESE VALOR
			pk.setAl_codanex(al_codanex);
		}else {pk.setAl_codanex("");}
		
		
		//VALIDAMOS SI VIENE O NO EL CODIGO CLAVE
		if(al_tipanex != null) {			
			pk.setAl_tipanex(al_tipanex);
		}else {
			//EN CASO NO VENGA POR PARAMETRO 
			pk.setAl_tipanex("");
		}
		
		lcoAnex objSalida = new lcoAnex(pk,"", "", "", "", "", 
				"", "", "", "", "", "", "", "", 
				"V", "", "", "", "", "", "", "", "","","","",
				"", "", "usercrea", LocalDate.now(), LocalTime.now(), "useract", LocalDate.now(), LocalTime.now());
		
		try {
			//CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
			//TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA UN REGISTRO
			//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 4, QUE REALIZARA EL METODO GET PARA UN REGISTRO ESPECIFICO
			//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
			//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO DE SALIDA, REQUERIDO POR EL PROCEDURE
			List<lcoAnex> lista = service.listaUnRegistro(0, p_ciacont, objSalida);
			return ResponseEntity.ok(lista);
		}catch(Exception e) {
			throw new Exception("Error HUR1004 + " + e.getMessage());
		}
	}
	
	@PostMapping("/CreaAnex/{p_ciacont}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> registraProveedor(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcoAnex obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {		
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			//Buscamos si existe el registro primero
			List<lcoAnex> lista = service.listaUnRegistro(4, p_ciacont, obj);
			
				if(lista.size() == 1 ) {
				salida.put("mensaje", "Anexo ya existe");
				}else
				{
			
				obj.setAl_feccrea(LocalDate.now());
				obj.setAl_hracrea(LocalTime.now());
				obj.setAl_fecact(LocalDate.now());
				obj.setAl_hraact(LocalTime.now());
			
				service.registrarAnexo(1, p_ciacont, obj);
				salida.put("mensaje", "Anexo registrado correctamente");
				}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1004 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	@PutMapping("ActuAnex /{p_ciacont}")
	public ResponseEntity<Map<String, Object>> actualizaRegistro(@PathVariable("p_ciacont") String p_ciacont,
																 @RequestBody lcoAnex obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITO O ERROR
		Map<String, Object> salida = new HashMap<>();
		try {
			
			//Buscamos si existe el registro primero
			List<lcoAnex> lista = service.listaUnRegistro(0, p_ciacont, obj);
			
			if(lista.size() != 1 ) {
				salida.put("mensaje", "No se encontro Anexo");
			}else
			{
				//ACTUALIZAMOS EL DIA Y LA HORA 
				obj.setAl_feccrea(LocalDate.now());
				obj.setAl_hracrea(LocalTime.now());
				obj.setAl_fecact(LocalDate.now());
				obj.setAl_hraact(LocalTime.now());
				
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS AL METODO EDITAR REGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 2, QUE HARA EL UPDATE DESDE EL PROCEDURE
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO CON LOS CAMPOS QUE QUEREMOS ACTUALIZAR
				service.ActualizarAnexo(2, p_ciacont, obj);
				salida.put("mensaje", "Anexo actualizado correctamente");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1004 "+ e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	@DeleteMapping(value={"/EliminaAnex/{p_ciacont}/{al_tipanex}/{al_codanex}","/EliminaAnex/{p_ciacont}/{al_codanex}",
			"/EliminaAnex/{p_ciacont}/{al_tipanex}"})
	@ResponseBody
	public ResponseEntity<Map<String, Object>> EliminarAnexo(@PathVariable("p_ciacont") String p_ciacont,
														@PathVariable(value="al_tipanex",required = false) String al_tipanex,
														@PathVariable(value="al_codanex",required=false) String al_codanex) throws Exception{
		
		Map<String, Object> salida = new HashMap<>();
		//CREAMOS UN OBJETO QUE SERA LA LLAVE PRIMARIA
		lcoAnexPk pk = new lcoAnexPk();
		//Buscamos primero si existe el registro que se quiere eliminar
		
		if(al_codanex != null && al_tipanex != null) {
			
			pk.setAl_codanex(al_codanex);
			pk.setAl_tipanex(al_tipanex);
			
			//Construmos un lcoAnex para setear los datos que faltaran
			lcoAnex objSalida = new lcoAnex(pk,"", "", "", "", "", 
					"", "", "", "", "", "", "", "", 
					"V", "", "", "", "", "", "", "", "","","","",
					"", "", "usercrea", LocalDate.now(), LocalTime.now(), "useract", LocalDate.now(), LocalTime.now());
			
			
			List<lcoAnex> lista = service.listaUnRegistro(0, p_ciacont, objSalida);
			if(lista.size() != 1 ) {
				salida.put("mensaje", "No se encontro Anexo");
				return ResponseEntity.ok(salida);
			}else {
				try {
				//CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
				//TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA UN REGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 3, QUE REALIZARA EL METODO GET PARA UN REGISTRO ESPECIFICO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO DE SALIDA, REQUERIDO POR EL PROCEDURE
				 service.eliminarAnexo(3, p_ciacont, objSalida);
				salida.put("mensaje", "Anexo eliminado correctamente");
				return ResponseEntity.ok(salida);
				
				}catch(Exception e) {throw new Exception("Error HUR1004 + " + e.getMessage());}
		  }
		}
		else {
			salida.put("mensaje", "Falta tipo de anexo y/o codigo de anexo");
			return ResponseEntity.ok(salida);
		}
		
		
		
		
	}

}
