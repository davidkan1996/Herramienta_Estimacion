package com.becarios.proyecto_definitivo.model.horas_costes;
// Generated 15-mar-2017 15:45:53 by Hibernate Tools 5.2.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Gobierno generated by hbm2java
 */
@Entity
@Table(name = "gobierno", catalog = "HE")
public class Gobierno implements java.io.Serializable {

    private Integer idProyecto;
    private String nombre;
    private int porcentaje;
    private boolean internaPractica;
    private int horas;
    private int coste;

    public Gobierno() {
    }

    public Gobierno(String nombre, int porcentaje, boolean internaPractica, int horas, int coste) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.internaPractica = internaPractica;
        this.horas = horas;
        this.coste = coste;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID_Proyecto", unique = true, nullable = false)
    public Integer getIdProyecto() {
        return this.idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Column(name = "Nombre", nullable = false, length = 45)
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "Porcentaje", nullable = false)
    public int getPorcentaje() {
        return this.porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Column(name = "internaPractica", nullable = false)
    public boolean isInternaPractica() {
        return this.internaPractica;
    }

    public void setInternaPractica(boolean internaPractica) {
        this.internaPractica = internaPractica;
    }

    @Column(name = "Horas", nullable = false)
    public int getHoras() {
        return this.horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Column(name = "Coste", nullable = false)
    public int getCoste() {
        return this.coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

}
