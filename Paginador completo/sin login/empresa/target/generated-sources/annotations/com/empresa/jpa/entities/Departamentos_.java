package com.empresa.jpa.entities;

import com.empresa.jpa.entities.Ciudades;
import com.empresa.jpa.entities.Paises;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-12T14:53:52")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, Integer> idDepartamento;
    public static volatile SingularAttribute<Departamentos, String> nombreDepartamento;
    public static volatile SingularAttribute<Departamentos, Paises> idPais;
    public static volatile ListAttribute<Departamentos, Ciudades> ciudadesList;

}