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


import com.empresa.entity.lcoCias;
import com.empresa.service.lcoCiasService;
import com.empresa.service.lcobancService;

@RestController
@RequestMapping("/rest/lcoCias")
@CrossOrigin(origins = "http://localhost:4200")
public class lcoCiasController {
	
	@Autowired
    private lcoCiasService service;
	
	@GetMapping(value={"/ListarCias","/ListarCias/{cl_codcia}"})
	@ResponseBody
	public ResponseEntity<List<lcoCias>> listaCia(@PathVariable(value="cl_codcia",required = false) String cl_codcia) 
			throws Exception {
		
			if(cl_codcia==null) {cl_codcia=" ";}
			
			Map<String, Object> salida = new HashMap<>();
			//CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA
			lcoCias objSalida = new lcoCias(cl_codcia, cl_codcia, cl_codcia, cl_codcia, cl_codcia, cl_codcia, cl_codcia, 
					cl_codcia, LocalDate.now(), LocalTime.now(), cl_codcia, LocalDate.now(), LocalTime.now(), "V");			
			//SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
			//SON REQUERIDOS PARA EL PROCEDURE
			
			
			try {
				List<lcoCias> lista = service.listarlcoCias(0,objSalida);
				
				if(lista.size() == 0) {
					salida.put("mensaje", "No se encontro codigo de compañia");
					
					}
				else
					salida.put("mensaje", "Consulta exitosa");
				//DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
				return ResponseEntity.ok(lista);
				
			}catch(Exception e) {
				//DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
				throw new Exception("Error HUR1095 + " + e.getMessage());
			}
			
			
	}
	
	@PostMapping("/registraCias")
	public  ResponseEntity<Map<String, Object>> registraCia(@RequestBody lcoCias obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		
		//Buscamos si existe el registro primero
		List<lcoCias> lista = service.listarlcoCias(4,obj);
		
		if (lista.size() ==1 ) {
			salida.put("mensaje", "Registro ya existente");
			
		}else {
			
			
			try {		
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					obj.setCl_feccrea(LocalDate.now());
					obj.setCl_fecact(LocalDate.now());
					
					obj.setCl_hracrea(LocalTime.now());
					obj.setCl_hraact(LocalTime.now());
			
				service.registrar(1, obj);
				salida.put("mensaje", "Registrado correctamente");
				} 
			catch (Exception e) {e.printStackTrace(); salida.put("mensaje", "Error HUR1095 "+e.getMessage()); }	
			
		}
		return ResponseEntity.ok(salida);
	}

	@PutMapping("/ActualizaCias")
	public  ResponseEntity<Map<String, Object>> ActualizaCia(@RequestBody lcoCias obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		
		//Buscamos si existe el registro primero
		List<lcoCias> lista = service.listarlcoCias(4,obj);
		
		if (lista.size() !=1 ) {
			salida.put("mensaje", "Registro no se encuentra");
			
		}else {
			try {		
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 2, QUE CREARA UN actualizara
			
				//COMO segundo PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
					obj.setCl_feccrea(LocalDate.now());
					obj.setCl_fecact(LocalDate.now());					
					obj.setCl_hracrea(LocalTime.now());
					obj.setCl_hraact(LocalTime.now());			
				service.registrar(2, obj);
				salida.put("mensaje", "Actualizado correctamente");
				} 
			catch (Exception e) {e.printStackTrace(); salida.put("mensaje", "Error HUR1095 "+e.getMessage()); }	
			
		}
		return ResponseEntity.ok(salida);
	}
	
	@DeleteMapping("/EliminarCias/{cl_codcia}/{usu_act}")
	public  ResponseEntity<Map<String, Object>> EliminarCia(@PathVariable(value="cl_codcia") String cl_codcia,
			@PathVariable(value="usu_act") String usu_act){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		lcoCias objSalida = new lcoCias(cl_codcia, cl_codcia, cl_codcia, cl_codcia, cl_codcia, cl_codcia, cl_codcia, 
				cl_codcia, LocalDate.now(), LocalTime.now(), usu_act, LocalDate.now(), LocalTime.now(), "V");			
		
		//Buscamos si existe el registro primero
		List<lcoCias> lista = service.listarlcoCias(0,objSalida);
		
		if (lista.size() !=1 ) {
			salida.put("mensaje", "Registro no se encuentra");
			
		}else {
			try {		
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 3, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL objeto 
				
								
				service.registrar(3, objSalida);
				salida.put("mensaje", "Eliminado correctamente");
				} 
			catch (Exception e) {e.printStackTrace(); salida.put("mensaje", "Error HUR1095 "+e.getMessage()); }	
			
		}
		return ResponseEntity.ok(salida);
	}
}
