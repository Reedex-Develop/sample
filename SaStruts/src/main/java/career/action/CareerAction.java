package career.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import career.entity.Career;
import career.entity.CareerOs;
import career.entity.MstAssign;
import career.entity.MstDb;
import career.entity.MstLang;
import career.entity.MstMiddle;
import career.entity.MstOs;
import career.entity.MstRole;
import career.form.CareerForm;
import career.service.CareerService;
import career.service.MstAssignService;
import career.service.MstDbService;
import career.service.MstLangService;
import career.service.MstMiddleService;
import career.service.MstOsService;
import career.service.MstRoleService;

/**
 * 経歴情報を扱うActionクラス。
 * @author 佐竹一郎
 */
public class CareerAction {

    /** アクションフォーム */
    @ActionForm
    public CareerForm careerForm;

    /** 経歴サービス */
    @Resource
    private CareerService careerService;
    /** OSサービス */
    @Resource
    private MstOsService mstOsService;
    /** 言語サービス */
    @Resource
    private MstLangService mstLangService;
    /** DBサービス */
    @Resource
    private MstDbService mstDbService;
    /** ミドルサービス */
    @Resource
    private MstMiddleService mstMiddleService;
    /** 役割サービス */
    @Resource
    private MstRoleService mstRoleService;
    /** 担当サービス */
    @Resource
    private MstAssignService mstAssignService;

    /** 経歴リスト */
    public List<Career> careerList;
    /** OSリスト */
    public List<MstOs> mstOsList;
    /** 言語リスト */
    public List<MstLang> mstLangList;
    /** DBリスト */
    public List<MstDb> mstDbList;
    /** ミドルリスト */
    public List<MstMiddle> mstMiddleList;
    /** 役割リスト */
    public List<MstRole> mstRoleList;
    /** 担当リスト */
    public List<MstAssign> mstAssignList;

    /**
     * 一覧ページを表示する。
     * @return 一覧ページ。
     */
    @Execute(validator = false)
    public String index() {
        careerList = careerService.findAllOrderByIdFullValue();
        return "list.jsp";
    }

    /**
     * 登録ページを表示する。
     * @return 登録ページ。
     */
    @Execute(validator = false)
    public String input() {
        getMasters();
        return "input.jsp";
    }

    /**
     * 編集ページを表示する。
     * @return 編集ページ。
     */
    @Execute(validator = false)
    public String update() {
        getMasters();
        Career career = careerService.findByIdFullValue(careerForm.careerId);
        for (CareerOs os : career.careerOsList) {
            careerForm.osList.add(os.mstOsId);
        }
        return "input.jsp";
    }

    /**
     * 確認ページを表示する。
     * @return 確認ページ。
     */
    @Execute(input = "input.jsp")
    public String confirm() {
        getMasters();
        return "confirm.jsp";
    }

    /**
     * 確認ページを表示する。
     * @return 確認ページ。
     */
    @Execute(input = "input.jsp")
    public String regist() {
        getMasters();
        return "confirm.jsp";
    }

    /**
     * マスター情報を取得する。
     */
    private void getMasters() {
        mstOsList = mstOsService.findAllOrderByDisp();
        mstLangList = mstLangService.findAllOrderByDisp();
        mstDbList = mstDbService.findAllOrderByDisp();
        mstMiddleList = mstMiddleService.findAllOrderByDisp();
        mstRoleList = mstRoleService.findAllOrderByDisp();
        mstAssignList = mstAssignService.findAllOrderByDisp();
    }
}
