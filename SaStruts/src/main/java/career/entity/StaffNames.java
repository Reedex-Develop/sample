package career.entity;

import career.entity.CareerNames._CareerNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Staff}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/04/22 20:23:01")
public class StaffNames {

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
     * kanaのプロパティ名を返します。
     * 
     * @return kanaのプロパティ名
     */
    public static PropertyName<String> kana() {
        return new PropertyName<String>("kana");
    }

    /**
     * sexのプロパティ名を返します。
     * 
     * @return sexのプロパティ名
     */
    public static PropertyName<String> sex() {
        return new PropertyName<String>("sex");
    }

    /**
     * birthdayのプロパティ名を返します。
     * 
     * @return birthdayのプロパティ名
     */
    public static PropertyName<String> birthday() {
        return new PropertyName<String>("birthday");
    }

    /**
     * zipCodeのプロパティ名を返します。
     * 
     * @return zipCodeのプロパティ名
     */
    public static PropertyName<String> zipCode() {
        return new PropertyName<String>("zipCode");
    }

    /**
     * addressのプロパティ名を返します。
     * 
     * @return addressのプロパティ名
     */
    public static PropertyName<String> address() {
        return new PropertyName<String>("address");
    }

    /**
     * telのプロパティ名を返します。
     * 
     * @return telのプロパティ名
     */
    public static PropertyName<String> tel() {
        return new PropertyName<String>("tel");
    }

    /**
     * stationのプロパティ名を返します。
     * 
     * @return stationのプロパティ名
     */
    public static PropertyName<String> station() {
        return new PropertyName<String>("station");
    }

    /**
     * lastAcademicRecordのプロパティ名を返します。
     * 
     * @return lastAcademicRecordのプロパティ名
     */
    public static PropertyName<String> lastAcademicRecord() {
        return new PropertyName<String>("lastAcademicRecord");
    }

    /**
     * careerListのプロパティ名を返します。
     * 
     * @return careerListのプロパティ名
     */
    public static _CareerNames careerList() {
        return new _CareerNames("careerList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _StaffNames extends PropertyName<Staff> {

        /**
         * インスタンスを構築します。
         */
        public _StaffNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _StaffNames(final String name) {
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
        public _StaffNames(final PropertyName<?> parent, final String name) {
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
         * kanaのプロパティ名を返します。
         *
         * @return kanaのプロパティ名
         */
        public PropertyName<String> kana() {
            return new PropertyName<String>(this, "kana");
        }

        /**
         * sexのプロパティ名を返します。
         *
         * @return sexのプロパティ名
         */
        public PropertyName<String> sex() {
            return new PropertyName<String>(this, "sex");
        }

        /**
         * birthdayのプロパティ名を返します。
         *
         * @return birthdayのプロパティ名
         */
        public PropertyName<String> birthday() {
            return new PropertyName<String>(this, "birthday");
        }

        /**
         * zipCodeのプロパティ名を返します。
         *
         * @return zipCodeのプロパティ名
         */
        public PropertyName<String> zipCode() {
            return new PropertyName<String>(this, "zipCode");
        }

        /**
         * addressのプロパティ名を返します。
         *
         * @return addressのプロパティ名
         */
        public PropertyName<String> address() {
            return new PropertyName<String>(this, "address");
        }

        /**
         * telのプロパティ名を返します。
         *
         * @return telのプロパティ名
         */
        public PropertyName<String> tel() {
            return new PropertyName<String>(this, "tel");
        }

        /**
         * stationのプロパティ名を返します。
         *
         * @return stationのプロパティ名
         */
        public PropertyName<String> station() {
            return new PropertyName<String>(this, "station");
        }

        /**
         * lastAcademicRecordのプロパティ名を返します。
         *
         * @return lastAcademicRecordのプロパティ名
         */
        public PropertyName<String> lastAcademicRecord() {
            return new PropertyName<String>(this, "lastAcademicRecord");
        }

        /**
         * careerListのプロパティ名を返します。
         * 
         * @return careerListのプロパティ名
         */
        public _CareerNames careerList() {
            return new _CareerNames(this, "careerList");
        }
    }
}