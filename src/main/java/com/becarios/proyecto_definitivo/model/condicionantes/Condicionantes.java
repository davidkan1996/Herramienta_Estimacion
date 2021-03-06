package com.becarios.proyecto_definitivo.model.condicionantes;
// Generated 21-abr-2017 13:47:07 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Condicionantes generated by hbm2java
 */
@Entity
@Table(name = "condicionantes", catalog = "HE")
public class Condicionantes implements java.io.Serializable {

    private Integer id;
    private int idProyecto;
    private String descripcion;
    private boolean estimacion;

    public Condicionantes() {
    }

    public Condicionantes(int idProyecto, String descripcion, boolean estimacion) {
        this.idProyecto = idProyecto;
        this.descripcion = descripcion;
        this.estimacion = estimacion;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "idProyecto", nullable = false)
    public int getIdProyecto() {
        return this.idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Column(name = "descripcion", nullable = false, length = 250)
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column(name = "estimacion", nullable = false)
    public boolean isEstimacion() {
        return this.estimacion;
    }

    public void setEstimacion(boolean estimacion) {
        this.estimacion = estimacion;
    }

}
