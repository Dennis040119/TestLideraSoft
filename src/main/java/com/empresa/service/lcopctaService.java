package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcopcta;
import com.empresa.entity.lcotgen;


public interface lcopctaService {
	
	public abstract List<lcopcta> listaPlanCtas(int opcion, String p_ciacont, lcopcta obj);
	
	void registrarNuevoRegistro(int opcion, String p_ciacont, lcopcta obj);

}
