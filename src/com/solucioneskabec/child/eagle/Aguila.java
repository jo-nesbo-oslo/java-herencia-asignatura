package com.solucioneskabec.child.eagle;

import java.math.BigDecimal;

import com.solucioneskabec.child.Ave;

public class Aguila extends Ave {

	private String especie;
	private String colorPlumas;

	public Aguila() {
		super();
	}

	public Aguila(boolean vertebrado, String tipoReproduccion, String tipoHuevo, String tipoHabitat,
			String sistemaRespiratorio, String tipoSangre, String color, BigDecimal dimension, String tipoPlumas,
			boolean vuela, String especie, String colorPlumas) {
		super(vertebrado, tipoReproduccion, tipoHuevo, tipoHabitat, sistemaRespiratorio, tipoSangre, color, dimension,
				tipoPlumas, vuela);
		this.especie = especie;
		this.colorPlumas = colorPlumas;
	}

	public String getEspecie() {
		return especie;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	@Override
	public String toString() {
		return "Aguila [especie=" + especie + ", colorPlumas=" + colorPlumas + ", toString()=" + super.toString() + "]";
	}

}
