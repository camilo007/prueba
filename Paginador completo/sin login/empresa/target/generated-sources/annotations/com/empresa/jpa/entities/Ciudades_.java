package com.empresa.jpa.entities;

import com.empresa.jpa.entities.Departamentos;
import com.empresa.jpa.entities.Ingresos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-12T14:53:52")
@StaticMetamodel(Ciudades.class)
public class Ciudades_ { 

    public static volatile SingularAttribute<Ciudades, Departamentos> idDepartamento;
    public static volatile SingularAttribute<Ciudades, String> nombreCiudad;
    public static volatile ListAttribute<Ciudades, Ingresos> ingresosList;
    public static volatile SingularAttribute<Ciudades, Integer> idCiudad;

}