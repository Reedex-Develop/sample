package career.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static career.entity.CareerMiddleNames.*;

/**
 * {@link CareerMiddle}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2012/04/22 19:50:17")
public class CareerMiddleTest extends S2TestCase {

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
        jdbcManager.from(CareerMiddle.class).id(1, 1).getSingleResult();
    }

    /**
     * mstMiddleとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_mstMiddle() throws Exception {
        jdbcManager.from(CareerMiddle.class).leftOuterJoin(mstMiddle()).id(1, 1).getSingleResult();
    }

    /**
     * careerとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_career() throws Exception {
        jdbcManager.from(CareerMiddle.class).leftOuterJoin(career()).id(1, 1).getSingleResult();
    }
}