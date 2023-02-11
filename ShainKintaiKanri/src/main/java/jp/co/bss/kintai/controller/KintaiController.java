package jp.co.bss.kintai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.bss.kintai.bean.UserBean;
import jp.co.bss.kintai.service.KintaiService;

/**
 * @author miaoc
 *
 */

@Controller
public class KintaiController {

    //将Service注入Web层
    @Autowired
    KintaiService userService;

    @RequestMapping("/index")
    public String show(){
        return "index";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String accountId,String password){
        UserBean userBean = userService.loginIn(accountId,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }



}