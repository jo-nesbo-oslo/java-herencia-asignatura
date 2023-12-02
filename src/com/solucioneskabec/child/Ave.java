package com.solucioneskabec.child;

import java.math.BigDecimal;

import com.solucioneskabec.parent.Animal;

public class Ave extends Animal {

	private String tipoPlumas;
	private boolean vuela;

	public Ave() {
	}

	public Ave(boolean vertebrado, String tipoReproduccion, String tipoHuevo, String tipoHabitat,
			String sistemaRespiratorio, String tipoSangre, String color, BigDecimal dimension, String tipoPlumas,
			boolean vuela) {
		super(vertebrado, tipoReproduccion, tipoHuevo, tipoHabitat, sistemaRespiratorio, tipoSangre, color, dimension);
		this.tipoPlumas = tipoPlumas;
		this.vuela = vuela;
	}

	public String getTipoPlumas() {
		return tipoPlumas;
	}

	public boolean isVuela() {
		return vuela;
	}

	@Override
	public String desplazamiento() {
		return "vuela";
	}

	@Override
	public String toString() {
		return "Ave [tipoPlumas=" + tipoPlumas + ", vuela=" + vuela + ", toString()=" + super.toString() + "]";
	}

}
