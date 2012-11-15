package career.service;

import static career.entity.CareerNames.careerAssignList;
import static career.entity.CareerNames.careerDbList;
import static career.entity.CareerNames.careerLangList;
import static career.entity.CareerNames.careerMiddleList;
import static career.entity.CareerNames.careerOsList;
import static career.entity.CareerNames.careerRoleList;
import static career.entity.CareerNames.id;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.Career;

/**
 * {@link Career}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class CareerService extends AbstractService<Career> {

    /**
     * 識別子でエンティティを検索します。
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Career findById(Integer id) {
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
    public Career findByIdFullValue(Integer id) {
        return select()
            .leftOuterJoin(careerOsList())
            .leftOuterJoin(careerOsList().mstOs())
            .leftOuterJoin(careerLangList())
            .leftOuterJoin(careerLangList().mstLang())
            .leftOuterJoin(careerDbList())
            .leftOuterJoin(careerDbList().mstDb())
            .leftOuterJoin(careerMiddleList())
            .leftOuterJoin(careerMiddleList().mstMiddle())
            .leftOuterJoin(careerRoleList())
            .leftOuterJoin(careerRoleList().mstRole())
            .leftOuterJoin(careerAssignList())
            .leftOuterJoin(careerAssignList().mstAssign())
            .id(id)
            .getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<Career> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * <p>
     * 関連データも同時に取得します。
     * </p>
     * @return エンティティのリスト
     */
    public List<Career> findAllOrderByIdFullValue() {
        return select()
            .leftOuterJoin(careerOsList())
            .leftOuterJoin(careerOsList().mstOs())
            .leftOuterJoin(careerLangList())
            .leftOuterJoin(careerLangList().mstLang())
            .leftOuterJoin(careerDbList())
            .leftOuterJoin(careerDbList().mstDb())
            .leftOuterJoin(careerMiddleList())
            .leftOuterJoin(careerMiddleList().mstMiddle())
            .leftOuterJoin(careerRoleList())
            .leftOuterJoin(careerRoleList().mstRole())
            .leftOuterJoin(careerAssignList())
            .leftOuterJoin(careerAssignList().mstAssign())
            .orderBy(asc(id()))
            .getResultList();
    }

}