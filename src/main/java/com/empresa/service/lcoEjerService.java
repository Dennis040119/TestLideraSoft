package com.empresa.service;

import java.util.List;


import com.empresa.entity.lcoEjer;

public interface lcoEjerService {
	
public abstract List<lcoEjer> listarlcoEjercicios(int opcion,lcoEjer obj);
	
	void registrarEjercicios (int opcion, lcoEjer obj);

}
