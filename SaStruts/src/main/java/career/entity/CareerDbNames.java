package career.entity;

import career.entity.CareerNames._CareerNames;
import career.entity.MstDbNames._MstDbNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link CareerDb}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/04/22 20:23:01")
public class CareerDbNames {

    /**
     * careerIdのプロパティ名を返します。
     * 
     * @return careerIdのプロパティ名
     */
    public static PropertyName<Integer> careerId() {
        return new PropertyName<Integer>("careerId");
    }

    /**
     * mstDbIdのプロパティ名を返します。
     * 
     * @return mstDbIdのプロパティ名
     */
    public static PropertyName<Integer> mstDbId() {
        return new PropertyName<Integer>("mstDbId");
    }

    /**
     * mstDbのプロパティ名を返します。
     * 
     * @return mstDbのプロパティ名
     */
    public static _MstDbNames mstDb() {
        return new _MstDbNames("mstDb");
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
    public static class _CareerDbNames extends PropertyName<CareerDb> {

        /**
         * インスタンスを構築します。
         */
        public _CareerDbNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CareerDbNames(final String name) {
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
        public _CareerDbNames(final PropertyName<?> parent, final String name) {
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
         * mstDbIdのプロパティ名を返します。
         *
         * @return mstDbIdのプロパティ名
         */
        public PropertyName<Integer> mstDbId() {
            return new PropertyName<Integer>(this, "mstDbId");
        }

        /**
         * mstDbのプロパティ名を返します。
         * 
         * @return mstDbのプロパティ名
         */
        public _MstDbNames mstDb() {
            return new _MstDbNames(this, "mstDb");
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