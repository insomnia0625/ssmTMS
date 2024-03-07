package com.cqupt.controller;

import com.cqupt.common.JsonData;
import com.cqupt.common.Pagination;
import com.cqupt.common.Result;
import com.cqupt.entity.RepairList;
import com.cqupt.entity.Store;
import com.cqupt.entity.StoreGoods;
import com.cqupt.service.RepairListService;
import com.cqupt.service.StoreGoodsService;
import com.cqupt.service.StoreService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StoreIndexController {
    @Autowired
    private StoreService storeService;
    @Autowired
    private StoreGoodsService sgService;
    @Autowired
    private RepairListService rlService;

    /**
     * 门店首页控制器
     * @param model
     * @return
     */
    @RequestMapping("/storeIndex")
    public String storeIndex(String username, Model model){
        model.addAttribute("username", username);

//        Store store = new Store();
//        store.setStoreName(username);
//        Store outstore = storeService.queryStore(store);
//
//        StoreGoods storeGoods = new StoreGoods();
//        storeGoods.setStoreId(outstore.getStoreId());
//        model.addAttribute("store", outstore);


//        RepairList example = new RepairList();
//        example.setStoreId(outstore.getStoreId());
//        List repairlistList = rlService.queryRLList(example);
//        model.addAttribute("repairlistList", repairlistList);

        return "storeIndex";
    }


    /**
     * 门店补货申请页控制器
     * @param username
     * @param model
     * @return
     */
    @RequestMapping("/storeRepairList")
    public String storeRepairList(String username, Model model){
        Store store = new Store();
        store.setStoreName(username);
        Store outstore = storeService.queryStore(store);

        RepairList example = new RepairList();
        example.setStoreId(outstore.getStoreId());
        List repairlistList = rlService.queryRLList(example);
        model.addAttribute("repairlistList", repairlistList);

        return "storeRepairList";
    }

    /**
     * 门店货物列表控制器
     * @return
     */
    @RequestMapping("/storeGoodsList")
    public String storeGoodsList(){
        return "storeGoodsList";
    }
    @RequestMapping("/storeGoodsListData")
    @ResponseBody
    public JsonData storeGoodsListData(Pagination pagination, HttpServletRequest request){
        HttpSession session = request.getSession();
        Store store = new Store();
        store.setStoreName(session.getAttribute("username").toString());
        Store outstore = storeService.queryStore(store);

        StoreGoods storeGoods = new StoreGoods();
        storeGoods.setStoreId(outstore.getStoreId());

        JsonData jsonData = new JsonData();
        Page page = sgService.queryPageList(pagination, storeGoods);
        jsonData.setData(page.getResult());
        jsonData.setCount(page.getTotal());
        return jsonData;
    }

    /**
     *门店货物出入库控制器
     * @return
     */
    @RequestMapping(value = "/storeGoodsEdit", method = RequestMethod.GET)
    public String storeGoodsEdit(){
        return "storeGoodsEdit";
    }
    @RequestMapping("/storeGoodsData")
    @ResponseBody
    public StoreGoods storeGoodsData(Integer gId){
        return sgService.queryGoodsById(gId);
    }
    @RequestMapping(value = "/storeGoodsEdit", method = RequestMethod.POST)
    @ResponseBody
    public Result storeGoodsEdit_submit(StoreGoods storeGoods){
        Result result = new Result();
        sgService.updateGoods(storeGoods);
        result.setCode(0);
        result.setMsg("操作成功！");
        return result;
    }


    /**
     * 编辑门店信息控制器
     * @param username
     * @param model
     * @return
     */
    @RequestMapping(value = "/storeEdit", method = RequestMethod.GET)
    public String storeEdit(String username, Model model) {
        Store store = new Store();
        store.setStoreName(username);
        Store outstore = storeService.queryStore(store);
//        Store store = storeService.queryStoreById(storeId);
        model.addAttribute("store", outstore);
        return "storeEdit";
    }
    @RequestMapping(value = "/storeEdit", method = RequestMethod.POST)
    @ResponseBody
    public Result storeEdit_submit(Store store) {
        Result result = new Result();
        if(storeService.updateStore(store) > 0) {
            result.setMsg("编辑成功！");
//            return "<div>编辑成功！</div><br /><a href = 'storeIndex'>返回首页</a>";
        }
        else {
            result.setMsg("编辑失败！请重试");
//            return "<div>编辑失败！请重试</div><br /><a href = 'storeIndex'>返回首页</a>";
        }
        result.setCode(0);
        return result;
    }


    /**
     *门店首页补货单详情控制器
     * @param rId
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/repairListInfor")
    public String repairListInfor(Integer rId, Model model, HttpServletRequest request){
        RepairList outRepairList = rlService.queryRepairListById(rId);
        model.addAttribute("repairList", outRepairList);

        HttpSession session = request.getSession();
        model.addAttribute("username", session.getAttribute("username"));
        return "repairListInfor";
    }


    /**
     * 新增补货单控制器
     * @return
     */
    @RequestMapping(value = "/repairListAdd", method = RequestMethod.GET)
    public String repairListAdd(){
        return "repairListAdd";
    }
    @RequestMapping(value = "/repairListAdd", method = RequestMethod.POST)
    @ResponseBody
    public Result repairListAdd_submit(RepairList inrepairList, HttpServletRequest request){

        HttpSession session = request.getSession();
        Store store = new Store();
        store.setStoreName(session.getAttribute("username").toString());
        Store outstore = storeService.queryStore(store);
        inrepairList.setStoreId(outstore.getStoreId());

        Result result = new Result();

        StoreGoods inGoods = new StoreGoods();
        inGoods.setStoreId(inrepairList.getStoreId());
        inGoods.setgName(inrepairList.getrGName());
        StoreGoods outGoods = sgService.queryGoods(inGoods);

        inrepairList.setrGId(outGoods.getgId());
        inrepairList.sethAdminId("1");
        inrepairList.setrState(false);

        if(rlService.insertRepairList(inrepairList) > 0) {
            result.setCode(0);
            result.setMsg("添加成功！");
            return result;
        }
        else {
            result.setCode(0);
            result.setMsg("添加失败！请重试");
            return result;
        }
    }


    /**
     * 补货单完成控制器
     * @param rId
     * @return
     */
    @RequestMapping("/repairComplete")
    public String repairComplete(Integer rId){

        RepairList repairList = rlService.queryRepairListById(rId);

        StoreGoods outGoods = sgService.queryGoodsById(repairList.getrGId());
        int gNumber = outGoods.getgNumber() + repairList.getrGNumber();
        outGoods.setgNumber(gNumber);
        if(sgService.updateGoods(outGoods) > 0){
            repairList.setrState(true);
            rlService.updateRepairList(repairList);
        }
        return "storeIndex";
    }
}
