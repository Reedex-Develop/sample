package career.service;

import static career.entity.CareerDbNames.careerId;
import static career.entity.CareerDbNames.mstDbId;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.CareerDb;

/**
 * {@link CareerDb}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class CareerDbService extends AbstractService<CareerDb> {

    /**
     * 識別子でエンティティを検索します。
     * @param careerId
     *            識別子
     * @param mstDbId
     *            識別子
     * @return エンティティ
     */
    public CareerDb findById(Integer careerId, Integer mstDbId) {
        return select().id(careerId, mstDbId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<CareerDb> findAllOrderById() {
        return select().orderBy(asc(careerId()), asc(mstDbId())).getResultList();
    }
}