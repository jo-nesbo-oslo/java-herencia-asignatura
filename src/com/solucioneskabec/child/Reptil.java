package com.solucioneskabec.child;

import java.math.BigDecimal;

import com.solucioneskabec.parent.Animal;

public class Reptil extends Animal {

	private String tipoPiel;
	private byte numeroPatas;

	public Reptil() {

	}

	public Reptil(boolean vertebrado, String tipoReproduccion, String tipoHuevo, String tipoHabitat,
			String sistemaRespiratorio, String tipoSangre, String color, BigDecimal dimension, String tipoPiel,
			byte numeroPatas) {
		super(vertebrado, tipoReproduccion, tipoHuevo, tipoHabitat, sistemaRespiratorio, tipoSangre, color, dimension);
		this.tipoPiel = tipoPiel;
		this.numeroPatas = numeroPatas;
	}

	public String getTipoPiel() {
		return tipoPiel;
	}

	public byte getNumeroPatas() {
		return numeroPatas;
	}

	@Override
	public String desplazamiento() {
		return "camina";
	}

	@Override
	public String toString() {
		return "Reptil [tipoPiel = " + tipoPiel + ", numeroPatas = " + numeroPatas + ", toString()=" + super.toString()
				+ "]";
	}

}
