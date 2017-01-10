/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jefferson
 */
@Entity
@Table(name = "ingresos_au")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IngresosAu.findAll", query = "SELECT i FROM IngresosAu i"),
    @NamedQuery(name = "IngresosAu.findByIdIngreso", query = "SELECT i FROM IngresosAu i WHERE i.idIngreso = :idIngreso"),
    @NamedQuery(name = "IngresosAu.findByFechaIngresoOld", query = "SELECT i FROM IngresosAu i WHERE i.fechaIngresoOld = :fechaIngresoOld"),
    @NamedQuery(name = "IngresosAu.findByHoraIngresoOld", query = "SELECT i FROM IngresosAu i WHERE i.horaIngresoOld = :horaIngresoOld"),
    @NamedQuery(name = "IngresosAu.findByClienteOld", query = "SELECT i FROM IngresosAu i WHERE i.clienteOld = :clienteOld"),
    @NamedQuery(name = "IngresosAu.findByContactoOld", query = "SELECT i FROM IngresosAu i WHERE i.contactoOld = :contactoOld"),
    @NamedQuery(name = "IngresosAu.findByTelefonoOld", query = "SELECT i FROM IngresosAu i WHERE i.telefonoOld = :telefonoOld"),
    @NamedQuery(name = "IngresosAu.findByCorreoOld", query = "SELECT i FROM IngresosAu i WHERE i.correoOld = :correoOld"),
    @NamedQuery(name = "IngresosAu.findByNumeroEquiposOld", query = "SELECT i FROM IngresosAu i WHERE i.numeroEquiposOld = :numeroEquiposOld"),
    @NamedQuery(name = "IngresosAu.findByEquiposRepOld", query = "SELECT i FROM IngresosAu i WHERE i.equiposRepOld = :equiposRepOld"),
    @NamedQuery(name = "IngresosAu.findByNumeroFundasOld", query = "SELECT i FROM IngresosAu i WHERE i.numeroFundasOld = :numeroFundasOld"),
    @NamedQuery(name = "IngresosAu.findByNumeroEstuchesOld", query = "SELECT i FROM IngresosAu i WHERE i.numeroEstuchesOld = :numeroEstuchesOld"),
    @NamedQuery(name = "IngresosAu.findByOtrosOld", query = "SELECT i FROM IngresosAu i WHERE i.otrosOld = :otrosOld"),
    @NamedQuery(name = "IngresosAu.findByTransportadorOld", query = "SELECT i FROM IngresosAu i WHERE i.transportadorOld = :transportadorOld"),
    @NamedQuery(name = "IngresosAu.findByObservacionesOld", query = "SELECT i FROM IngresosAu i WHERE i.observacionesOld = :observacionesOld"),
    @NamedQuery(name = "IngresosAu.findByFechaDespachoOld", query = "SELECT i FROM IngresosAu i WHERE i.fechaDespachoOld = :fechaDespachoOld"),
    @NamedQuery(name = "IngresosAu.findByDespachoGuiaOld", query = "SELECT i FROM IngresosAu i WHERE i.despachoGuiaOld = :despachoGuiaOld"),
    @NamedQuery(name = "IngresosAu.findByFechaIngresoNew", query = "SELECT i FROM IngresosAu i WHERE i.fechaIngresoNew = :fechaIngresoNew"),
    @NamedQuery(name = "IngresosAu.findByHoraIngresoNew", query = "SELECT i FROM IngresosAu i WHERE i.horaIngresoNew = :horaIngresoNew"),
    @NamedQuery(name = "IngresosAu.findByClienteNew", query = "SELECT i FROM IngresosAu i WHERE i.clienteNew = :clienteNew"),
    @NamedQuery(name = "IngresosAu.findByContactoNew", query = "SELECT i FROM IngresosAu i WHERE i.contactoNew = :contactoNew"),
    @NamedQuery(name = "IngresosAu.findByTelefonoNew", query = "SELECT i FROM IngresosAu i WHERE i.telefonoNew = :telefonoNew"),
    @NamedQuery(name = "IngresosAu.findByCorreoNew", query = "SELECT i FROM IngresosAu i WHERE i.correoNew = :correoNew"),
    @NamedQuery(name = "IngresosAu.findByNumeroEquiposNew", query = "SELECT i FROM IngresosAu i WHERE i.numeroEquiposNew = :numeroEquiposNew"),
    @NamedQuery(name = "IngresosAu.findByEquiposRepNew", query = "SELECT i FROM IngresosAu i WHERE i.equiposRepNew = :equiposRepNew"),
    @NamedQuery(name = "IngresosAu.findByNumeroFundasNew", query = "SELECT i FROM IngresosAu i WHERE i.numeroFundasNew = :numeroFundasNew"),
    @NamedQuery(name = "IngresosAu.findByNumeroEstuchesNew", query = "SELECT i FROM IngresosAu i WHERE i.numeroEstuchesNew = :numeroEstuchesNew"),
    @NamedQuery(name = "IngresosAu.findByOtrosNew", query = "SELECT i FROM IngresosAu i WHERE i.otrosNew = :otrosNew"),
    @NamedQuery(name = "IngresosAu.findByTransportadorNew", query = "SELECT i FROM IngresosAu i WHERE i.transportadorNew = :transportadorNew"),
    @NamedQuery(name = "IngresosAu.findByObservacionesNew", query = "SELECT i FROM IngresosAu i WHERE i.observacionesNew = :observacionesNew"),
    @NamedQuery(name = "IngresosAu.findByFechaDespachoNew", query = "SELECT i FROM IngresosAu i WHERE i.fechaDespachoNew = :fechaDespachoNew"),
    @NamedQuery(name = "IngresosAu.findByDespachoGuiaNew", query = "SELECT i FROM IngresosAu i WHERE i.despachoGuiaNew = :despachoGuiaNew")})
public class IngresosAu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ingreso")
    private Integer idIngreso;
    @Column(name = "fecha_ingreso_old")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoOld;
    @Column(name = "hora_ingreso_old")
    @Temporal(TemporalType.TIME)
    private Date horaIngresoOld;
    @Size(max = 60)
    @Column(name = "cliente_old")
    private String clienteOld;
    @Size(max = 60)
    @Column(name = "contacto_old")
    private String contactoOld;
    @Size(max = 45)
    @Column(name = "telefono_old")
    private String telefonoOld;
    @Size(max = 100)
    @Column(name = "correo_old")
    private String correoOld;
    @Column(name = "numero_equipos_old")
    private Integer numeroEquiposOld;
    @Column(name = "equipos_rep_old")
    private Integer equiposRepOld;
    @Column(name = "numero_fundas_old")
    private Integer numeroFundasOld;
    @Column(name = "numero_estuches_old")
    private Integer numeroEstuchesOld;
    @Size(max = 75)
    @Column(name = "otros_old")
    private String otrosOld;
    @Size(max = 75)
    @Column(name = "transportador_old")
    private String transportadorOld;
    @Size(max = 205)
    @Column(name = "observaciones_old")
    private String observacionesOld;
    @Column(name = "fecha_despacho_old")
    @Temporal(TemporalType.DATE)
    private Date fechaDespachoOld;
    @Size(max = 85)
    @Column(name = "despacho_guia_old")
    private String despachoGuiaOld;
    @Column(name = "fecha_ingreso_new")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoNew;
    @Column(name = "hora_ingreso_new")
    @Temporal(TemporalType.TIME)
    private Date horaIngresoNew;
    @Size(max = 60)
    @Column(name = "cliente_new")
    private String clienteNew;
    @Size(max = 60)
    @Column(name = "contacto_new")
    private String contactoNew;
    @Size(max = 45)
    @Column(name = "telefono_new")
    private String telefonoNew;
    @Size(max = 100)
    @Column(name = "correo_new")
    private String correoNew;
    @Column(name = "numero_equipos_new")
    private Integer numeroEquiposNew;
    @Column(name = "equipos_rep_new")
    private Integer equiposRepNew;
    @Column(name = "numero_fundas_new")
    private Integer numeroFundasNew;
    @Column(name = "numero_estuches_new")
    private Integer numeroEstuchesNew;
    @Size(max = 75)
    @Column(name = "otros_new")
    private String otrosNew;
    @Size(max = 75)
    @Column(name = "transportador_new")
    private String transportadorNew;
    @Size(max = 205)
    @Column(name = "observaciones_new")
    private String observacionesNew;
    @Column(name = "fecha_despacho_new")
    @Temporal(TemporalType.DATE)
    private Date fechaDespachoNew;
    @Size(max = 85)
    @Column(name = "despacho_guia_new")
    private String despachoGuiaNew;

    public IngresosAu() {
    }

    public IngresosAu(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Integer getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Date getFechaIngresoOld() {
        return fechaIngresoOld;
    }

    public void setFechaIngresoOld(Date fechaIngresoOld) {
        this.fechaIngresoOld = fechaIngresoOld;
    }

    public Date getHoraIngresoOld() {
        return horaIngresoOld;
    }

    public void setHoraIngresoOld(Date horaIngresoOld) {
        this.horaIngresoOld = horaIngresoOld;
    }

    public String getClienteOld() {
        return clienteOld;
    }

    public void setClienteOld(String clienteOld) {
        this.clienteOld = clienteOld;
    }

    public String getContactoOld() {
        return contactoOld;
    }

    public void setContactoOld(String contactoOld) {
        this.contactoOld = contactoOld;
    }

    public String getTelefonoOld() {
        return telefonoOld;
    }

    public void setTelefonoOld(String telefonoOld) {
        this.telefonoOld = telefonoOld;
    }

    public String getCorreoOld() {
        return correoOld;
    }

    public void setCorreoOld(String correoOld) {
        this.correoOld = correoOld;
    }

    public Integer getNumeroEquiposOld() {
        return numeroEquiposOld;
    }

    public void setNumeroEquiposOld(Integer numeroEquiposOld) {
        this.numeroEquiposOld = numeroEquiposOld;
    }

    public Integer getEquiposRepOld() {
        return equiposRepOld;
    }

    public void setEquiposRepOld(Integer equiposRepOld) {
        this.equiposRepOld = equiposRepOld;
    }

    public Integer getNumeroFundasOld() {
        return numeroFundasOld;
    }

    public void setNumeroFundasOld(Integer numeroFundasOld) {
        this.numeroFundasOld = numeroFundasOld;
    }

    public Integer getNumeroEstuchesOld() {
        return numeroEstuchesOld;
    }

    public void setNumeroEstuchesOld(Integer numeroEstuchesOld) {
        this.numeroEstuchesOld = numeroEstuchesOld;
    }

    public String getOtrosOld() {
        return otrosOld;
    }

    public void setOtrosOld(String otrosOld) {
        this.otrosOld = otrosOld;
    }

    public String getTransportadorOld() {
        return transportadorOld;
    }

    public void setTransportadorOld(String transportadorOld) {
        this.transportadorOld = transportadorOld;
    }

    public String getObservacionesOld() {
        return observacionesOld;
    }

    public void setObservacionesOld(String observacionesOld) {
        this.observacionesOld = observacionesOld;
    }

    public Date getFechaDespachoOld() {
        return fechaDespachoOld;
    }

    public void setFechaDespachoOld(Date fechaDespachoOld) {
        this.fechaDespachoOld = fechaDespachoOld;
    }

    public String getDespachoGuiaOld() {
        return despachoGuiaOld;
    }

    public void setDespachoGuiaOld(String despachoGuiaOld) {
        this.despachoGuiaOld = despachoGuiaOld;
    }

    public Date getFechaIngresoNew() {
        return fechaIngresoNew;
    }

    public void setFechaIngresoNew(Date fechaIngresoNew) {
        this.fechaIngresoNew = fechaIngresoNew;
    }

    public Date getHoraIngresoNew() {
        return horaIngresoNew;
    }

    public void setHoraIngresoNew(Date horaIngresoNew) {
        this.horaIngresoNew = horaIngresoNew;
    }

    public String getClienteNew() {
        return clienteNew;
    }

    public void setClienteNew(String clienteNew) {
        this.clienteNew = clienteNew;
    }

    public String getContactoNew() {
        return contactoNew;
    }

    public void setContactoNew(String contactoNew) {
        this.contactoNew = contactoNew;
    }

    public String getTelefonoNew() {
        return telefonoNew;
    }

    public void setTelefonoNew(String telefonoNew) {
        this.telefonoNew = telefonoNew;
    }

    public String getCorreoNew() {
        return correoNew;
    }

    public void setCorreoNew(String correoNew) {
        this.correoNew = correoNew;
    }

    public Integer getNumeroEquiposNew() {
        return numeroEquiposNew;
    }

    public void setNumeroEquiposNew(Integer numeroEquiposNew) {
        this.numeroEquiposNew = numeroEquiposNew;
    }

    public Integer getEquiposRepNew() {
        return equiposRepNew;
    }

    public void setEquiposRepNew(Integer equiposRepNew) {
        this.equiposRepNew = equiposRepNew;
    }

    public Integer getNumeroFundasNew() {
        return numeroFundasNew;
    }

    public void setNumeroFundasNew(Integer numeroFundasNew) {
        this.numeroFundasNew = numeroFundasNew;
    }

    public Integer getNumeroEstuchesNew() {
        return numeroEstuchesNew;
    }

    public void setNumeroEstuchesNew(Integer numeroEstuchesNew) {
        this.numeroEstuchesNew = numeroEstuchesNew;
    }

    public String getOtrosNew() {
        return otrosNew;
    }

    public void setOtrosNew(String otrosNew) {
        this.otrosNew = otrosNew;
    }

    public String getTransportadorNew() {
        return transportadorNew;
    }

    public void setTransportadorNew(String transportadorNew) {
        this.transportadorNew = transportadorNew;
    }

    public String getObservacionesNew() {
        return observacionesNew;
    }

    public void setObservacionesNew(String observacionesNew) {
        this.observacionesNew = observacionesNew;
    }

    public Date getFechaDespachoNew() {
        return fechaDespachoNew;
    }

    public void setFechaDespachoNew(Date fechaDespachoNew) {
        this.fechaDespachoNew = fechaDespachoNew;
    }

    public String getDespachoGuiaNew() {
        return despachoGuiaNew;
    }

    public void setDespachoGuiaNew(String despachoGuiaNew) {
        this.despachoGuiaNew = despachoGuiaNew;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIngreso != null ? idIngreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngresosAu)) {
            return false;
        }
        IngresosAu other = (IngresosAu) object;
        if ((this.idIngreso == null && other.idIngreso != null) || (this.idIngreso != null && !this.idIngreso.equals(other.idIngreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.jpa.entities.IngresosAu[ idIngreso=" + idIngreso + " ]";
    }
    
}
