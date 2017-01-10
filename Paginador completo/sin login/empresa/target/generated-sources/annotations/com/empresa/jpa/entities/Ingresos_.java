package com.empresa.jpa.entities;

import com.empresa.jpa.entities.Ciudades;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-12T14:53:52")
@StaticMetamodel(Ingresos.class)
public class Ingresos_ { 

    public static volatile SingularAttribute<Ingresos, String> contacto;
    public static volatile SingularAttribute<Ingresos, Integer> numeroEstuches;
    public static volatile SingularAttribute<Ingresos, Boolean> estado;
    public static volatile SingularAttribute<Ingresos, Integer> numeroFundas;
    public static volatile SingularAttribute<Ingresos, String> otros;
    public static volatile SingularAttribute<Ingresos, SimpleDateFormat> formateador;
    public static volatile SingularAttribute<Ingresos, String> direccion;
    public static volatile SingularAttribute<Ingresos, BigInteger> numOrden;
    public static volatile SingularAttribute<Ingresos, Integer> numeroEquipos;
    public static volatile SingularAttribute<Ingresos, Ciudades> idCiudad;
    public static volatile SingularAttribute<Ingresos, Date> fechaIngreso;
    public static volatile SingularAttribute<Ingresos, String> cliente;
    public static volatile SingularAttribute<Ingresos, String> transportador;
    public static volatile SingularAttribute<Ingresos, Date> horaIngreso;
    public static volatile SingularAttribute<Ingresos, String> despachoGuia;
    public static volatile SingularAttribute<Ingresos, Integer> idIngreso;
    public static volatile SingularAttribute<Ingresos, String> correo;
    public static volatile SingularAttribute<Ingresos, String> observaciones;
    public static volatile SingularAttribute<Ingresos, SimpleDateFormat> parseador;
    public static volatile SingularAttribute<Ingresos, String> telefono;
    public static volatile SingularAttribute<Ingresos, Date> fechaDespacho;
    public static volatile SingularAttribute<Ingresos, Integer> equiposRep;

}