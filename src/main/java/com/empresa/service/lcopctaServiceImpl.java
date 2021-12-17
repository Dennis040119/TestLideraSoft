package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcopcta;
import com.empresa.repository.lcopctaRepository;

@Service
public class lcopctaServiceImpl implements lcopctaService{

	@Autowired
	private lcopctaRepository repository;
	
	//SOBREESCRIBIMOS EL METODO DEL SERVICIO Y DENTRO DE EL LLAMAMOS AL REPOSITORIO PARA INVOCAR LA 
	//CLASE LISTALL, QUE TRAERA LOS REGISTROS DE LA BASE DE DATOS
	@Override
	public List<lcopcta> listaPlanCtas(int opcion, String p_ciacont, lcopcta obj) {
		// return repository.findAll();
		return repository.listAll(opcion, p_ciacont, obj.getPl_cuenta() , obj.getPl_descri(), obj.getPl_tipcta(), obj.getPl_anexo(), obj.getPl_anexo1(), 
				obj.getPl_anexo2(), obj.getPl_docref(), obj.getPl_docref2(),obj.getPl_fecvto(), obj.getPl_mon(), obj.getPl_area(), obj.getPl_ctaabono(),
				obj.getPl_ctacargo(), obj.getPl_ctaajus(), obj.getPl_medpag(), 
				obj.getPl_ancta(), obj.getPl_regcta(), obj.getPl_conbco(),obj.getPl_ccosto() ,obj.getPl_frmbal1(), obj.getPl_frmgyp1(), obj.getPl_frmgyn1(), 
				obj.getPl_frmbal2(), obj.getPl_frmgyp2(), obj.getPl_frmgyn2(), obj.getPl_frmbal3(), obj.getPl_frmgyp3(), obj.getPl_frmgyn3(), 
				obj.getPl_frmCosto(), obj.getPl_frmfluefec(),obj.getPl_adifcbm(), obj.getPl_catie(),obj.getPl_traccst() ,obj.getPl_tasdetret(),obj.getPl_ctaext(), 
				obj.getPl_estado(),obj.getPl_usrcrea(), obj.getPl_feccrea(), obj.getPl_hracrea(), obj.getPl_usract(), obj.getPl_fecact(),
				obj.getPl_hraact());
	}

	@Override
	public void registrarNuevoRegistro(int opcion, String p_ciacont, lcopcta obj) {
		repository.RegistraPL(opcion, p_ciacont, obj.getPl_cuenta() , obj.getPl_descri(), obj.getPl_tipcta(), obj.getPl_anexo(), obj.getPl_anexo1(), 
				obj.getPl_anexo2(), obj.getPl_docref(), obj.getPl_docref2(),obj.getPl_fecvto(), obj.getPl_mon(), obj.getPl_area(), obj.getPl_ctaabono(),
				obj.getPl_ctacargo(), obj.getPl_ctaajus(), obj.getPl_medpag(), 
				obj.getPl_ancta(), obj.getPl_regcta(), obj.getPl_conbco(),obj.getPl_ccosto() ,obj.getPl_frmbal1(), obj.getPl_frmgyp1(), obj.getPl_frmgyn1(), 
				obj.getPl_frmbal2(), obj.getPl_frmgyp2(), obj.getPl_frmgyn2(), obj.getPl_frmbal3(), obj.getPl_frmgyp3(), obj.getPl_frmgyn3(), 
				obj.getPl_frmCosto(), obj.getPl_frmfluefec(),obj.getPl_adifcbm(), obj.getPl_catie(),obj.getPl_traccst() ,obj.getPl_tasdetret(),obj.getPl_ctaext(), 
				obj.getPl_estado(),obj.getPl_usrcrea(), obj.getPl_feccrea(), obj.getPl_hracrea(), obj.getPl_usract(), obj.getPl_fecact(),
				obj.getPl_hraact());
	}

}
