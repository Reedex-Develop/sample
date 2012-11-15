package career.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * CareerRoleエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/04/22 20:22:58")
public class CareerRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /** careerIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = false)
    public Integer careerId;

    /** mstRoleIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = false)
    public Integer mstRoleId;

    /** mstRole関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "MST_ROLE_ID", referencedColumnName = "ID")
    public MstRole mstRole;

    /** career関連プロパティ */
    @ManyToOne
    public Career career;
}