/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.jpa.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ingresos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingresos.findAll", query = "SELECT i FROM Ingresos i"),
    @NamedQuery(name = "Ingresos.findByIdIngreso", query = "SELECT i FROM Ingresos i WHERE i.idIngreso = :idIngreso"),
    @NamedQuery(name = "Ingresos.findByNumOrden", query = "SELECT i FROM Ingresos i WHERE i.numOrden = :numOrden"),
    @NamedQuery(name = "Ingresos.findByFechaIngreso", query = "SELECT i FROM Ingresos i WHERE i.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "Ingresos.findByHoraIngreso", query = "SELECT i FROM Ingresos i WHERE i.horaIngreso = :horaIngreso"),
    @NamedQuery(name = "Ingresos.findByCliente", query = "SELECT i FROM Ingresos i WHERE i.cliente = :cliente"),
    @NamedQuery(name = "Ingresos.findByContacto", query = "SELECT i FROM Ingresos i WHERE i.contacto = :contacto"),
    @NamedQuery(name = "Ingresos.findByTelefono", query = "SELECT i FROM Ingresos i WHERE i.telefono = :telefono"),
    @NamedQuery(name = "Ingresos.findByDireccion", query = "SELECT i FROM Ingresos i WHERE i.direccion = :direccion"),
    @NamedQuery(name = "Ingresos.findByCorreo", query = "SELECT i FROM Ingresos i WHERE i.correo = :correo"),
    @NamedQuery(name = "Ingresos.findByNumeroEquipos", query = "SELECT i FROM Ingresos i WHERE i.numeroEquipos = :numeroEquipos"),
    @NamedQuery(name = "Ingresos.findByEquiposRep", query = "SELECT i FROM Ingresos i WHERE i.equiposRep = :equiposRep"),
    @NamedQuery(name = "Ingresos.findByNumeroFundas", query = "SELECT i FROM Ingresos i WHERE i.numeroFundas = :numeroFundas"),
    @NamedQuery(name = "Ingresos.findByNumeroEstuches", query = "SELECT i FROM Ingresos i WHERE i.numeroEstuches = :numeroEstuches"),
    @NamedQuery(name = "Ingresos.findByOtros", query = "SELECT i FROM Ingresos i WHERE i.otros = :otros"),
    @NamedQuery(name = "Ingresos.findByTransportador", query = "SELECT i FROM Ingresos i WHERE i.transportador = :transportador"),
    @NamedQuery(name = "Ingresos.findByObservaciones", query = "SELECT i FROM Ingresos i WHERE i.observaciones = :observaciones"),
    @NamedQuery(name = "Ingresos.findByFechaDespacho", query = "SELECT i FROM Ingresos i WHERE i.fechaDespacho = :fechaDespacho"),
    @NamedQuery(name = "Ingresos.findByDespachoGuia", query = "SELECT i FROM Ingresos i WHERE i.despachoGuia = :despachoGuia"),
    @NamedQuery(name = "Ingresos.findByEstado", query = "SELECT i FROM Ingresos i WHERE i.estado = :estado"),})
public class Ingresos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ingreso")
    private Integer idIngreso;
    @Column(name = "num_orden")
    private BigInteger numOrden;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "hora_ingreso")
    @Temporal(TemporalType.TIME)
    private Date horaIngreso;
    @Size(max = 60)
    @Column(name = "cliente")
    private String cliente;
    @Size(max = 60)
    @Column(name = "contacto")
    private String contacto;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 100)
    @Column(name = "correo")
    private String correo;
    @Column(name = "numero_equipos")
    private Integer numeroEquipos;
    @Column(name = "equipos_rep")
    private Integer equiposRep;
    @Column(name = "numero_fundas")
    private Integer numeroFundas;
    @Column(name = "numero_estuches")
    private Integer numeroEstuches;
    @Size(max = 250)
    @Column(name = "otros")
    private String otros;
    @Size(max = 75)
    @Column(name = "transportador")
    private String transportador;
    @Size(max = 205)
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "fecha_despacho")
    @Temporal(TemporalType.DATE)
    private Date fechaDespacho;
    @Size(max = 85)
    @Column(name = "despacho_guia")
    private String despachoGuia;
    @Column(name = "estado")
    private Boolean estado = true;
    @JoinColumn(name = "id_ciudad", referencedColumnName = "id_ciudad")
    @ManyToOne
    private Ciudades idCiudad;

    public Ingresos() {
    }

    public Ingresos(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Integer getIdIngreso() {
        return idIngreso;
    }
    

    public void setIdIngreso(Integer idIngreso) {
        this.idIngreso = idIngreso;
    }
    
        
     public BigInteger getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(BigInteger numOrden) {
        this.numOrden = numOrden;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getNumeroEquipos() {
        return numeroEquipos;
    }

    public void setNumeroEquipos(Integer numeroEquipos) {
        this.numeroEquipos = numeroEquipos;
    }

    public Integer getEquiposRep() {
        return equiposRep;
    }

    public void setEquiposRep(Integer equiposRep) {
        this.equiposRep = equiposRep;
    }

    public Integer getNumeroFundas() {
        return numeroFundas;
    }

    public void setNumeroFundas(Integer numeroFundas) {
        this.numeroFundas = numeroFundas;
    }

    public Integer getNumeroEstuches() {
        return numeroEstuches;
    }

    public void setNumeroEstuches(Integer numeroEstuches) {
        this.numeroEstuches = numeroEstuches;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getTransportador() {
        return transportador;
    }

    public void setTransportador(String transportador) {
        this.transportador = transportador;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(Date fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public String getDespachoGuia() {
        return despachoGuia;
    }

    public void setDespachoGuia(String despachoGuia) {
        this.despachoGuia = despachoGuia;
    }
    
     public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Ciudades getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Ciudades idCiudad) {
        this.idCiudad = idCiudad;
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
        if (!(object instanceof Ingresos)) {
            return false;
        }
        Ingresos other = (Ingresos) object;
        if ((this.idIngreso == null && other.idIngreso != null) || (this.idIngreso != null && !this.idIngreso.equals(other.idIngreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.empresa.jpa.entities.Ingresos[ idIngreso=" + idIngreso + " ]";
    }
    
}
