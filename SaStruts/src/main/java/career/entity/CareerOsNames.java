package career.entity;

import career.entity.CareerNames._CareerNames;
import career.entity.MstOsNames._MstOsNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link CareerOs}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/04/22 20:23:01")
public class CareerOsNames {

    /**
     * careerIdのプロパティ名を返します。
     * 
     * @return careerIdのプロパティ名
     */
    public static PropertyName<Integer> careerId() {
        return new PropertyName<Integer>("careerId");
    }

    /**
     * mstOsIdのプロパティ名を返します。
     * 
     * @return mstOsIdのプロパティ名
     */
    public static PropertyName<Integer> mstOsId() {
        return new PropertyName<Integer>("mstOsId");
    }

    /**
     * mstOsのプロパティ名を返します。
     * 
     * @return mstOsのプロパティ名
     */
    public static _MstOsNames mstOs() {
        return new _MstOsNames("mstOs");
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
    public static class _CareerOsNames extends PropertyName<CareerOs> {

        /**
         * インスタンスを構築します。
         */
        public _CareerOsNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CareerOsNames(final String name) {
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
        public _CareerOsNames(final PropertyName<?> parent, final String name) {
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
         * mstOsIdのプロパティ名を返します。
         *
         * @return mstOsIdのプロパティ名
         */
        public PropertyName<Integer> mstOsId() {
            return new PropertyName<Integer>(this, "mstOsId");
        }

        /**
         * mstOsのプロパティ名を返します。
         * 
         * @return mstOsのプロパティ名
         */
        public _MstOsNames mstOs() {
            return new _MstOsNames(this, "mstOs");
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