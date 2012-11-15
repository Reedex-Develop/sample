package career.action;

import org.seasar.struts.annotation.Execute;

/**
 * 初期表示アクション。
 * @author 佐竹一郎
 */
public class IndexAction {

    /**
     * 初期ページを表示する。
     * @return 社員一覧表示アクション。
     */
    @Execute(validator = false)
    public String index() {
        //---------------------------------------------------------------------
        // 社員情報へ遷移して後でaction指定を単純化するため、redirectする
        // （redirectしたい場合は ?redirect=true を指定する）
        //---------------------------------------------------------------------
        return "staff/?redirect=true";
    }
}
