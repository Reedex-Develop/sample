package career.form;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.Maxbytelength;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

//import career.entity.StaffNames;
import career.util.Defines;


/**
 * 社員情報を扱うActionFormクラス。
 * @author 佐竹一郎
 */
public class StaffForm {

    /** 社員ID */
    @Required(target = "update")
    public Integer staffId;

    /** 姓名 */
    @Required(arg0 = @Arg(key = Defines.KEY_ITEM_NAME))
    @Maxbytelength(arg0 = @Arg(key = Defines.KEY_ITEM_NAME), maxbytelength = Defines.COL_SIZE_NAME)
    public String staffName;

    /** カナ */
    @Required(arg0 = @Arg(key = Defines.KEY_ITEM_KANA))
    @Maxbytelength(arg0 = @Arg(key = Defines.KEY_ITEM_KANA), maxbytelength = Defines.COL_SIZE_KANA)
    public String staffKana;

    /** 性別 */
    @Required(arg0 = @Arg(key = Defines.KEY_ITEM_SEX))
    @Maxbytelength(arg0 = @Arg(key = Defines.KEY_ITEM_SEX), maxbytelength = Defines.COL_SIZE_SEX)
    public String sex;

    /** 生年月日 */
    @DateType(datePattern = "yyyyMMdd")
    @Maxbytelength(arg0 = @Arg(key = Defines.KEY_ITEM_BIRTHDAY), maxbytelength = Defines.COL_SIZE_BIRTHDAY)
    public String birthday;

    /** 郵便番号 */
    @Maxlength(arg0 = @Arg(key = Defines.KEY_ITEM_ZIPCODE), maxlength = Defines.COL_SIZE_ZIPCODE)
    public String zipCode;

    /** 住所 */
    @Maxbytelength(arg0 = @Arg(key = Defines.KEY_ITEM_ADDRESS), maxbytelength = Defines.COL_SIZE_ADR)
    public String address;

    /** 電話番号 */
    @Maxbytelength(arg0 = @Arg(key = Defines.KEY_ITEM_TEL), maxbytelength = Defines.COL_SIZE_TEL)
    public String tel;

    /** 最寄り駅 */
    @Maxbytelength(arg0 = @Arg(key = Defines.KEY_ITEM_STATION), maxbytelength = Defines.COL_SIZE_STATION)
    public String station;

    /** 最終学歴 */
    @Maxbytelength(arg0 = @Arg(key = Defines.KEY_ITEM_ACADEMIC), maxbytelength = Defines.COL_SIZE_ACADEMIC)
    public String lastAcademicRecord;
}
