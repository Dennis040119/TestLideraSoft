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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.lcoEjer;
import com.empresa.entity.lcoEjerPk;
import com.empresa.entity.lcoUcia;
import com.empresa.entity.lcoUciaPk;
import com.empresa.service.lcoUciaService;

@RestController
@RequestMapping("/rest/lcoUcia")
@CrossOrigin(origins = "http://localhost:4200")
public class lcoUciaController {
	
	@Autowired
    private lcoUciaService service;
	
	@GetMapping(value={"/ListarUserxCia/{ul_codusr}/{ul_codcia}","/ListarUserxCia/{ul_codusr}","/ListarUserxCia"})
	@ResponseBody
	public ResponseEntity<List<lcoUcia>> listaCia(@PathVariable(value="ul_codusr",required = false) String ul_codusr,
	@PathVariable(value="ul_codcia",required = false) String ul_codcia)
			throws Exception {
		
			if(ul_codusr==null) {ul_codusr="";}		
			if(ul_codcia==null) {ul_codcia="";}		
			lcoUciaPk pk = new lcoUciaPk(ul_codusr, ul_codcia);		
			Map<String, Object> salida = new HashMap<>();
			//CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
			lcoUcia objSalida = new lcoUcia(pk, "user", LocalDate.now(), LocalTime.now(), "user", LocalDate.now(), LocalTime.now());	
			//SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
			//SON REQUERIDOS PARA EL PROCEDURE			
			try {
				List<lcoUcia> lista = service.listar(0,objSalida);				
				if(lista.size() == 0) {
					salida.put("mensaje", "No se encontro Ejercio");}
				else
					salida.put("mensaje", "Consulta exitosa");
				//DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
				return ResponseEntity.ok(lista);				
			}catch(Exception e) {
				//DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
				throw new Exception("Error HUR1095 + " + e.getMessage());
			}
			
			
	}
	
	
	@PostMapping("/registraUserxcias")
	public  ResponseEntity<Map<String, Object>> registraEjercicio(@RequestBody lcoUcia obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		
		//Buscamos si existe el registro primero
		List<lcoUcia> lista = service.listar(0,obj);
		
		if (lista.size() ==1 ) {
			salida.put("mensaje", "Registro ya existente");
			
		}else {			
			try {		
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					obj.setUl_feccrea(LocalDate.now());
					obj.setUl_fecact(LocalDate.now());				
					obj.setUl_hracrea(LocalTime.now());
					obj.setUl_hraact(LocalTime.now());
			
				service.registrar(1, obj);
				salida.put("mensaje", "Registrado correctamente");
				} 
			catch (Exception e) {e.printStackTrace(); salida.put("mensaje", "Error HUR1095 "+e.getMessage()); }	
			
		}
		return ResponseEntity.ok(salida);
	}
	
	@DeleteMapping("/EliminaUserxCia/{ul_codusr}/{ul_codcia}")
	public  ResponseEntity<Map<String, Object>> DeleteEjercicio(@PathVariable(value="ul_codusr",required = false) String ul_codusr,
			@PathVariable(value="ul_codcia",required = false) String ul_codcia){
		
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		if(ul_codusr==null) {ul_codusr="";}		
		if(ul_codcia==null) {ul_codcia="";}		
		lcoUciaPk pk = new lcoUciaPk(ul_codusr, ul_codcia);
		lcoUcia obj = new lcoUcia(pk, "user", LocalDate.now(), LocalTime.now(), "user", LocalDate.now(), LocalTime.now());			
		//Buscamos si existe el registro primero
		List<lcoUcia> lista = service.listar(0,obj);
		
		if (lista.size() !=1 ) {
			salida.put("mensaje", "No se encontro registro");
			
		}else {			
			try {		
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
									
					obj.setUl_feccrea(LocalDate.now());
					obj.setUl_fecact(LocalDate.now());				
					obj.setUl_hracrea(LocalTime.now());
					obj.setUl_hraact(LocalTime.now());
			
				service.registrar(3, obj);
				salida.put("mensaje", "Eliminado correctamente");
				} 
			catch (Exception e) {e.printStackTrace(); salida.put("mensaje", "Error HUR1095 "+e.getMessage()); }	
			
		}
		return ResponseEntity.ok(salida);
	}
}
