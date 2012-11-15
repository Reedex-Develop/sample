package career.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * MstDbエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/04/22 20:22:58")
public class MstDb implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** nameプロパティ */
    @Column(length = 128, nullable = true, unique = false)
    public String name;

    /** dispOrderプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer dispOrder;

    /** careerDbList関連プロパティ */
    @OneToMany(mappedBy = "mstDb")
    public List<CareerDb> careerDbList;
}