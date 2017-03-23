package com.becarios.proyecto_definitivo.model.factores_ajustes;
// Generated 22-mar-2017 16:09:41 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * FactorAjuste generated by hbm2java
 */
@Entity
@Table(name = "factor_ajuste", catalog = "HE")
public class FactorAjuste implements java.io.Serializable {

	private int idProyecto;
	private int factorProductividad;

	public FactorAjuste() {
	}

	public FactorAjuste(int idProyecto, int factorProductividad) {
		this.idProyecto = idProyecto;
		this.factorProductividad = factorProductividad;
	}

	@Id

	@Column(name = "idProyecto", unique = true, nullable = false)
	public int getIdProyecto() {
		return this.idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	@Column(name = "Factor_Productividad", nullable = false)
	public int getFactorProductividad() {
		return this.factorProductividad;
	}

	public void setFactorProductividad(int factorProductividad) {
		this.factorProductividad = factorProductividad;
	}

}