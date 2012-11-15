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
 * Staffエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/04/22 20:22:58")
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** nameプロパティ */
    @Column(length = 128, nullable = true, unique = false)
    public String name;

    /** kanaプロパティ */
    @Column(length = 128, nullable = true, unique = false)
    public String kana;

    /** sexプロパティ */
    @Column(length = 1, nullable = true, unique = false)
    public String sex;

    /** birthdayプロパティ */
    @Column(length = 8, nullable = true, unique = false)
    public String birthday;

    /** zipCodeプロパティ */
    @Column(length = 7, nullable = true, unique = false)
    public String zipCode;

    /** addressプロパティ */
    @Column(length = 256, nullable = true, unique = false)
    public String address;

    /** telプロパティ */
    @Column(length = 32, nullable = true, unique = false)
    public String tel;

    /** stationプロパティ */
    @Column(length = 256, nullable = true, unique = false)
    public String station;

    /** lastAcademicRecordプロパティ */
    @Column(length = 256, nullable = true, unique = false)
    public String lastAcademicRecord;

    /** careerList関連プロパティ */
    @OneToMany(mappedBy = "staff")
    public List<Career> careerList;
}