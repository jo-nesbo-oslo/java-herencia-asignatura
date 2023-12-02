package com.solucioneskabec.child;

import java.math.BigDecimal;

import com.solucioneskabec.parent.Animal;

public class Pez extends Animal {

	private String tipoEscamas;
	private String tipoAleta;

	public Pez() {

	}

	public Pez(boolean vertebrado, String tipoReproduccion, String tipoHuevo, String tipoHabitat,
			String sistemaRespiratorio, String tipoSangre, String color, BigDecimal dimension, String tipoEscamas,
			String tipoAleta) {
		super(vertebrado, tipoReproduccion, tipoHuevo, tipoHabitat, sistemaRespiratorio, tipoSangre, color, dimension);
		this.tipoEscamas = tipoEscamas;
		this.tipoAleta = tipoAleta;
	}

	public String getTipoEscamas() {
		return tipoEscamas;
	}

	public String getTipoAleta() {
		return tipoAleta;
	}
	
	@Override
	public String desplazamiento() {
		return "nada";
	}

	@Override
	public String toString() {
		return "Pez [tipoEscamas=" + tipoEscamas + ", tipoAleta=" + tipoAleta + ", toString()=" + super.toString()
				+ "]";
	}

}
