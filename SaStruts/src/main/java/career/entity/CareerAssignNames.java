package career.entity;

import career.entity.CareerNames._CareerNames;
import career.entity.MstAssignNames._MstAssignNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link CareerAssign}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/04/22 20:23:01")
public class CareerAssignNames {

    /**
     * careerIdのプロパティ名を返します。
     * 
     * @return careerIdのプロパティ名
     */
    public static PropertyName<Integer> careerId() {
        return new PropertyName<Integer>("careerId");
    }

    /**
     * mstAssignIdのプロパティ名を返します。
     * 
     * @return mstAssignIdのプロパティ名
     */
    public static PropertyName<Integer> mstAssignId() {
        return new PropertyName<Integer>("mstAssignId");
    }

    /**
     * mstAssignのプロパティ名を返します。
     * 
     * @return mstAssignのプロパティ名
     */
    public static _MstAssignNames mstAssign() {
        return new _MstAssignNames("mstAssign");
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
    public static class _CareerAssignNames extends PropertyName<CareerAssign> {

        /**
         * インスタンスを構築します。
         */
        public _CareerAssignNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CareerAssignNames(final String name) {
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
        public _CareerAssignNames(final PropertyName<?> parent, final String name) {
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
         * mstAssignIdのプロパティ名を返します。
         *
         * @return mstAssignIdのプロパティ名
         */
        public PropertyName<Integer> mstAssignId() {
            return new PropertyName<Integer>(this, "mstAssignId");
        }

        /**
         * mstAssignのプロパティ名を返します。
         * 
         * @return mstAssignのプロパティ名
         */
        public _MstAssignNames mstAssign() {
            return new _MstAssignNames(this, "mstAssign");
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