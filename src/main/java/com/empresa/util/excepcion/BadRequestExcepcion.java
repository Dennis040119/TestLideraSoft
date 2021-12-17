package com.empresa.util.excepcion;



public class BadRequestExcepcion extends RuntimeException {
	
	public BadRequestExcepcion(String mensaje) {
		super(mensaje);
	}
	
	public BadRequestExcepcion() {
		
	}

}
