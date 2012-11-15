package career.service;

import static career.entity.MstOsNames.dispOrder;
import static career.entity.MstOsNames.id;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.MstOs;

/**
 * {@link MstOs}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class MstOsService extends AbstractService<MstOs> {

    /**
     * 識別子でエンティティを検索します。
     * @param id
     *            識別子
     * @return エンティティ
     */
    public MstOs findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<MstOs> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }

    /**
     * 表示順の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<MstOs> findAllOrderByDisp() {
        return select().orderBy(asc(dispOrder())).getResultList();
    }
}