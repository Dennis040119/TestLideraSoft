package com.empresa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lconume;
import com.empresa.repository.lconumeRepository;

@Service
public class lconumeServiceImpl implements lconumeService{
	
	@Autowired
	private lconumeRepository repository;

	
	//LISTAR REGISTROS DE NUMERACION
	@Override
	public List<Object[]> listaNume(int opcion, String p_ciacont, lconume obj) {
		return repository.listarNume(opcion, p_ciacont,
									obj.getPkID().getNl_subdia(), obj.getPkID().getNl_anio(), obj.getPkID().getNl_mes(),
									obj.getNl_nume(), obj.getNl_usrcrea(), obj.getNl_feccrea(),
									obj.getNl_hracrea(), obj.getNl_usract(), obj.getNl_fecact(), obj.getNl_hraact());
	}
	
	@Override
	public List<lconume> listaUnNume(int opcion, String p_ciacont, lconume obj) {
		return repository.listarNumeEspecifico(opcion, p_ciacont,
				obj.getPkID().getNl_subdia(), obj.getPkID().getNl_anio(), obj.getPkID().getNl_mes(),
				obj.getNl_nume(), obj.getNl_usrcrea(), obj.getNl_feccrea(),
				obj.getNl_hracrea(), obj.getNl_usract(), obj.getNl_fecact(), obj.getNl_hraact());
	}

	@Override
	public void registrarNume(int opcion, String p_ciacont, lconume obj) {
		repository.crearNume(opcion, p_ciacont,
				obj.getPkID().getNl_subdia(), obj.getPkID().getNl_anio(), obj.getPkID().getNl_mes(),
				obj.getNl_nume(), obj.getNl_usrcrea(), obj.getNl_feccrea(),
				obj.getNl_hracrea(), obj.getNl_usract(), obj.getNl_fecact(), obj.getNl_hraact());
	}

	@Override
	public void editarNume(int opcion, String p_ciacont, lconume obj) {
		repository.editarNume(opcion, p_ciacont,
				obj.getPkID().getNl_subdia(), obj.getPkID().getNl_anio(), obj.getPkID().getNl_mes(),
				obj.getNl_nume(), obj.getNl_usrcrea(), obj.getNl_feccrea(),
				obj.getNl_hracrea(), obj.getNl_usract(), obj.getNl_fecact(), obj.getNl_hraact());
		
	}

	@Override
	public void eliminarNume(int opcion, String p_ciacont, lconume obj) {
		repository.eliminarRegistroNume(opcion, p_ciacont,
				obj.getPkID().getNl_subdia(), obj.getPkID().getNl_anio(), obj.getPkID().getNl_mes(),
				obj.getNl_nume(), obj.getNl_usrcrea(), obj.getNl_feccrea(),
				obj.getNl_hracrea(), obj.getNl_usract(), obj.getNl_fecact(), obj.getNl_hraact());
		
	}

}
