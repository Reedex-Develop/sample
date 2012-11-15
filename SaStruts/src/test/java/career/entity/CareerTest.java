package career.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static career.entity.CareerNames.*;

/**
 * {@link Career}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2012/04/22 19:50:17")
public class CareerTest extends S2TestCase {

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
        jdbcManager.from(Career.class).id(1).getSingleResult();
    }

    /**
     * staffとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_staff() throws Exception {
        jdbcManager.from(Career.class).leftOuterJoin(staff()).id(1).getSingleResult();
    }

    /**
     * careerDbListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_careerDbList() throws Exception {
        jdbcManager.from(Career.class).leftOuterJoin(careerDbList()).id(1).getSingleResult();
    }

    /**
     * careerLangListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_careerLangList() throws Exception {
        jdbcManager.from(Career.class).leftOuterJoin(careerLangList()).id(1).getSingleResult();
    }

    /**
     * careerMiddleListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_careerMiddleList() throws Exception {
        jdbcManager.from(Career.class).leftOuterJoin(careerMiddleList()).id(1).getSingleResult();
    }

    /**
     * careerOsListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_careerOsList() throws Exception {
        jdbcManager.from(Career.class).leftOuterJoin(careerOsList()).id(1).getSingleResult();
    }

    /**
     * careerRoleListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_careerRoleList() throws Exception {
        jdbcManager.from(Career.class).leftOuterJoin(careerRoleList()).id(1).getSingleResult();
    }
}