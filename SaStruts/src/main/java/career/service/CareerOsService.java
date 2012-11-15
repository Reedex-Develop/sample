package career.service;

import static career.entity.CareerOsNames.careerId;
import static career.entity.CareerOsNames.mstOsId;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.CareerOs;

/**
 * {@link CareerOs}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class CareerOsService extends AbstractService<CareerOs> {

    /**
     * 識別子でエンティティを検索します。
     * @param careerId
     *            識別子
     * @param mstOsId
     *            識別子
     * @return エンティティ
     */
    public CareerOs findById(Integer careerId, Integer mstOsId) {
        return select().id(careerId, mstOsId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<CareerOs> findAllOrderById() {
        return select().orderBy(asc(careerId()), asc(mstOsId())).getResultList();
    }
}