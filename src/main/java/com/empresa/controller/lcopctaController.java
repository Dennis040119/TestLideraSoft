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

import com.empresa.entity.lcopcta;
import com.empresa.entity.lcotgen;
import com.empresa.entity.lcotgenPk;
import com.empresa.service.lcopctaService;

@RestController
@RequestMapping("/rest/lcopcta")
@CrossOrigin(origins = "http://localhost:4200")
public class lcopctaController {

	@Autowired
	lcopctaService service ; 
	
	/*
	METODO GET PARA LISTAR PLAN DE CUENTA SEGUN EL pl_cuenta(numero de cuenta)
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
	*/
	@GetMapping(value={"/ListarCtas/{p_ciacont}","/ListarCtas/{p_ciacont}/{pl_cuenta}"})
	@ResponseBody
	public ResponseEntity<List<lcopcta>> listapcta(@PathVariable("p_ciacont") String p_ciacont,
			@PathVariable(value="pl_cuenta", required=false) String pl_cuenta
			) throws Exception {
		
			if(pl_cuenta==null) {
				pl_cuenta=" ";
			}
			
			Map<String, Object> salida = new HashMap<>();
			//CREAMOS UN OBJETO PARA LLENAR LOS DATOS DE SALIDA

			lcopcta objSalida = new lcopcta(pl_cuenta, "1",  "1",  "1",  "1",  "1",  "1",  "1",  "1",
					"1",  "1",  "1",  "1",  "1",  "1",  "1", "1",  "1",  "1",  "1",  "1",  "1",  "1",  "1",  "1", 
				"1", "1",  "1",  "1",  "1",  "1",  "1", "1","1","1","1" ,"V", LocalDate.now(), LocalTime.now(),"1", LocalDate.now(), LocalTime.now());
			
			
			//SETEAMOS LOS VALORES, ESTOS NO SERAN REQUERIDOS DESDE EL FRONT
			//SON REQUERIDOS PARA EL PROCEDURE
			
			
			try {
				//CREAMOS UNA LISTA Y LA LLENAMOS CON LA DATA QUE NOS LLEGA DE LA BASE DE DATOS
				//TAMBIEN LLAMAMOS AL OBJETO SERVICE E INVOCAMOS A SU METODO LISTA REGISTROS
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 0, QUE REALIZARA EL METODO GET
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS pl_cuenta en caso se requiera un plan de cuenta en especifico que ira dentro de objsalida
				List<lcopcta> lista = service.listaPlanCtas(0, p_ciacont, objSalida);
				if(lista.size() == 0) {
					salida.put("mensaje", "No se encontro plan contable");
					System.out.println("No hay consulta");
				}
				else
					salida.put("mensaje", "Consulta exitosa");
				//DEVUELVE LA LISTA SI LA CONSULTA FUE EXITOSA
				return ResponseEntity.ok(lista);
				
			}catch(Exception e) {
				//DEVUELVE LA EXEPCION QUE HAYA CAPTURADO
				throw new Exception("Error HUR1001 + " + e.getMessage());
			}
			
			
	}
	
	/*
	METODO POST PARA registrar un plan contable
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		obj, entidad del plan contable
		
	*/
	@PostMapping("/CreaCta/{p_ciacont}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> registrapcta(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcopcta obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {		

				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
			List<lcopcta> lista = service.listaPlanCtas(5, p_ciacont, obj);
			
			if(lista.size()==1) {
				salida.put("mensaje", "Registro ya existe");
			}
			else
			{	obj.setPl_feccrea(LocalDate.now());
				obj.setPl_hracrea(LocalTime.now());
				obj.setPl_fecact(LocalDate.now());
				obj.setPl_hraact(LocalTime.now());				
					service.registrarNuevoRegistro(1, p_ciacont, obj);
					salida.put("mensaje", "Registrado correctamente");}
							
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", "Error HUR1001 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	/*
	METODO put PARA actualizar un plan contable
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		obj, entidad del plan contable
		
	*/
	@PutMapping("/ActuCta/{p_ciacont}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> Actualizapcta(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcopcta obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		
		
		try {	
			//Consultamos si el objeto a actualizar existe en la base de datos sino le manda mensaje a usuario:
			if(service.listaPlanCtas(5, p_ciacont, obj).size()!=1) {
				
				salida.put("mensaje", "Plan contable no existe");
				
			}else {
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
				obj.setPl_feccrea(LocalDate.now());
				obj.setPl_hracrea(LocalTime.now());
				obj.setPl_fecact(LocalDate.now());
				obj.setPl_hraact(LocalTime.now());
				
				
				service.registrarNuevoRegistro(2, p_ciacont, obj);
				salida.put("mensaje", "Actualizado correctamente");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1001 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	//Metodo para cambiar estado los planes contables de 1 a 0
	//Parametros :
	/*
	 p_ciacont = CIA de la compañia
	 pl_cuenta = ID de plan de cuenta para eliminar
	 */
	@DeleteMapping(value={"/EliminaCta/{p_ciacont}/{pl_cuenta}/{user_act}",
			"/EliminaCta/{p_ciacont}/{user_act}"})
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> Eliminapcta(@PathVariable("p_ciacont") String p_ciacont,@PathVariable("user_act") String user_act,
			@PathVariable(value="pl_cuenta",required = false) String pl_cuenta	 ){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		
		lcopcta objSalida = new lcopcta(pl_cuenta, "1",  "1",  "1",  "1",  "1",  "1",  "1",  "1",
				"1",  "1",  "1",  "1",  "1",  "1",  "1", "1",  "1",  "1",  "1",  "1",  "1",  "1",  "1",  "1", 
			"1", "1",  "1",  "1",  "1",  "1",  "1", "1","1","1","1" ,"V", LocalDate.now(), LocalTime.now(),user_act, LocalDate.now(), LocalTime.now());
		
		//Verificamos si objeto que se quiere eliminar existe en la base de Datos
		try {		
			
			if(service.listaPlanCtas(5, p_ciacont, objSalida)==null) {
				
				salida.put("mensaje", "Plan contable no existe");
				
			}else {
				//LLAMAMOS AL OBJETO SERVICE E INVOCAMOS EL METODO REGISTRARNUEVOREGISTRO
				//COMO PRIMER PARAMETRO LE PASAMOS LA OPCION 1, QUE CREARA UN NUEVO REGISTRO
				//COMO SEGUNDO PARAMETRO LE PASAMOS EL P_CIACONT
				//COMO TERCER PARAMETRO LE PASAMOS EL OBJETO QUE AÑADIREMOS
				service.registrarNuevoRegistro(3, p_ciacont, objSalida);
				salida.put("mensaje", "Eliminado correctamente");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1001 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	
}
