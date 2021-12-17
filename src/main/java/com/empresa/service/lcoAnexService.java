package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcoAnex;
import com.empresa.entity.lcotgen;

public interface lcoAnexService {
	
	//DEFINIMOS EL METODO PARA LISTAR REGISTROS ESPECIFICOS
		public abstract List<lcoAnex> listaUnRegistro(int opcion, String p_ciacont, lcoAnex obj);
		
		//metodo para registrar
		void registrarAnexo(int opcion, String p_ciacont, lcoAnex obj);

		
		//metodo para actualizar
		void ActualizarAnexo(int opcion, String p_ciacont, lcoAnex obj);
		
		//DEFINIMOS EL METODO PARA ELIMINAR REGISTRO
		void eliminarAnexo(int opcion, String p_ciacont, lcoAnex obj);

}
