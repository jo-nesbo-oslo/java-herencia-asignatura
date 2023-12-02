package com.solucioneskabec.parent;

import java.math.BigDecimal;

public class Animal {

	private boolean vertebrado;
	private String tipoReproduccion;
	private String tipoHuevo;
	private String tipoHabitat;
	private String sistemaRespiratorio;
	private String tipoSangre;
	private String color;
	private BigDecimal dimension;

	public Animal() {

	}

	public Animal(boolean vertebrado, String tipoReproduccion, String tipoHuevo, String tipoHabitat,
			String sistemaRespiratorio, String tipoSangre, String color, BigDecimal dimension) {
		super();
		this.vertebrado = vertebrado;
		this.tipoReproduccion = tipoReproduccion;
		this.tipoHuevo = tipoHuevo;
		this.tipoHabitat = tipoHabitat;
		this.sistemaRespiratorio = sistemaRespiratorio;
		this.tipoSangre = tipoSangre;
		this.color = color;
		this.dimension = dimension;
	}

	public boolean isVertebrado() {
		return vertebrado;
	}

	public String getTipoReproduccion() {
		return tipoReproduccion;
	}

	public String getTipoHuevo() {
		return tipoHuevo;
	}

	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public String getSistemaRespiratorio() {
		return sistemaRespiratorio;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public String getColor() {
		return color;
	}

	public BigDecimal getDimension() {
		return dimension;
	}

	public String desplazamiento() {
		return null;
	}

	@Override
	public String toString() {
		return "Animal [vertebrado=" + vertebrado + ", tipoReproduccion=" + tipoReproduccion + ", tipoHuevo="
				+ tipoHuevo + ", tipoHabitat=" + tipoHabitat + ", sistemaRespiratorio=" + sistemaRespiratorio
				+ ", tipoSangre=" + tipoSangre + ", color=" + color + ", dimension=" + dimension + "]";
	}

}
