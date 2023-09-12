package jp.co.bss.kintai.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.bss.kintai.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(HttpServletRequest request, HttpSession session) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        if (loginService.validateUser(name, password)) {
        	session.setAttribute("username", name);
            // 验证成功，返回成功页面或进行其他操作
            return "home";
        } else {
            // 验证失败，返回失败页面或进行其他操作
            return "error";
        }
    }
}
