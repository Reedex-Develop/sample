package career.service;

import static career.entity.StaffNames.careerList;
import static career.entity.StaffNames.id;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.Staff;

/**
 * {@link Staff}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class StaffService extends AbstractService<Staff> {

    /**
     * 識別子でエンティティを検索します。
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Staff findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子でエンティティを検索します。
     * <p>
     * 関連データも同時に取得します。
     * </p>
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Staff findByIdFullValue(Integer id) {
        return select()
            .leftOuterJoin(careerList())
            .leftOuterJoin(careerList().careerOsList())
            .leftOuterJoin(careerList().careerOsList().mstOs())
            .leftOuterJoin(careerList().careerDbList())
            .leftOuterJoin(careerList().careerDbList().mstDb())
            .leftOuterJoin(careerList().careerLangList())
            .leftOuterJoin(careerList().careerLangList().mstLang())
            .leftOuterJoin(careerList().careerMiddleList())
            .leftOuterJoin(careerList().careerMiddleList().mstMiddle())
            .leftOuterJoin(careerList().careerRoleList())
            .leftOuterJoin(careerList().careerRoleList().mstRole())
            .leftOuterJoin(careerList().careerAssignList())
            .leftOuterJoin(careerList().careerAssignList().mstAssign())
            .id(id)
            .getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<Staff> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * <p>
     * 関連データも同時に取得します。
     * </p>
     * @return エンティティのリスト
     */
    public List<Staff> findAllOrderByIdFullValue() {
        return select()
            .leftOuterJoin(careerList())
            .leftOuterJoin(careerList().careerOsList())
            .leftOuterJoin(careerList().careerOsList().mstOs())
            .leftOuterJoin(careerList().careerDbList())
            .leftOuterJoin(careerList().careerDbList().mstDb())
            .leftOuterJoin(careerList().careerLangList())
            .leftOuterJoin(careerList().careerLangList().mstLang())
            .leftOuterJoin(careerList().careerMiddleList())
            .leftOuterJoin(careerList().careerMiddleList().mstMiddle())
            .leftOuterJoin(careerList().careerRoleList())
            .leftOuterJoin(careerList().careerRoleList().mstRole())
            .leftOuterJoin(careerList().careerAssignList())
            .leftOuterJoin(careerList().careerAssignList().mstAssign())
            .orderBy(asc(id()))
            .getResultList();
    }
}