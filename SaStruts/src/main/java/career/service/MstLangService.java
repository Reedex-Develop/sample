package career.service;

import static career.entity.MstLangNames.dispOrder;
import static career.entity.MstLangNames.id;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.MstLang;

/**
 * {@link MstLang}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class MstLangService extends AbstractService<MstLang> {

    /**
     * 識別子でエンティティを検索します。
     * @param id
     *            識別子
     * @return エンティティ
     */
    public MstLang findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<MstLang> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }

    /**
     * 表示順の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<MstLang> findAllOrderByDisp() {
        return select().orderBy(asc(dispOrder())).getResultList();
    }
}