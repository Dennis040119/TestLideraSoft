package com.empresa.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoUcia;
import com.empresa.repository.lcoUciaRepository;

@Service
public class LcoUciaServiceImpl implements lcoUciaService {
	
	@Autowired
	lcoUciaRepository repository;

	@Override
	public List<lcoUcia> listar(int opcion, lcoUcia obj) {
		// TODO Auto-generated method stub
		return repository.listar(opcion, obj.getPk().getUl_codusr(), obj.getPk().getUl_codcia(), obj.getUl_usrcrea(), LocalDate.now()
			, LocalTime.now(), obj.getUl_usract(), LocalDate.now(), LocalTime.now());
	}

	@Override
	public void registrar(int opcion, lcoUcia obj) {
		repository.registrar(opcion, obj.getPk().getUl_codusr(), obj.getPk().getUl_codcia(), obj.getUl_usrcrea(), LocalDate.now()
			, LocalTime.now(), obj.getUl_usract(), LocalDate.now(), LocalTime.now());
	}
		
	

}
