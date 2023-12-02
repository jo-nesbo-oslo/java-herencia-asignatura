package com.solucioneskabec.child.eel;

import java.math.BigDecimal;

import com.solucioneskabec.child.Pez;

public class Anguila extends Pez {

	private String tipoPiel;
	private String tipoMigracion;

	public Anguila() {
		super();
	}

	public Anguila(boolean vertebrado, String tipoReproduccion, String tipoHuevo, String tipoHabitat,
			String sistemaRespiratorio, String tipoSangre, String color, BigDecimal dimension, String tipoEscamas,
			String tipoAleta, String tipoPiel, String tipoMigracion) {
		super(vertebrado, tipoReproduccion, tipoHuevo, tipoHabitat, sistemaRespiratorio, tipoSangre, color, dimension,
				tipoEscamas, tipoAleta);
		this.tipoPiel = tipoPiel;
		this.tipoMigracion = tipoMigracion;
	}

	public String getTipoPiel() {
		return tipoPiel;
	}

	public String getTipoMigracion() {
		return tipoMigracion;
	}

	@Override
	public String toString() {
		return "Anguila [tipoPiel=" + tipoPiel + ", tipoMigracion=" + tipoMigracion + ", toString()=" + super.toString()
				+ "]";
	}

}
