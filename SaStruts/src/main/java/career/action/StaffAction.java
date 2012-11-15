package career.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import career.entity.Staff;
import career.form.StaffForm;
import career.service.StaffService;

/**
 * 社員情報を扱うActionクラス。
 * @author 佐竹一郎
 */
public class StaffAction {

    /** アクションフォーム */
    @ActionForm
    public StaffForm staffForm;

    //-------------------------------------------------------------------------
    // DI でインスタンスを取得するのでメソッドでインスタンスを生成することはない
    //-------------------------------------------------------------------------
    /** 社員サービス */
    @Resource
    private StaffService staffService;

    //-------------------------------------------------------------------------
    // プロパティ
    // （ビューで表示する物についてはカプセルかする必要がないため public 指定が基本）
    //-------------------------------------------------------------------------
    /** 社員リスト */
    public List<Staff> staffList;

    /**
     * 一覧ページを表示する。
     * @return 一覧ページ。
     */
    @Execute(validator = false)
    public String index() {
        //---------------------------------------------------------------------
        // サービスを利用してDBアクセスする
        // 基本的に DB アクセスは service に寄せる
        //---------------------------------------------------------------------
        staffList = staffService.findAllOrderById();
        return "list.jsp";
    }

    /**
     * 詳細ページを表示する。
     * @return 詳細ページ。
     */
    @Execute(validator = false)
    public String detail() {
        Staff staff = staffService.findById(staffForm.staffId);
        setForm(staff, staffForm);
        return "detail.jsp";
    }

    /**
     * 登録ページを表示する。
     * @return 登録ページ。
     */
    @Execute(validator = false)
    public String input() {
        return "input.jsp";
    }

    /**
     * 修正ページを表示する。
     * @return 修正ページ。
     */
    @Execute(validator = false)
    public String update() {
        Staff staff = staffService.findById(staffForm.staffId);
        setForm(staff, staffForm);
        return "input.jsp";
    }

    /**
     * 確認ページを表示する。
     * @return 確認ページ。
     */
    @Execute(input = "input.jsp")
    public String confirm() {
        return "confirm.jsp";
    }

    /**
     * 登録・更新して、一覧を表示する。
     * @return 確認ページ。
     */
    @Execute(input = "input.jsp")
    public String regist() {
        Staff staff = createEntity(staffForm);
        if (staffForm.staffId == null) {
            staffService.insert(staff);
        } else {
            staff.id = staffForm.staffId;
            staffService.update(staff);
        }
        return "index?redirect=true";
    }

    /**
     * エンティティのデータをフォームに設定する。
     * @param staff エンティティ
     * @param form  アクションフォーム
     */
    private void setForm(Staff staff, StaffForm form) {
        form.staffName = staff.name;
        form.staffKana = staff.kana;
        form.sex = staff.sex;
        form.birthday = staff.birthday;
        form.tel = staff.tel;
        form.zipCode = staff.zipCode;
        form.address = staff.address;
        form.station = staff.station;
        form.lastAcademicRecord = staff.lastAcademicRecord;
    }

    /**
     * フォームの情報からエンティティをを作成する。
     * @param form  アクションフォーム
     * @return  エンティティ
     */
    private Staff createEntity(StaffForm form) {
        Staff staff = new Staff();
        staff.name = form.staffName;
        staff.kana = form.staffKana;
        staff.sex = form.sex;
        staff.birthday = form.birthday;
        staff.tel = form.tel;
        staff.zipCode = form.zipCode;
        staff.address = form.address;
        staff.station = form.station;
        staff.lastAcademicRecord = form.lastAcademicRecord;
        return staff;
    }
}
