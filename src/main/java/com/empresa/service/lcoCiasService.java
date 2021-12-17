package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcoCias;



public interface lcoCiasService {
	
	public abstract List<lcoCias> listarlcoCias(int opcion,lcoCias obj);
	
	void registrar (int opcion, lcoCias obj);

}
