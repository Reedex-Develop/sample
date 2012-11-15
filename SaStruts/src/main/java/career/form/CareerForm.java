package career.form;

import java.util.List;

import org.seasar.struts.annotation.Required;


/**
 * 経歴情報を扱うActionFormクラス。
 * @author 佐竹一郎
 */
public class CareerForm {

    /** 社員ID */
    @Required
    public Integer staffId;

    /** 経歴ID */
    public Integer careerId;

    /** プロジェクト名 */
    public String projectName;

    /** 顧客概要 */
    public String customer;

    /** 担当内容 */
    public String summary;

    /** プロジェクトメンバー数 */
    public Integer projectMmembers;

    /** チーム名メンバー数 */
    public Integer teamMembers;

    /** 開始月 */
    public String startYm;

    /** 終了月 */
    public String endYm;

    /** OSリスト */
    public List<Integer> osList;

    /** 言語リスト */
    public List<Integer> langList;

    /** DBリスト */
    public List<Integer> dbList;

    /** ミドルリスト */
    public List<Integer> middleList;

    /** 役割リスト */
    public List<Integer> roleList;

    /** 担当リスト */
    public List<Integer> assignList;
}
