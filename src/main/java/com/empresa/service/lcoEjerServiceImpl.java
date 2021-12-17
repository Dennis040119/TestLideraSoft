package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoEjer;
import com.empresa.repository.lcoEjerRepository;

@Service
public class lcoEjerServiceImpl implements lcoEjerService {
	
	@Autowired
	lcoEjerRepository repository;

	@Override
	public List<lcoEjer> listarlcoEjercicios(int opcion, lcoEjer obj) {
		// TODO Auto-generated method stub
		return repository.listar(opcion, obj.getPk().getel_codcia(), obj.getPk().getel_ejerc(), obj.getel_usrcrea()
		, obj.getel_feccrea(), obj.getel_hracrea(), obj.getel_usract(), obj.getel_fecact(), obj.getel_hraact(), obj.getel_estado());
	}

	@Override
	public void registrarEjercicios(int opcion, lcoEjer obj) {
		repository.registrar(opcion, obj.getPk().getel_codcia(), obj.getPk().getel_ejerc(), obj.getel_usrcrea()
				, obj.getel_feccrea(), obj.getel_hracrea(), obj.getel_usract(), obj.getel_fecact(), obj.getel_hraact(), obj.getel_estado());
		
	}

}
