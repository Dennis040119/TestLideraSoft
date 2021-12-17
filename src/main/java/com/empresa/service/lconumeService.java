package com.empresa.service;

import java.util.List;


import com.empresa.entity.lconume;

public interface lconumeService {
	
	//LISTAR REGISTRO DE NUMERACION
	public abstract List<Object[]> listaNume(int opcion, String p_ciacont, lconume obj);
	
	public abstract List<lconume> listaUnNume(int opcion, String p_ciacont, lconume obj);
	
	void registrarNume(int opcion, String p_ciacont, lconume obj);
	
	void editarNume(int opcion, String p_ciacont, lconume obj);

	void eliminarNume(int opcion, String p_ciacont, lconume obj);


}
