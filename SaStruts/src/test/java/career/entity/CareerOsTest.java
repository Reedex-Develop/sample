package career.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static career.entity.CareerOsNames.*;

/**
 * {@link CareerOs}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2012/04/22 19:50:17")
public class CareerOsTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(CareerOs.class).id(1, 1).getSingleResult();
    }

    /**
     * mstOsとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_mstOs() throws Exception {
        jdbcManager.from(CareerOs.class).leftOuterJoin(mstOs()).id(1, 1).getSingleResult();
    }

    /**
     * careerとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_career() throws Exception {
        jdbcManager.from(CareerOs.class).leftOuterJoin(career()).id(1, 1).getSingleResult();
    }
}