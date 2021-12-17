package com.empresa.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.exception.DataException;
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
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import com.empresa.entity.lcoEjer;
import com.empresa.entity.lcoEjerPk;
import com.empresa.service.lcoEjerService;


@RestController
@RequestMapping("/rest/lcoEjer")
@CrossOrigin(origins = "http://localhost:4200")
public class lcoEjerController {
	
	@Autowired
    private lcoEjerService service;
	
	@GetMapping(value={"/ListarEjercicios/{el_codcia}/{el_ejerc}","/ListarEjercicios/{el_codcia}"})
	@ResponseBody
	public ResponseEntity<List<lcoEjer>> listaCia(@PathVariable(value="el_codcia",required = false) String el_codcia,
	@PathVariable(value="el_ejerc",required = false) String el_ejerc)
			throws Exception {
		
			if(el_codcia==null) {el_codcia=" ";}		
			if(el_ejerc==null) {el_ejerc=" ";}		
			lcoEjerPk pk = new lcoEjerPk(el_codcia, el_ejerc);		
			Map<String, Object> salida = new HashMap<>();
			//CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
			lcoEjer objSalida = new lcoEjer(pk, el_ejerc, LocalDate.now(), 
					LocalTime.now(), el_codcia, LocalDate.now(), LocalTime.now(), "V");		
			//SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
			//SON REQUERIDOS PARA EL PROCEDURE			
			try {
				List<lcoEjer> lista = service.listarlcoEjercicios(0,objSalida);				
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

	@PostMapping("/registraEjercicios")
	public  ResponseEntity<Map<String, Object>> registraEjercicio(@RequestBody lcoEjer obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		
		//Buscamos si existe el registro primero
		List<lcoEjer> lista = service.listarlcoEjercicios(0,obj);
		
		if (lista.size() ==1 ) {
			salida.put("mensaje", "Ejercicio ya existente");
			
		}else {			
			try {		
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					obj.setel_feccrea(LocalDate.now());
					obj.setel_fecact(LocalDate.now());				
					obj.setel_hracrea(LocalTime.now());
					obj.setel_hraact(LocalTime.now());
			
				service.registrarEjercicios(1, obj);
				salida.put("mensaje", "Registrado correctamente");
				} 
			catch (Exception e) {e.printStackTrace(); salida.put("mensaje", "Error HUR1095  procedimiendo malo "+e.getMessage()); }	
			
		}
		return ResponseEntity.ok(salida);
	}
	
	@PutMapping("/ActualizaEjercicios")
	public  ResponseEntity<Map<String, Object>> actualizaEjercicio(@RequestBody lcoEjer obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		
		//Buscamos si existe el registro primero
		List<lcoEjer> lista = service.listarlcoEjercicios(0,obj);
		
		if (lista.size() !=1 ) {
			salida.put("mensaje", "No se encontro registro");
			
		}else {			
			try {		
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					obj.setel_feccrea(LocalDate.now());
					obj.setel_fecact(LocalDate.now());				
					obj.setel_hracrea(LocalTime.now());
					obj.setel_hraact(LocalTime.now());
			
				service.registrarEjercicios(2, obj);
				salida.put("mensaje", "Actualizado correctamente");
				} 
			catch (Exception e) {e.printStackTrace(); salida.put("mensaje", "Error HUR1095 "+e.getMessage()); }	
			
		}
		return ResponseEntity.ok(salida);
	}
	
	@DeleteMapping("/EliminarEjercicios/{el_codcia}/{el_ejerc}/{usr_act}")
	public  ResponseEntity<Map<String, Object>> eliminaEjercicio(@PathVariable(value="el_codcia",required = false) String el_codcia,
			@PathVariable(value="el_ejerc",required = false) String el_ejerc,@PathVariable(value="usr_act",required = false) String usr_act){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		if(el_codcia==null) {el_codcia=" ";}		
		if(el_ejerc==null) {el_ejerc=" ";}		
		lcoEjerPk pk = new lcoEjerPk(el_codcia, el_ejerc);
		lcoEjer obj = new lcoEjer(pk, el_ejerc, LocalDate.now(), 
		LocalTime.now(), usr_act, LocalDate.now(), LocalTime.now(), "V");	
		
		//Buscamos si existe el registro primero
		List<lcoEjer> lista = service.listarlcoEjercicios(0,obj);
		
		if (lista.size() !=1 ) { salida.put("mensaje", "No se encontro registro");}
		else {			
			try {		
				
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 3, QUE  eliminara
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL objeto					
				service.registrarEjercicios(3, obj);
				salida.put("mensaje", "Eliminado correctamente");
				} 
			catch (Exception e) {e.printStackTrace(); salida.put("mensaje", "Error HUR1095 "+e.getMessage()); }				
		}
		return ResponseEntity.ok(salida);
	}
}
