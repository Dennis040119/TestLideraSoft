package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoCias;
import com.empresa.repository.lcoCiasRepository;

@Service
public class lcoCiasServiceImpl implements lcoCiasService {

	@Autowired
	lcoCiasRepository repository;
	
	@Override
	public List<lcoCias> listarlcoCias(int opcion,lcoCias obj) {
		// TODO Auto-generated method stub
		return repository.listar(opcion, obj.getCl_codcia(), obj.getCl_desc1(), obj.getCl_desc2(), obj.getCl_nruc(), obj.getCl_telef(), obj.getCl_email(), 
				obj.getCl_host(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(), obj.getCl_usract(), 
				obj.getCl_fecact(), obj.getCl_hraact(), obj.getCl_estado());
	}

	@Override
	public void registrar(int opcion, lcoCias obj) {
		repository.Registrar(opcion, obj.getCl_codcia(), obj.getCl_desc1(), obj.getCl_desc2(), obj.getCl_nruc(), obj.getCl_telef(), obj.getCl_email(), 
				obj.getCl_host(), obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(), obj.getCl_usract(), 
				obj.getCl_fecact(), obj.getCl_hraact(), obj.getCl_estado());
		
	}

}
