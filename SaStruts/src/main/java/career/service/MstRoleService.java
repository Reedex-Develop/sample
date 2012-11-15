package career.service;

import static career.entity.MstRoleNames.dispOrder;
import static career.entity.MstRoleNames.id;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.MstRole;

/**
 * {@link MstRole}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class MstRoleService extends AbstractService<MstRole> {

    /**
     * 識別子でエンティティを検索します。
     * @param id
     *            識別子
     * @return エンティティ
     */
    public MstRole findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<MstRole> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }

    /**
     * 表示順の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<MstRole> findAllOrderByDisp() {
        return select().orderBy(asc(dispOrder())).getResultList();
    }
}