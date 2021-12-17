package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcotgen;
import com.empresa.repository.lcgenRepository;

@Service
public class lcogenServicelmpl implements lcogenService {

	@Autowired
	private lcgenRepository repository;

	/*//SOBREESCRIBIMOS EL METODO DEL SERVICIO Y DENTRO DE EL LLAMAMOS AL REPOSITORIO PARA INVOCAR LA 
	//CLASE LISTALL, QUE TRAERA LOS REGISTROS DE LA BASE DE DATOS
	@Override
	public List<lcotgen> listaRegistros(int opcion, String p_ciacont, lcotgen obj) {
		//return repository.findAll();
		return repository.listAll(opcion, p_ciacont, obj.getPkID().getTl_codtabla(), obj.getPkID().getTl_clave(),
				obj.getTl_descri(), obj.getTl_descri2(), obj.getTl_usrcrea(), obj.getTl_feccrea(), obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
	}
	*/
	//SOBREESCRIBIMOS EL METODO DEL SERVICIO Y DENTRO DE EL LLAMAMOS AL REPOSITORIO PARA INVOCAR AL 
	//METODO LISTAUNREGISTRO, QUE REGISTROS ESPECIFICOS DE LA BASE DE DATOS
	@Override
	public List<lcotgen> listaUnRegistro(int opcion, String p_ciacont, lcotgen obj) {
		return repository.listaUno(opcion, p_ciacont, obj.getPkID().getTl_codtabla(), obj.getPkID().getTl_clave(),
				obj.getTl_descri(), obj.getTl_descri2(), obj.getTl_usrcrea(), obj.getTl_feccrea(), obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
	}


	
	//SOBREESCRIBIMOS EL METODO DEL SERVICIO Y DENTRO DE EL LLAMAMOS AL REPOSITORIO PARA INVOCAR LA 
	//CLASE REGISTRARNUEVOREGISTRO, QUE GRABARA EL REGISTRO DE LA BASE DE DATOS
	@Override
	public void registrarNuevoRegistro(int opcion, String p_ciacont, lcotgen obj) {
		repository.registrarRegistro(opcion, p_ciacont, obj.getPkID().getTl_codtabla(), obj.getPkID().getTl_clave(),
				obj.getTl_descri(), obj.getTl_descri2(), obj.getTl_usrcrea(), obj.getTl_feccrea(), obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
		
	}

	//SOBREESCRIBIMOS EL METODO DEL SERVICIO Y DENTRO DE EL LLAMAMOS AL REPOSITORIO PARA INVOCAR LA 
	//CLASE EDITARREGISTRO, QUE ACTUALIZARA UN REGISTRO DE LA BASE DE DATOS
	@Override
	public void editarRegistro(int opcion, String p_ciacont, lcotgen obj) {
		repository.actualizaRegistro(opcion, p_ciacont, obj.getPkID().getTl_codtabla(), obj.getPkID().getTl_clave(),
				obj.getTl_descri(), obj.getTl_descri2(), obj.getTl_usrcrea(), obj.getTl_feccrea(), obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
	}

	//SOBREESCRIBIMOS EL METODO DEL SERVICIO Y DENTRO DE EL LLAMAMOS AL REPOSITORIO PARA INVOCAR LA 
	//CLASE ELIMINARREGISTRO, QUE ELIMINARA UN REGISTRO DE LA BASE DE DATOS
	@Override
	public void eliminarRegistro(int opcion, String p_ciacont, lcotgen obj) {
		repository.eliminaRegistro(opcion, p_ciacont, obj.getPkID().getTl_codtabla(), obj.getPkID().getTl_clave(),
				obj.getTl_descri(), obj.getTl_descri2(), obj.getTl_usrcrea(), obj.getTl_feccrea(), obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
		
	}



	
}
