package career.entity;

import career.entity.CareerNames._CareerNames;
import career.entity.MstLangNames._MstLangNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link CareerLang}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/04/22 20:23:01")
public class CareerLangNames {

    /**
     * careerIdのプロパティ名を返します。
     * 
     * @return careerIdのプロパティ名
     */
    public static PropertyName<Integer> careerId() {
        return new PropertyName<Integer>("careerId");
    }

    /**
     * mstLangIdのプロパティ名を返します。
     * 
     * @return mstLangIdのプロパティ名
     */
    public static PropertyName<Integer> mstLangId() {
        return new PropertyName<Integer>("mstLangId");
    }

    /**
     * mstLangのプロパティ名を返します。
     * 
     * @return mstLangのプロパティ名
     */
    public static _MstLangNames mstLang() {
        return new _MstLangNames("mstLang");
    }

    /**
     * careerのプロパティ名を返します。
     * 
     * @return careerのプロパティ名
     */
    public static _CareerNames career() {
        return new _CareerNames("career");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CareerLangNames extends PropertyName<CareerLang> {

        /**
         * インスタンスを構築します。
         */
        public _CareerLangNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CareerLangNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _CareerLangNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * careerIdのプロパティ名を返します。
         *
         * @return careerIdのプロパティ名
         */
        public PropertyName<Integer> careerId() {
            return new PropertyName<Integer>(this, "careerId");
        }

        /**
         * mstLangIdのプロパティ名を返します。
         *
         * @return mstLangIdのプロパティ名
         */
        public PropertyName<Integer> mstLangId() {
            return new PropertyName<Integer>(this, "mstLangId");
        }

        /**
         * mstLangのプロパティ名を返します。
         * 
         * @return mstLangのプロパティ名
         */
        public _MstLangNames mstLang() {
            return new _MstLangNames(this, "mstLang");
        }

        /**
         * careerのプロパティ名を返します。
         * 
         * @return careerのプロパティ名
         */
        public _CareerNames career() {
            return new _CareerNames(this, "career");
        }
    }
}