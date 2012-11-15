package career.entity;

import career.entity.CareerNames._CareerNames;
import career.entity.MstRoleNames._MstRoleNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link CareerRole}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/04/22 20:23:01")
public class CareerRoleNames {

    /**
     * careerIdのプロパティ名を返します。
     * 
     * @return careerIdのプロパティ名
     */
    public static PropertyName<Integer> careerId() {
        return new PropertyName<Integer>("careerId");
    }

    /**
     * mstRoleIdのプロパティ名を返します。
     * 
     * @return mstRoleIdのプロパティ名
     */
    public static PropertyName<Integer> mstRoleId() {
        return new PropertyName<Integer>("mstRoleId");
    }

    /**
     * mstRoleのプロパティ名を返します。
     * 
     * @return mstRoleのプロパティ名
     */
    public static _MstRoleNames mstRole() {
        return new _MstRoleNames("mstRole");
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
    public static class _CareerRoleNames extends PropertyName<CareerRole> {

        /**
         * インスタンスを構築します。
         */
        public _CareerRoleNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CareerRoleNames(final String name) {
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
        public _CareerRoleNames(final PropertyName<?> parent, final String name) {
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
         * mstRoleIdのプロパティ名を返します。
         *
         * @return mstRoleIdのプロパティ名
         */
        public PropertyName<Integer> mstRoleId() {
            return new PropertyName<Integer>(this, "mstRoleId");
        }

        /**
         * mstRoleのプロパティ名を返します。
         * 
         * @return mstRoleのプロパティ名
         */
        public _MstRoleNames mstRole() {
            return new _MstRoleNames(this, "mstRole");
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