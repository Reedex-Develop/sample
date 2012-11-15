package career.service;

import static career.entity.CareerAssignNames.careerId;
import static career.entity.CareerAssignNames.mstAssignId;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.CareerAssign;

/**
 * {@link CareerAssign}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class CareerAssignService extends AbstractService<CareerAssign> {

    /**
     * 識別子でエンティティを検索します。
     * @param careerId
     *            識別子
     * @param mstAssignId
     *            識別子
     * @return エンティティ
     */
    public CareerAssign findById(Integer careerId, Integer mstAssignId) {
        return select().id(careerId, mstAssignId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<CareerAssign> findAllOrderById() {
        return select().orderBy(asc(careerId()), asc(mstAssignId())).getResultList();
    }
}