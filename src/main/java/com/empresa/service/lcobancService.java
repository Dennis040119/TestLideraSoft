package com.empresa.service;

import com.empresa.entity.lcobanc;

import java.util.List;

public interface lcobancService {

    public abstract List<Object[]> listarBco(int opcion, String p_ciacont, lcobanc obj);
    
    public abstract List<Object[]> listarCaj(int opcion, String p_ciacont, lcobanc obj);
    
    public abstract List<lcobanc> listarCajUnica(int opcion, String p_ciacont, lcobanc obj);
    
    public abstract List<lcobanc> listarBcoUnica(int opcion, String p_ciacont, lcobanc obj);
    
    //Registrar banco o caja
    void registrarBco(int opcion, String p_ciacont, lcobanc obj);
    
    //Editar banco o caja
    void actualizarBco(int opcion, String p_ciacont, lcobanc obj);
    
    //Eliminar caja o banco
    void eliminarBco(int opcion, String p_ciacont, lcobanc obj);
    

}

