package com.empresa.service;

import java.util.List;



import com.empresa.entity.lcotgen;

public interface lcogenService {

	//DEFINIMOS EL METODO PARA LISTAR REGISTROS
	/*public abstract List<lcotgen> listaRegistros(int opcion, String p_ciacont, lcotgen obj);*/
	
	//DEFINIMOS EL METODO PARA CREAR REGISTROS
	void registrarNuevoRegistro(int opcion, String p_ciacont, lcotgen obj);
	
	//DEFINIMOS EL METODO PARA EDITAR REGISTROS
	void editarRegistro(int opcion, String p_ciacont, lcotgen obj);
	
	//DEFINIMOS EL METODO PARA ELIMINAR REGISTRO
	void eliminarRegistro(int opcion, String p_ciacont, lcotgen obj);
	
	//DEFINIMOS EL METODO PARA LISTAR REGISTROS ESPECIFICOS
	public abstract List<lcotgen> listaUnRegistro(int opcion, String p_ciacont, lcotgen obj);

	
	

}
