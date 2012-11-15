package career.util;

/**
 * 定数定義クラス。
 * <p>
 * 全体で利用する定数を定義する。
 * </p>
 * @author 佐竹一郎
 */
public final class Defines {

    /**
     * private コンストラクタ。
     */
    private Defines() {
    }

    //-------------------------------------------------------------------------
    // application.properties の項目名のキーの定義
    //-------------------------------------------------------------------------
    /** application.properties の項目名のキーをあらわす接頭辞の定義 */
    public static final String KEY_ITEM_PREFIX = "item.";
    /** 社員姓名のキーの定義 */
    public static final String KEY_ITEM_NAME = KEY_ITEM_PREFIX + "name";
    /** 社員カナのキーの定義 */
    public static final String KEY_ITEM_KANA = KEY_ITEM_PREFIX + "kana";
    /** 社員性別のキーの定義 */
    public static final String KEY_ITEM_SEX = KEY_ITEM_PREFIX + "sex";
    /** 社員生年月日のキーの定義 */
    public static final String KEY_ITEM_BIRTHDAY = KEY_ITEM_PREFIX + "birthday";
    /** 社員郵便番号のキーの定義 */
    public static final String KEY_ITEM_ZIPCODE = KEY_ITEM_PREFIX + "zipCode";
    /** 社員住所のキーの定義 */
    public static final String KEY_ITEM_ADDRESS = KEY_ITEM_PREFIX + "address";
    /** 社員電話番号のキーの定義 */
    public static final String KEY_ITEM_TEL = KEY_ITEM_PREFIX + "tel";
    /** 社員最寄り駅のキーの定義 */
    public static final String KEY_ITEM_STATION = KEY_ITEM_PREFIX + "station";
    /** 社員最終学歴のキーの定義 */
    public static final String KEY_ITEM_ACADEMIC = KEY_ITEM_PREFIX + "academic";


    //-------------------------------------------------------------------------
    // テーブルのカラムのサイズの定義
    //-------------------------------------------------------------------------
    /** 姓名のカラムサイズの定義 */
    public static final int COL_SIZE_NAME = 128;
    /** カナのカラムサイズの定義 */
    public static final int COL_SIZE_KANA = 128;
    /** 性別のカラムサイズの定義 */
    public static final int COL_SIZE_SEX = 1;
    /** 生年月日のカラムサイズの定義 */
    public static final int COL_SIZE_BIRTHDAY = 8;
    /** 郵便番号のカラムサイズの定義 */
    public static final int COL_SIZE_ZIPCODE = 7;
    /** 住所のカラムサイズの定義 */
    public static final int COL_SIZE_ADR = 256;
    /** 電話番号のカラムサイズの定義 */
    public static final int COL_SIZE_TEL = 32;
    /** 最寄り駅のカラムサイズの定義 */
    public static final int COL_SIZE_STATION = 256;
    /** 最終学歴のカラムサイズの定義 */
    public static final int COL_SIZE_ACADEMIC = 256;
}
