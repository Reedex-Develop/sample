package career.entity;

import career.entity.CareerNames._CareerNames;
import career.entity.MstMiddleNames._MstMiddleNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link CareerMiddle}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/04/22 20:23:01")
public class CareerMiddleNames {

    /**
     * careerIdのプロパティ名を返します。
     * 
     * @return careerIdのプロパティ名
     */
    public static PropertyName<Integer> careerId() {
        return new PropertyName<Integer>("careerId");
    }

    /**
     * mstMiddleIdのプロパティ名を返します。
     * 
     * @return mstMiddleIdのプロパティ名
     */
    public static PropertyName<Integer> mstMiddleId() {
        return new PropertyName<Integer>("mstMiddleId");
    }

    /**
     * mstMiddleのプロパティ名を返します。
     * 
     * @return mstMiddleのプロパティ名
     */
    public static _MstMiddleNames mstMiddle() {
        return new _MstMiddleNames("mstMiddle");
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
    public static class _CareerMiddleNames extends PropertyName<CareerMiddle> {

        /**
         * インスタンスを構築します。
         */
        public _CareerMiddleNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CareerMiddleNames(final String name) {
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
        public _CareerMiddleNames(final PropertyName<?> parent, final String name) {
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
         * mstMiddleIdのプロパティ名を返します。
         *
         * @return mstMiddleIdのプロパティ名
         */
        public PropertyName<Integer> mstMiddleId() {
            return new PropertyName<Integer>(this, "mstMiddleId");
        }

        /**
         * mstMiddleのプロパティ名を返します。
         * 
         * @return mstMiddleのプロパティ名
         */
        public _MstMiddleNames mstMiddle() {
            return new _MstMiddleNames(this, "mstMiddle");
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