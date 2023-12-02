package com.solucioneskabec;

import java.math.BigDecimal;

import com.solucioneskabec.child.Reptil;
import com.solucioneskabec.child.crocodile.Cocodrilo;

public class App {

	public static void main(String[] args) {
		Reptil reptil = new Reptil(true, "Ovíparo", "Huevo duro", "Terrestre", "Pulmones", "fría", "verde",
				new BigDecimal(1), "Dura y escamosa", (byte) 4);
		String tipoPiel = reptil.getTipoPiel();
		System.out.println("Desplazamiento: " + reptil.desplazamiento());
		if (tipoPiel.toLowerCase().contains("dura")) {
			System.out.println("Es un reptil");
		} else {
			System.out.println("No es un reptil");
		}
		System.out.println(reptil.getTipoPiel());
		System.out.println(reptil.getColor());
		System.out.println(reptil);

		Cocodrilo cocodrilo = new Cocodrilo(true, "Ovíparo", "Huevo duro", "Terrestre y agua", "Pulmones", "fría",
				"verde", new BigDecimal(4.75), "Dura y seca", (byte) 4, "Crocodilia", "Cocodrilo marino",
				"Pantanos y ríos");
		System.out.println("Desplazamiento: " + cocodrilo.desplazamiento());
		if (cocodrilo.getTipoHabitat().equalsIgnoreCase("terrestre y agua")) {
			System.out.println("Es un cocodrilo");
		} else {
			System.out.println("No es un cocodrilo");
		}
		System.out.println(cocodrilo);

	}

}
