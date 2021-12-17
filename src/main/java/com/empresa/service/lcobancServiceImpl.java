package com.empresa.service;

import com.empresa.entity.lcobanc;
import com.empresa.repository.lcobancRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class lcobancServiceImpl implements lcobancService{

    @Autowired
    private lcobancRepository repository;

    @Override
    public List<Object[]> listarCaj(int opcion, String p_ciacont, lcobanc obj) {
        return repository.listarCaj(opcion, p_ciacont, obj.getBl_codbco(),
                obj.getBl_nombco(), obj.getBl_tipmon(), obj.getBl_numcta(), obj.getBl_estado(),
                obj.getBl_cuenta(), obj.getBl_desccta(), obj.getBl_entfina(), obj.getBl_tipocta(),
                obj.getBl_flcaja(), obj.getBl_fche1(), obj.getBl_fche2(), obj.getBl_fche3(),
                obj.getBl_nche1(), obj.getBl_nche2(), obj.getBl_nche3(), obj.getBl_frche(), obj.getBl_modesdcta(),
                obj.getBl_usrcrea(), obj.getBl_feccrea(), obj.getBl_hracrea(),
                obj.getBl_usract(), obj.getBl_fecact(), obj.getBl_hraact());
    }

	@Override
	public List<Object[]> listarBco(int opcion, String p_ciacont, lcobanc obj) {
		return repository.listarBco(opcion, p_ciacont, obj.getBl_codbco(),
                obj.getBl_nombco(), obj.getBl_tipmon(), obj.getBl_numcta(), obj.getBl_estado(),
                obj.getBl_cuenta(), obj.getBl_desccta(), obj.getBl_entfina(), obj.getBl_tipocta(),
                obj.getBl_flcaja(), obj.getBl_fche1(), obj.getBl_fche2(), obj.getBl_fche3(),
                obj.getBl_nche1(), obj.getBl_nche2(), obj.getBl_nche3(), obj.getBl_frche(), obj.getBl_modesdcta(),
                obj.getBl_usrcrea(), obj.getBl_feccrea(), obj.getBl_hracrea(),
                obj.getBl_usract(), obj.getBl_fecact(), obj.getBl_hraact());
	}

	@Override
	public void registrarBco(int opcion, String p_ciacont, lcobanc obj) {
		repository.registarBco(opcion, p_ciacont, obj.getBl_codbco(),
                obj.getBl_nombco(), obj.getBl_tipmon(), obj.getBl_numcta(), obj.getBl_estado(),
                obj.getBl_cuenta(), obj.getBl_desccta(), obj.getBl_entfina(), obj.getBl_tipocta(),
                obj.getBl_flcaja(), obj.getBl_fche1(), obj.getBl_fche2(), obj.getBl_fche3(),
                obj.getBl_nche1(), obj.getBl_nche2(), obj.getBl_nche3(), obj.getBl_frche(), obj.getBl_modesdcta(),
                obj.getBl_usrcrea(), obj.getBl_feccrea(), obj.getBl_hracrea(),
                obj.getBl_usract(), obj.getBl_fecact(), obj.getBl_hraact());
		
	}

	@Override
	public void actualizarBco(int opcion, String p_ciacont, lcobanc obj) {
		repository.editarBco(opcion, p_ciacont, obj.getBl_codbco(),
                obj.getBl_nombco(), obj.getBl_tipmon(), obj.getBl_numcta(), obj.getBl_estado(),
                obj.getBl_cuenta(), obj.getBl_desccta(), obj.getBl_entfina(), obj.getBl_tipocta(),
                obj.getBl_flcaja(), obj.getBl_fche1(), obj.getBl_fche2(), obj.getBl_fche3(),
                obj.getBl_nche1(), obj.getBl_nche2(), obj.getBl_nche3(), obj.getBl_frche(), obj.getBl_modesdcta(),
                obj.getBl_usrcrea(), obj.getBl_feccrea(), obj.getBl_hracrea(),
                obj.getBl_usract(), obj.getBl_fecact(), obj.getBl_hraact());
		
	}

	@Override
	public void eliminarBco(int opcion, String p_ciacont, lcobanc obj) {
		repository.eliminarBco(opcion, p_ciacont, obj.getBl_codbco(),
                obj.getBl_nombco(), obj.getBl_tipmon(), obj.getBl_numcta(), obj.getBl_estado(),
                obj.getBl_cuenta(), obj.getBl_desccta(), obj.getBl_entfina(), obj.getBl_tipocta(),
                obj.getBl_flcaja(), obj.getBl_fche1(), obj.getBl_fche2(), obj.getBl_fche3(),
                obj.getBl_nche1(), obj.getBl_nche2(), obj.getBl_nche3(), obj.getBl_frche(), obj.getBl_modesdcta(),
                obj.getBl_usrcrea(), obj.getBl_feccrea(), obj.getBl_hracrea(),
                obj.getBl_usract(), obj.getBl_fecact(), obj.getBl_hraact());
		
	}

	@Override
	public List<lcobanc> listarCajUnica(int opcion, String p_ciacont, lcobanc obj) {
		return repository.listarCajEspecifica(opcion, p_ciacont, obj.getBl_codbco(),
                obj.getBl_nombco(), obj.getBl_tipmon(), obj.getBl_numcta(), obj.getBl_estado(),
                obj.getBl_cuenta(), obj.getBl_desccta(), obj.getBl_entfina(), obj.getBl_tipocta(),
                obj.getBl_flcaja(), obj.getBl_fche1(), obj.getBl_fche2(), obj.getBl_fche3(),
                obj.getBl_nche1(), obj.getBl_nche2(), obj.getBl_nche3(), obj.getBl_frche(), obj.getBl_modesdcta(),
                obj.getBl_usrcrea(), obj.getBl_feccrea(), obj.getBl_hracrea(),
                obj.getBl_usract(), obj.getBl_fecact(), obj.getBl_hraact());
	}

	@Override
	public List<lcobanc> listarBcoUnica(int opcion, String p_ciacont, lcobanc obj) {
		return repository.listarBcoEspecifico(opcion, p_ciacont, obj.getBl_codbco(),
                obj.getBl_nombco(), obj.getBl_tipmon(), obj.getBl_numcta(), obj.getBl_estado(),
                obj.getBl_cuenta(), obj.getBl_desccta(), obj.getBl_entfina(), obj.getBl_tipocta(),
                obj.getBl_flcaja(), obj.getBl_fche1(), obj.getBl_fche2(), obj.getBl_fche3(),
                obj.getBl_nche1(), obj.getBl_nche2(), obj.getBl_nche3(), obj.getBl_frche(), obj.getBl_modesdcta(),
                obj.getBl_usrcrea(), obj.getBl_feccrea(), obj.getBl_hracrea(),
                obj.getBl_usract(), obj.getBl_fecact(), obj.getBl_hraact());
	}
}
