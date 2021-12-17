package com.empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiciosPruebas {

	public static void main(String[] args) {
		SpringApplication.run(ServiciosPruebas.class, args);
		System.out.print("funciono BACKGeneral port 8076");
	}

}
