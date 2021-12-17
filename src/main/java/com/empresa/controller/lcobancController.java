package com.empresa.controller;

import com.empresa.entity.lcobanc;
import com.empresa.service.lcobancService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest/lcobanc")
@CrossOrigin(origins = "http://localhost:4200")
public class lcobancController {

    @Autowired
    private lcobancService service;

    @GetMapping("/listarCajGrilla/{p_ciacont}")
    @ResponseBody
    public ResponseEntity<List<Object[]>> listar(@PathVariable("p_ciacont") String p_ciacont) throws Exception{
        //Creamos un objeto para el procedure
        lcobanc obj = new lcobanc();
        obj.setBl_codbco("");
        obj.setBl_nombco("");
        obj.setBl_tipmon("");
        obj.setBl_numcta("");
        obj.setBl_estado("");
        obj.setBl_cuenta("");
        obj.setBl_desccta("");
        obj.setBl_entfina("");
        obj.setBl_tipocta("");
        obj.setBl_flcaja("");
        obj.setBl_fche1("");
        obj.setBl_fche2("");
        obj.setBl_fche3("");
        obj.setBl_nche1("");
        obj.setBl_nche2("");
        obj.setBl_nche3("");
        obj.setBl_frche("");
        obj.setBl_modesdcta("");
        obj.setBl_usrcrea("");
        obj.setBl_feccrea(LocalDate.now());
        obj.setBl_hracrea(LocalTime.now());
        obj.setBl_usract("");
        obj.setBl_fecact(LocalDate.now());
        obj.setBl_hraact(LocalTime.now());
        try{
        	//Llamamos al service para listar las cajas
            List<Object[]> lista = service.listarCaj(0, p_ciacont, obj);
            //Devuelve la lista si la consulta fue exitosa
            return ResponseEntity.ok(lista);
        }catch (Exception e){
            throw new Exception("Error HUR1005 + " + e.getMessage());
        }
    }
    
    @GetMapping("/listarBcoGrilla/{p_ciacont}")
    @ResponseBody
    public ResponseEntity<List<Object[]>> listarBco(@PathVariable("p_ciacont") String p_ciacont) throws Exception{
        //Creamos un objeto para el procedure
        lcobanc obj = new lcobanc();
        obj.setBl_codbco("");
        obj.setBl_nombco("");
        obj.setBl_tipmon("");
        obj.setBl_numcta("");
        obj.setBl_estado("");
        obj.setBl_cuenta("");
        obj.setBl_desccta("");
        obj.setBl_entfina("");
        obj.setBl_tipocta("");
        obj.setBl_flcaja("");
        obj.setBl_fche1("");
        obj.setBl_fche2("");
        obj.setBl_fche3("");
        obj.setBl_nche1("");
        obj.setBl_nche2("");
        obj.setBl_nche3("");
        obj.setBl_frche("");
        obj.setBl_modesdcta("");
        obj.setBl_usrcrea("");
        obj.setBl_feccrea(LocalDate.now());
        obj.setBl_hracrea(LocalTime.now());
        obj.setBl_usract("");
        obj.setBl_fecact(LocalDate.now());
        obj.setBl_hraact(LocalTime.now());
        try{
        	//Llamamos al service para listar los bancos
            List<Object[]> lista = service.listarBco(0, p_ciacont, obj);
            //Devuelve la lista si la consulta fue exitosa
            return ResponseEntity.ok(lista);
        }catch (Exception e){
            throw new Exception("Error HUR1006 + " + e.getMessage());
        }
    }
    
    
    @GetMapping(value={"/listarCaj/{p_ciacont}/{bl_codcaj}", "/listarCaj/{p_ciacont}"})
    @ResponseBody
    public ResponseEntity<List<lcobanc>> listarCaj(@PathVariable("p_ciacont") String p_ciacont,
    													   @PathVariable(value="bl_codcaj", required=false) String bl_codcaj) throws Exception{
        //Creamos un objeto para el procedure
    	List<lcobanc> lista;
        lcobanc obj = new lcobanc();
        if(bl_codcaj !=null) {
        	obj.setBl_codbco(bl_codcaj);
        }else {
            obj.setBl_codbco("");

        }
        obj.setBl_nombco("");
        obj.setBl_tipmon("");
        obj.setBl_numcta("");
        obj.setBl_estado("");
        obj.setBl_cuenta("");
        obj.setBl_desccta("");
        obj.setBl_entfina("");
        obj.setBl_tipocta("");
        obj.setBl_flcaja("");
        obj.setBl_fche1("");
        obj.setBl_fche2("");
        obj.setBl_fche3("");
        obj.setBl_nche1("");
        obj.setBl_nche2("");
        obj.setBl_nche3("");
        obj.setBl_frche("");
        obj.setBl_modesdcta("");
        obj.setBl_usrcrea("");
        obj.setBl_feccrea(LocalDate.now());
        obj.setBl_hracrea(LocalTime.now());
        obj.setBl_usract("");
        obj.setBl_fecact(LocalDate.now());
        obj.setBl_hraact(LocalTime.now());
        try{
            
            lista = service.listarCajUnica(4, p_ciacont, obj);
            
        	return ResponseEntity.ok(lista);

    
        }catch (Exception e){
            throw new Exception("Error HUR1005 + " + e.getMessage());
        }
    }
    
    @GetMapping(value={"/listarBco/{p_ciacont}/{bl_codbco}", "/listarBco/{p_ciacont}"})
    @ResponseBody
    public ResponseEntity<List<lcobanc>> listarEspecifico(@PathVariable("p_ciacont") String p_ciacont,
    													   @PathVariable(value="bl_codbco", required=false) String bl_codbco) throws Exception{
        //Creamos un objeto para el procedure
    	List<lcobanc> lista;
        lcobanc obj = new lcobanc();
        if(bl_codbco !=null) {
        	obj.setBl_codbco(bl_codbco);
        }else {
            obj.setBl_codbco("");

        }
        obj.setBl_nombco("");
        obj.setBl_tipmon("");
        obj.setBl_numcta("");
        obj.setBl_estado("");
        obj.setBl_cuenta("");
        obj.setBl_desccta("");
        obj.setBl_entfina("");
        obj.setBl_tipocta("");
        obj.setBl_flcaja("");
        obj.setBl_fche1("");
        obj.setBl_fche2("");
        obj.setBl_fche3("");
        obj.setBl_nche1("");
        obj.setBl_nche2("");
        obj.setBl_nche3("");
        obj.setBl_frche("");
        obj.setBl_modesdcta("");
        obj.setBl_usrcrea("");
        obj.setBl_feccrea(LocalDate.now());
        obj.setBl_hracrea(LocalTime.now());
        obj.setBl_usract("");
        obj.setBl_fecact(LocalDate.now());
        obj.setBl_hraact(LocalTime.now());
        try{
            
            lista = service.listarBcoUnica(4, p_ciacont, obj);
            
        	return ResponseEntity.ok(lista);

    
        }catch (Exception e){
            throw new Exception("Error HUR1006 + " + e.getMessage());
        }
    }
    
    
    /*
	METODO POST PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA), COD_TABLA Y COD_CLAVE
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		COD_TABLA, CODIGO DE TABLA A BUSCAR,
		COD_CLAVE, CODIGO CLAVE A BUSCAR(OPCIONAL)
	*/
	@PostMapping("/registraBco/{p_ciacont}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> registraBco(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcobanc obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			List<lcobanc> listaCaja = service.listarCajUnica(4, p_ciacont, obj);
			List<lcobanc> listaBco = service.listarBcoUnica(4, p_ciacont, obj);
			
			//Verificamos si ya existe un registro
			if(listaCaja.size()==0 && listaBco.size()==0) {
				obj.setBl_feccrea(LocalDate.now());
				obj.setBl_hracrea(LocalTime.now());
				obj.setBl_fecact(LocalDate.now());
				obj.setBl_hraact(LocalTime.now());
				obj.setBl_flcaja("N");
				service.registrarBco(1, p_ciacont, obj);
				salida.put("mensaje", "Registrado correctamente");
			}else {
				salida.put("mensaje", "El registro ya existe");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	@PostMapping("/registarCaj/{p_ciacont}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> registraCaj(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcobanc obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {
			List<lcobanc> listaCaja = service.listarCajUnica(4, p_ciacont, obj);
			List<lcobanc> listaBco = service.listarBcoUnica(4, p_ciacont, obj);
			
			//Verificamos si ya existe un registro
			if(listaCaja.size()==0 && listaBco.size()==0) {
				obj.setBl_feccrea(LocalDate.now());
				obj.setBl_hracrea(LocalTime.now());
				obj.setBl_fecact(LocalDate.now());
				obj.setBl_hraact(LocalTime.now());
				obj.setBl_flcaja("S");
				service.registrarBco(1, p_ciacont, obj);
				salida.put("mensaje", "Registrado correctamente");
			}else {
				salida.put("mensaje", "El registro ya existe");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	/*
	METODO POST PARA LISTAR LOS REGISTROS SEGUN EL P_CIACONT(NUMERO DE LA COMPAÑIA), COD_TABLA Y COD_CLAVE
	PARAMETROS:
		P_CIACONT, NUMERO DE LA COMPAÑIA
		COD_TABLA, CODIGO DE TABLA A BUSCAR,
		COD_CLAVE, CODIGO CLAVE A BUSCAR(OPCIONAL)
	*/
	@PutMapping(value={"/actuTablaBco/{p_ciacont}", "/actuTablaCaj/{p_ciacont}"})
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> actualizaBanc(@PathVariable("p_ciacont") String p_ciacont,
																  @RequestBody lcobanc obj){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		try {		
			List<lcobanc> listaCaja = service.listarCajUnica(4, p_ciacont, obj);
			List<lcobanc> listaBco = service.listarBcoUnica(4, p_ciacont, obj);
			if(listaCaja.size()==1 || listaBco.size()==1) {
				obj.setBl_feccrea(LocalDate.now());
				obj.setBl_hracrea(LocalTime.now());
				obj.setBl_fecact(LocalDate.now());
				obj.setBl_hraact(LocalTime.now());
				service.actualizarBco(2, p_ciacont, obj);
				salida.put("mensaje", "Actualizado correctamente");
			}else {
				salida.put("mensaje", "No se encontro el registro");
			}
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
	
	@DeleteMapping(value="/elimTablaBco/{p_ciacont}/{bl_codbco}")
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> eliminaBanc(@PathVariable("p_ciacont") String p_ciacont,
															@PathVariable(value="bl_codbco", required = false) String bl_codbco){
		//CREAMOS UN MAP, QUE ALMACENARA LOS MENSAJES DE EXITOS O ERRORES
		Map<String, Object> salida = new HashMap<>();
		lcobanc objeto = new lcobanc();
		objeto.setBl_codbco(bl_codbco);
		objeto.setBl_feccrea(LocalDate.now());
		objeto.setBl_hracrea(LocalTime.now());
		objeto.setBl_fecact(LocalDate.now());
		objeto.setBl_hraact(LocalTime.now());
		try {		
			List<lcobanc> listaCaja = service.listarCajUnica(4, p_ciacont, objeto);
			List<lcobanc> listaBco = service.listarBcoUnica(4, p_ciacont, objeto);
			if(listaCaja.size()==1 || listaBco.size()==1) {
				lcobanc obj = new lcobanc();
				obj.setBl_codbco(bl_codbco);
				obj.setBl_cuenta("");
				obj.setBl_desccta("");
				obj.setBl_entfina("");
				obj.setBl_estado("");
				obj.setBl_fche1("");
				obj.setBl_fche2("");
				obj.setBl_fche3("");
				obj.setBl_frche("");
				obj.setBl_tipmon("");
				obj.setBl_flcaja("");
				obj.setBl_modesdcta("");
				obj.setBl_tipocta("");
				obj.setBl_feccrea(LocalDate.now());
				obj.setBl_hracrea(LocalTime.now());
				obj.setBl_fecact(LocalDate.now());
				obj.setBl_hraact(LocalTime.now());
				service.eliminarBco(3, p_ciacont, obj);
				salida.put("mensaje", "Eliminado correctamente");
			}else {
				salida.put("mensaje", "No se encontro el registro");

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error HUR1005 "+e.getMessage());
		}
		return ResponseEntity.ok(salida);
	}
	
	
}
