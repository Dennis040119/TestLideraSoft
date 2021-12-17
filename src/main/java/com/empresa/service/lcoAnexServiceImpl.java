package com.empresa.service;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoAnex;
import com.empresa.entity.lcotgen;
import com.empresa.repository.lcoAnexRepository;

@Service
public class lcoAnexServiceImpl implements lcoAnexService {

	@Autowired
	lcoAnexRepository repository;
	
	@Override
	public List<lcoAnex> listaUnRegistro(int opcion, String p_ciacont, lcoAnex obj) {
		return repository.listar(opcion, p_ciacont, obj.getPkID().getAl_tipanex(),obj.getPkID().getAl_codanex(), obj.getAl_razsoc(), obj.getAl_razsoc2(), 
				obj.getAl_direcc(), obj.getAl_apelpat(), 
				obj.getAl_apelmat(), obj.getAl_prinom(), obj.getAl_segnom(), obj.getAl_tipper(), 
				obj.getAl_tipdocide(), obj.getAl_nrodocide(), obj.getAl_domic(), obj.getAl_repleg(), obj.getAl_carleg(), 
				obj.getAl_estado(), obj.getAl_telf1(), obj.getAl_telf2(), obj.getAl_email(), obj.getAl_host(), obj.getAl_pais(), 
				obj.getAl_nacion(), obj.getAl_tipdetr(), obj.getAl_tipperc(), obj.getAl_ubigeo(), obj.getAl_codmon(),obj.getAl_estcon(),
				obj.getAl_cndcon(),obj.getAl_numdetr(),obj.getAl_usrcrea(),obj.getAl_feccrea()
				, obj.getAl_hracrea(), obj.getAl_usract(), obj.getAl_fecact(), obj.getAl_hraact());
		 
	}

	@Override
	public void registrarAnexo(int opcion, String p_ciacont, lcoAnex obj) {
		 repository.RegistrarActu(opcion, p_ciacont, obj.getPkID().getAl_tipanex(),obj.getPkID().getAl_codanex(), obj.getAl_razsoc(), obj.getAl_razsoc2(), 
					obj.getAl_direcc(), obj.getAl_apelpat(), 
					obj.getAl_apelmat(), obj.getAl_prinom(), obj.getAl_segnom(), obj.getAl_tipper(), 
					obj.getAl_tipdocide(), obj.getAl_nrodocide(), obj.getAl_domic(), obj.getAl_repleg(), obj.getAl_carleg(), 
					obj.getAl_estado(), obj.getAl_telf1(), obj.getAl_telf2(), obj.getAl_email(), obj.getAl_host(), obj.getAl_pais(), 
					obj.getAl_nacion(), obj.getAl_tipdetr(), obj.getAl_tipperc(), obj.getAl_ubigeo(), obj.getAl_codmon(),obj.getAl_estcon(),
					obj.getAl_cndcon(),obj.getAl_numdetr(),obj.getAl_usrcrea(),obj.getAl_feccrea()
					, obj.getAl_hracrea(), obj.getAl_usract(), obj.getAl_fecact(), obj.getAl_hraact());
		
	}
	
	@Override
	public void ActualizarAnexo(int opcion, String p_ciacont, lcoAnex obj) {
		 repository.RegistrarActu(opcion, p_ciacont, obj.getPkID().getAl_tipanex(),obj.getPkID().getAl_codanex(), obj.getAl_razsoc(), obj.getAl_razsoc2(), 
					obj.getAl_direcc(), obj.getAl_apelpat(), 
					obj.getAl_apelmat(), obj.getAl_prinom(), obj.getAl_segnom(), obj.getAl_tipper(), 
					obj.getAl_tipdocide(), obj.getAl_nrodocide(), obj.getAl_domic(), obj.getAl_repleg(), obj.getAl_carleg(), 
					obj.getAl_estado(), obj.getAl_telf1(), obj.getAl_telf2(), obj.getAl_email(), obj.getAl_host(), obj.getAl_pais(), 
					obj.getAl_nacion(), obj.getAl_tipdetr(), obj.getAl_tipperc(), obj.getAl_ubigeo(), obj.getAl_codmon(),obj.getAl_estcon(),
					obj.getAl_cndcon(),obj.getAl_numdetr(),obj.getAl_usrcrea(),obj.getAl_feccrea()
					, obj.getAl_hracrea(), obj.getAl_usract(), obj.getAl_fecact(), obj.getAl_hraact());
		
	}

	@Override
	public void eliminarAnexo(int opcion, String p_ciacont, lcoAnex obj) {
		repository.RegistrarActu(opcion, p_ciacont, obj.getPkID().getAl_tipanex(),obj.getPkID().getAl_codanex(), obj.getAl_razsoc(), obj.getAl_razsoc2(), 
				obj.getAl_direcc(), obj.getAl_apelpat(), 
				obj.getAl_apelmat(), obj.getAl_prinom(), obj.getAl_segnom(), obj.getAl_tipper(), 
				obj.getAl_tipdocide(), obj.getAl_nrodocide(), obj.getAl_domic(), obj.getAl_repleg(), obj.getAl_carleg(), 
				obj.getAl_estado(), obj.getAl_telf1(), obj.getAl_telf2(), obj.getAl_email(), obj.getAl_host(), obj.getAl_pais(), 
				obj.getAl_nacion(), obj.getAl_tipdetr(), obj.getAl_tipperc(), obj.getAl_ubigeo(), obj.getAl_codmon(),obj.getAl_estcon(),
				obj.getAl_cndcon(),obj.getAl_numdetr(),obj.getAl_usrcrea(),obj.getAl_feccrea()
				, obj.getAl_hracrea(), obj.getAl_usract(), obj.getAl_fecact(), obj.getAl_hraact());
		
	}

}
