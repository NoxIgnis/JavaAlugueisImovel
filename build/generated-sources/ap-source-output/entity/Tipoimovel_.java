package entity;

import entity.Imovel;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-18T13:28:57", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Tipoimovel.class)
public class Tipoimovel_ { 

    public static volatile CollectionAttribute<Tipoimovel, Imovel> imovelCollection;
    public static volatile SingularAttribute<Tipoimovel, Integer> idTipoImovel;
    public static volatile SingularAttribute<Tipoimovel, String> descricao;

}