package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcoUcia;


public interface lcoUciaService {

	public abstract List<lcoUcia> listar(int opcion,lcoUcia obj);
	
	void registrar(int opcion,lcoUcia obj);

}
