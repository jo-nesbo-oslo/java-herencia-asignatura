package com.solucioneskabec.child.crocodile;

import java.math.BigDecimal;

import com.solucioneskabec.child.Reptil;

public class Cocodrilo extends Reptil {

	private String familia;
	private String especie;
	private String habitat;

	public Cocodrilo() {
		super();
	}

	public Cocodrilo(boolean vertebrado, String tipoReproduccion, String tipoHuevo, String tipoHabitat,
			String sistemaRespiratorio, String tipoSangre, String color, BigDecimal dimension, String tipoPiel,
			byte numeroPatas, String familia, String especie, String habitat) {
		super(vertebrado, tipoReproduccion, tipoHuevo, tipoHabitat, sistemaRespiratorio, tipoSangre, color, dimension,
				tipoPiel, numeroPatas);
		this.familia = familia;
		this.especie = especie;
		this.habitat = habitat;
	}

	public String getFamilia() {
		return familia;
	}

	public String getEspecie() {
		return especie;
	}

	public String getHabitat() {
		return habitat;
	}

	@Override
	public String desplazamiento() {
		return "camina y nada";
	}

	@Override
	public String toString() {
		return "Cocodrilo [familia=" + familia + ", especie=" + especie + ", habitat=" + habitat + ", toString()="
				+ super.toString() + "]";
	}

}
