package career.entity;

import career.entity.CareerAssignNames._CareerAssignNames;
import career.entity.CareerDbNames._CareerDbNames;
import career.entity.CareerLangNames._CareerLangNames;
import career.entity.CareerMiddleNames._CareerMiddleNames;
import career.entity.CareerOsNames._CareerOsNames;
import career.entity.CareerRoleNames._CareerRoleNames;
import career.entity.StaffNames._StaffNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Career}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/04/22 20:23:01")
public class CareerNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * staffIdのプロパティ名を返します。
     * 
     * @return staffIdのプロパティ名
     */
    public static PropertyName<Integer> staffId() {
        return new PropertyName<Integer>("staffId");
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
     * customerのプロパティ名を返します。
     * 
     * @return customerのプロパティ名
     */
    public static PropertyName<String> customer() {
        return new PropertyName<String>("customer");
    }

    /**
     * summaryのプロパティ名を返します。
     * 
     * @return summaryのプロパティ名
     */
    public static PropertyName<String> summary() {
        return new PropertyName<String>("summary");
    }

    /**
     * projectMembersのプロパティ名を返します。
     * 
     * @return projectMembersのプロパティ名
     */
    public static PropertyName<Integer> projectMembers() {
        return new PropertyName<Integer>("projectMembers");
    }

    /**
     * teamMembersのプロパティ名を返します。
     * 
     * @return teamMembersのプロパティ名
     */
    public static PropertyName<Integer> teamMembers() {
        return new PropertyName<Integer>("teamMembers");
    }

    /**
     * startYmのプロパティ名を返します。
     * 
     * @return startYmのプロパティ名
     */
    public static PropertyName<String> startYm() {
        return new PropertyName<String>("startYm");
    }

    /**
     * endYmのプロパティ名を返します。
     * 
     * @return endYmのプロパティ名
     */
    public static PropertyName<String> endYm() {
        return new PropertyName<String>("endYm");
    }

    /**
     * staffのプロパティ名を返します。
     * 
     * @return staffのプロパティ名
     */
    public static _StaffNames staff() {
        return new _StaffNames("staff");
    }

    /**
     * careerAssignListのプロパティ名を返します。
     * 
     * @return careerAssignListのプロパティ名
     */
    public static _CareerAssignNames careerAssignList() {
        return new _CareerAssignNames("careerAssignList");
    }

    /**
     * careerDbListのプロパティ名を返します。
     * 
     * @return careerDbListのプロパティ名
     */
    public static _CareerDbNames careerDbList() {
        return new _CareerDbNames("careerDbList");
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
     * careerMiddleListのプロパティ名を返します。
     * 
     * @return careerMiddleListのプロパティ名
     */
    public static _CareerMiddleNames careerMiddleList() {
        return new _CareerMiddleNames("careerMiddleList");
    }

    /**
     * careerOsListのプロパティ名を返します。
     * 
     * @return careerOsListのプロパティ名
     */
    public static _CareerOsNames careerOsList() {
        return new _CareerOsNames("careerOsList");
    }

    /**
     * careerRoleListのプロパティ名を返します。
     * 
     * @return careerRoleListのプロパティ名
     */
    public static _CareerRoleNames careerRoleList() {
        return new _CareerRoleNames("careerRoleList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CareerNames extends PropertyName<Career> {

        /**
         * インスタンスを構築します。
         */
        public _CareerNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CareerNames(final String name) {
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
        public _CareerNames(final PropertyName<?> parent, final String name) {
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
         * staffIdのプロパティ名を返します。
         *
         * @return staffIdのプロパティ名
         */
        public PropertyName<Integer> staffId() {
            return new PropertyName<Integer>(this, "staffId");
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
         * customerのプロパティ名を返します。
         *
         * @return customerのプロパティ名
         */
        public PropertyName<String> customer() {
            return new PropertyName<String>(this, "customer");
        }

        /**
         * summaryのプロパティ名を返します。
         *
         * @return summaryのプロパティ名
         */
        public PropertyName<String> summary() {
            return new PropertyName<String>(this, "summary");
        }

        /**
         * projectMembersのプロパティ名を返します。
         *
         * @return projectMembersのプロパティ名
         */
        public PropertyName<Integer> projectMembers() {
            return new PropertyName<Integer>(this, "projectMembers");
        }

        /**
         * teamMembersのプロパティ名を返します。
         *
         * @return teamMembersのプロパティ名
         */
        public PropertyName<Integer> teamMembers() {
            return new PropertyName<Integer>(this, "teamMembers");
        }

        /**
         * startYmのプロパティ名を返します。
         *
         * @return startYmのプロパティ名
         */
        public PropertyName<String> startYm() {
            return new PropertyName<String>(this, "startYm");
        }

        /**
         * endYmのプロパティ名を返します。
         *
         * @return endYmのプロパティ名
         */
        public PropertyName<String> endYm() {
            return new PropertyName<String>(this, "endYm");
        }

        /**
         * staffのプロパティ名を返します。
         * 
         * @return staffのプロパティ名
         */
        public _StaffNames staff() {
            return new _StaffNames(this, "staff");
        }

        /**
         * careerAssignListのプロパティ名を返します。
         * 
         * @return careerAssignListのプロパティ名
         */
        public _CareerAssignNames careerAssignList() {
            return new _CareerAssignNames(this, "careerAssignList");
        }

        /**
         * careerDbListのプロパティ名を返します。
         * 
         * @return careerDbListのプロパティ名
         */
        public _CareerDbNames careerDbList() {
            return new _CareerDbNames(this, "careerDbList");
        }

        /**
         * careerLangListのプロパティ名を返します。
         * 
         * @return careerLangListのプロパティ名
         */
        public _CareerLangNames careerLangList() {
            return new _CareerLangNames(this, "careerLangList");
        }

        /**
         * careerMiddleListのプロパティ名を返します。
         * 
         * @return careerMiddleListのプロパティ名
         */
        public _CareerMiddleNames careerMiddleList() {
            return new _CareerMiddleNames(this, "careerMiddleList");
        }

        /**
         * careerOsListのプロパティ名を返します。
         * 
         * @return careerOsListのプロパティ名
         */
        public _CareerOsNames careerOsList() {
            return new _CareerOsNames(this, "careerOsList");
        }

        /**
         * careerRoleListのプロパティ名を返します。
         * 
         * @return careerRoleListのプロパティ名
         */
        public _CareerRoleNames careerRoleList() {
            return new _CareerRoleNames(this, "careerRoleList");
        }
    }
}