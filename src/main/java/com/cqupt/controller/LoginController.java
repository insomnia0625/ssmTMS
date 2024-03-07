package com.cqupt.controller;

import com.cqupt.entity.HAdministrator;
import com.cqupt.entity.Store;
import com.cqupt.service.HAdministratorService;
import com.cqupt.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {

    @Autowired
    private HAdministratorService hAdministratorService;
    @Autowired
    private StoreService storeService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login_submit(String userName, String userPwd, HttpSession session, Model model) throws IOException {
//        String _username = "admin";
//        String _userpwd = "123";

        String msg = "";

        if(userName.equals("admin")){
            //admin登录
            HAdministrator inAdmin = new HAdministrator();
            inAdmin.sethAdminName(userName);
            inAdmin.sethAdminPwd(userPwd);
            HAdministrator admin = hAdministratorService.queryAdmin(inAdmin);

            if(admin.gethAdminName().equals(inAdmin.gethAdminName()) && admin.gethAdminPwd().equals(inAdmin.gethAdminPwd())){
                //response.sendRedirect(request.getContextPath() + "/index");
                session.setAttribute("username", "admin");
                msg = "登陆成功！";
                model.addAttribute("msg", msg);
                model.addAttribute("username", "admin");
                return "loginSuccess";
            }else {
                msg = "用户名或密码输入有误！";
                return "loginError";
            }
        }else {
            //门店登录
            Store inStore = new Store();
            inStore.setStoreName(userName);
            inStore.setStorePassword(userPwd);
            Store outStore = storeService.queryStore(inStore);

            if(outStore.getStoreName().equals(inStore.getStoreName()) && outStore.getStorePassword().equals(inStore.getStorePassword()) ){
                session.setAttribute("username", inStore.getStoreName());
                msg = "登陆成功！";
                model.addAttribute("msg", msg);
                model.addAttribute("username", inStore.getStoreName());
                return "loginSuccess";
            }else {
                msg = "用户名或密码输入有误！";
                return "loginError";
            }
        }
    }

    /**
     * 登出功能
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout",  method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.removeAttribute("admin");
        return "redirect:login";
    }

}

