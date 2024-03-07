package com.cqupt.controller;

import com.cqupt.common.*;
import com.cqupt.common.TransportAlgorithm.ImprovedClosedLoop;
import com.cqupt.common.TransportAlgorithm.ReducedCost;
import com.cqupt.common.TransportAlgorithm.initialAlgori;
import com.cqupt.entity.*;
import com.cqupt.service.*;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class AdminIndexController {
    @Autowired
    private StoreService storeService;
    @Autowired
    private TransportVehicleService tvService;
    @Autowired
    private RepairListService rlService;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private SupplierStoreService ssService;

    /**
     * admin首页控制器
     * @param model
     * @return
     */
    @RequestMapping("/adminIndex")
    public String adminIndex(Model model) {
//        List storeList = storeService.queryStoreList();
//        model.addAttribute("storeList", storeList);
//
//        List vehicleList = tvService.queryVehicleList();
//        model.addAttribute("vehicleList", vehicleList);
//
//        List supplierList = supplierService.querySupplierList();
//        model.addAttribute("supplierList", supplierList);

        String username = "admin";
        model.addAttribute("username", username);

        return "adminIndex";
    }

    /**
     * 门店列表页控制器
     * @param
     * @return
     */
    @RequestMapping("/storeList")
    public String storeList(){
//        List storeList = storeService.queryStoreList();
//        model.addAttribute("storeList", storeList);
        return "storeList";
    }
    @RequestMapping("/storeListData")
    @ResponseBody
    public JsonData storeListData(Pagination pagination){
        JsonData jsonData = new JsonData();

        Page page = storeService.queryPageList(pagination);
        jsonData.setData(page.getResult());
        jsonData.setCount(page.getTotal());
        return jsonData;
    }
    /**
     * 添加门店控制器
     * @return
     */
    @RequestMapping(value = "/storeAdd", method = RequestMethod.GET)
    public String storeAdd() {
        return "storeAdd";
    }
    @RequestMapping(value = "/storeAdd", method = RequestMethod.POST)
    @ResponseBody
    public Result storeAdd_submit(Store instore) {
        //System.out.println("添加了一次");
        Result result = new Result();
        instore.setStorePassword("123");
        Store outstore = storeService.queryStore(instore);    //按门店名查询数据库中是否已存在
        if (outstore == null) {
            result.setCode(0);
            result.setMsg("添加成功！初始密码为：123");
            storeService.insertStore(instore);
        } else {
            result.setCode(0);
            result.setMsg("添加失败！该门店名已存在");
        }
        return result;
    }


    /**
     * 删除门店控制器
     * @param storeId
     * @return
     */
    @RequestMapping("/storeDel")
    @ResponseBody
    public Result storeDel(Integer storeId){
        Result result = new Result();
        if(storeService.deleteStore(storeId) > 0) {
            result.setCode(0);
            result.setMsg("删除成功！");
        }
        else {
            result.setCode(0);
            result.setMsg("删除失败！请重试");
        }
        return result;
    }

//    ---------------------------------------------------------------------------------------------

    /**
     * 车辆列表页控制器
     * @param
     * @return
     */
    @RequestMapping("/vehicleList")
    public String vehicleList(){
        return "vehicleList";
    }
    @RequestMapping("/vehicleListData")
    @ResponseBody
    public JsonData vehicleListData(Pagination pagination) {
        JsonData jsonData = new JsonData();

        Page page = tvService.queryPageList(pagination);
        jsonData.setData(page.getResult());
        jsonData.setCount(page.getTotal());
/*        jsonData.setCode(1);
        jsonData.setMsg("请求失败");*/

        return jsonData;
    }

    /**
     * 添加车辆控制器
     * @return
     */
    @RequestMapping(value = "/vehicleAdd", method = RequestMethod.GET)
    public String vehicleAdd() {
        return "vehicleAdd";
    }
    @RequestMapping(value = "/vehicleAdd", method = RequestMethod.POST)
    @ResponseBody
    public Result vehicleAdd_submit(TransportVehicle inVehicle) {
        Result result = new Result();
        inVehicle.sethAdminId("1");
        inVehicle.setvAvailable(false);
        if(tvService.insertVehicle(inVehicle) > 0) {
            result.setCode(0);
            result.setMsg("添加成功！");
            return result;
        }else {
            result.setCode(0);
            result.setMsg("添加失败！请重试");
            return result;
        }
    }

    /**
     * 编辑车辆信息控制器
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "/vehicleEdit", method = RequestMethod.GET)
    public String vehicleEdit() {
        return "vehicleEdit";
    }

    @RequestMapping(value = "/vehicleEdit",method = RequestMethod.POST)
    @ResponseBody
    public Result vehicleEdit_submit(TransportVehicle invehicle) {
        Result result = new Result();
        tvService.updateVehicle(invehicle);
        result.setCode(0);
        result.setMsg("编辑成功！");
        return result;
    }
    @RequestMapping("/vehicleData")
    @ResponseBody
    public TransportVehicle vehicleData(Integer vId){
        return tvService.queryVehicleById(vId);
    }

    /**
     * 删除车辆控制器
     * @param vId
     * @return
     */
    @RequestMapping("/vehicleDel")
    @ResponseBody
    public Result vehicleDel(Integer vId){
        Result result = new Result();
        if(tvService.deleteVehicle(vId) > 0) {
            result.setCode(0);
            result.setMsg("删除成功！");
        }
        else {
            result.setCode(0);
            result.setMsg("删除失败！请重试");
        }
        return result;
    }

//    ---------------------------------------------------------------------------------------------------

    /**
     * 补货单信息页控制器
     * @param
     * @return
     */
    @RequestMapping(value = "/repairlistList")
    public String repairListInfor() {
        return "repairlistList";
    }
    @ResponseBody
    @RequestMapping("/repairListData")
    public JsonData repairListData(Pagination pagination){
        JsonData jsonData = new JsonData();

        Page page = rlService.queryPageList(pagination);
        jsonData.setData(page.getResult());
        jsonData.setCount(page.getTotal());
/*        jsonData.setCode(1);
        jsonData.setMsg("请求失败");*/

        return jsonData;
    }

//    -----------------------------------------------------------------------------------------------

    /**
     * 供应商列表页控制器
     * @param
     * @return
     */
    @RequestMapping("/supplierList")
    public String supplierList(){
//    List supplierList = supplierService.querySupplierList();
//    model.addAttribute("supplierList", supplierList);
        return "supplierList";
    }
    @RequestMapping("/supplierListData")
    @ResponseBody
    public JsonData supplierListData(Pagination pagination){
        JsonData jsonData = new JsonData();

        Page page = supplierService.queryPageList(pagination);
        jsonData.setData(page.getResult());
        jsonData.setCount(page.getTotal());
        return jsonData;
    }


    /**
     * 添加供应商信息控制器
     * @return
     */
    @RequestMapping(value = "/supplierAdd", method = RequestMethod.GET)
    public String supplierAdd() {
        return "supplierAdd";
    }
    @RequestMapping(value = "/supplierAdd", method = RequestMethod.POST)
    @ResponseBody
    public Result supplierAdd_submit(Supplier insupplier){
        Result result = new Result();
        if(supplierService.insertSupplier(insupplier) > 0) {
            result.setCode(0);
            result.setMsg("添加成功！");
            return result;
        }else {
            result.setCode(0);
            result.setMsg("添加失败！请重试");
            return result;
        }
    }
    /**
     * 删除供应商信息控制器
     * @param supplierId
     * @return
     */
    @RequestMapping("/supplierDel")
    @ResponseBody
    public Result supplierDel(Integer supplierId){
        Result result = new Result();
        if(supplierService.deleteSupplier(supplierId) > 0) {
            result.setCode(0);
            result.setMsg("删除成功！");
        }
        else {
            result.setCode(0);
            result.setMsg("删除失败！请重试");
        }
        return result;
    }

    /**
     * 编辑供应商信息控制器
     * @return
     */
    @RequestMapping(value = "/supplierEdit",method = RequestMethod.GET)
    public String supplierEdit() {
        return "supplierEdit";
    }
    @RequestMapping(value = "/supplierEdit",method = RequestMethod.POST)
    @ResponseBody
    public Result supplierEdit_submit(Supplier insupplier) {
        Result result = new Result();
        supplierService.updateSupplier(insupplier);
        result.setCode(0);
        result.setMsg("编辑成功！");
        return result;
    }
    @RequestMapping("/supplierData")
    @ResponseBody
    public Supplier supplierData(Integer supplierId){
        return supplierService.querySuppierById(supplierId);
    }

//    -------------------------------------------------------------------------------------------------------------

    /**
     * 制定运输计划页面控制器
     * @param model
     * @return
     */
    @RequestMapping(value = "/makeTransportPlan", method = RequestMethod.GET)
    public String makeTransportPlan(Model model){
        List transportPriceList = ssService.queryPriceList();
        model.addAttribute("transportPriceList", transportPriceList);
        return "makeTransportPlan";
    }
    @RequestMapping(value = "/makeTransportPlan", method = RequestMethod.POST)
    @ResponseBody
    public int[][] makeTransportPlan_submit(String gName, Integer supplier1, Integer supplier2, Integer supplier3, Integer store1, Integer store2, Integer store3, Integer store4){

        //查询数据库
        List<SupplierStore> PriceList = ssService.queryPriceList();
        float[][] cost0 = {{PriceList.get(0).getTransportPrice(), PriceList.get(1).getTransportPrice(), PriceList.get(2).getTransportPrice(), PriceList.get(3).getTransportPrice()},
                          {PriceList.get(4).getTransportPrice(), PriceList.get(5).getTransportPrice(), PriceList.get(6).getTransportPrice(), PriceList.get(7).getTransportPrice()},
                          {PriceList.get(8).getTransportPrice(), PriceList.get(9).getTransportPrice(), PriceList.get(10).getTransportPrice(), PriceList.get(11).getTransportPrice()}};

        int[] supply = {supplier1, supplier2, supplier3};
        int[] demand = {store1, store2, store3, store4};

        //类型转换
        int[][] cost = new int[supply.length][demand.length];
        for(int i = 0; i < cost0.length; i++){
            for(int j = 0; j < cost0[i].length; j++){
                cost[i][j] = (int)cost0[i][j];
            }
        }

//        int[][] initialSolution = {{0, 0, 4, 3},
//                                 {3, 0, 1, 0},
//                                 {0, 6, 0, 3}};
        //求出初始解
        int[][] initialSolution = new int[supply.length][demand.length];
        initialAlgori initial = new initialAlgori(cost, supply, demand, initialSolution);

//        //检验数表
//        int[][] locationOfBasicVar;
//        locationOfBasicVar = initial.getBasicVar();
//
//        // 检验数
//        int[][] reducedCost = new int[supply.length][demand.length];
//        for (int[] ints : reducedCost) {
//            Arrays.fill(ints, Integer.MAX_VALUE);
//        }
//        //求检验数
//        new ReducedCost(cost, reducedCost, locationOfBasicVar);
//
//        //定义问题的最优解
//        int[][] optimalSolution;
//
//        //寻找闭合回路
//        ImprovedClosedLoop ilp = new ImprovedClosedLoop(reducedCost);
//        optimalSolution = ilp.optimize(initialSolution);

        return initialSolution;
    }

    /**
     * 指派运输车辆控制器
     * @return
     */
    @RequestMapping(value = "/assignVehicle", method = RequestMethod.GET)
    public String assignVehicle() {
        return "assignVehicle";
    }
    @RequestMapping("/assignVehicleData")
    @ResponseBody
    public JsonData assignVehicleData(Pagination pagination) {
        JsonData jsonData = new JsonData();

        TransportVehicle vExample = new TransportVehicle();
        vExample.setvAvailable(true);

        Page page = tvService.queryVehicleByExample(pagination, vExample);
        jsonData.setData(page.getResult());
        jsonData.setCount(page.getTotal());
/*        jsonData.setCode(1);
        jsonData.setMsg("请求失败");*/

        return jsonData;
    }
    @RequestMapping(value = "/assignVehicle",method = RequestMethod.POST)
    @ResponseBody
    public Result assignVehicle_submit(Integer vId) {
        Result result = new Result();
        TransportVehicle outVehicle = tvService.queryVehicleById(vId);
        outVehicle.setvAvailable(false);
        tvService.updateVehicle(outVehicle);
        result.setCode(0);
        result.setMsg("派车成功！");
        return result;
    }
}
