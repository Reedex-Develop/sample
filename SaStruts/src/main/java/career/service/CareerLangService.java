package career.service;

import static career.entity.CareerLangNames.careerId;
import static career.entity.CareerLangNames.mstLangId;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.List;

import javax.annotation.Generated;

import career.entity.CareerLang;

/**
 * {@link CareerLang}のサービスクラスです。
 */
@Generated(value = { "S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2012/04/21 22:54:20")
public class CareerLangService extends AbstractService<CareerLang> {

    /**
     * 識別子でエンティティを検索します。
     * @param careerId
     *            識別子
     * @param mstLangId
     *            識別子
     * @return エンティティ
     */
    public CareerLang findById(Integer careerId, Integer mstLangId) {
        return select().id(careerId, mstLangId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * @return エンティティのリスト
     */
    public List<CareerLang> findAllOrderById() {
        return select().orderBy(asc(careerId()), asc(mstLangId())).getResultList();
    }
}