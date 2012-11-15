package career.entity;

import career.entity.CareerLangNames._CareerLangNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MstLang}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/04/22 20:23:01")
public class MstLangNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * dispOrderのプロパティ名を返します。
     * 
     * @return dispOrderのプロパティ名
     */
    public static PropertyName<Integer> dispOrder() {
        return new PropertyName<Integer>("dispOrder");
    }

    /**
     * careerLangListのプロパティ名を返します。
     * 
     * @return careerLangListのプロパティ名
     */
    public static _CareerLangNames careerLangList() {
        return new _CareerLangNames("careerLangList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MstLangNames extends PropertyName<MstLang> {

        /**
         * インスタンスを構築します。
         */
        public _MstLangNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MstLangNames(final String name) {
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
        public _MstLangNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * dispOrderのプロパティ名を返します。
         *
         * @return dispOrderのプロパティ名
         */
        public PropertyName<Integer> dispOrder() {
            return new PropertyName<Integer>(this, "dispOrder");
        }

        /**
         * careerLangListのプロパティ名を返します。
         * 
         * @return careerLangListのプロパティ名
         */
        public _CareerLangNames careerLangList() {
            return new _CareerLangNames(this, "careerLangList");
        }
    }
}