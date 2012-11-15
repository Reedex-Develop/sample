package career.service;

import static career.entity.CareerRoleNames.careerId;
import static career.entity.CareerRoleNames.mstRoleId;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.CareerRole;

/**
 * {@link CareerRole}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class CareerRoleService extends AbstractService<CareerRole> {

    /**
     * 識別子でエンティティを検索します。
     * @param careerId
     *            識別子
     * @param mstRoleId
     *            識別子
     * @return エンティティ
     */
    public CareerRole findById(Integer careerId, Integer mstRoleId) {
        return select().id(careerId, mstRoleId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<CareerRole> findAllOrderById() {
        return select().orderBy(asc(careerId()), asc(mstRoleId())).getResultList();
    }
}