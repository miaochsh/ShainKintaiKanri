package jp.co.bss.kintai.controller;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.bss.kintai.model.HomeInfo;
import jp.co.bss.kintai.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;
 
    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
    	List<HomeInfo> notificationsData = homeService.getNotificationTitleInfoList();
    	
        // データを降順に並べ替え
        Collections.reverse(notificationsData);

        // 最後から5件分を抽出
        List<HomeInfo> lastFiveData = notificationsData.subList(0, Math.min(5, notificationsData.size()));
        
		model.addAttribute("notificationTitle", lastFiveData);
        return "home";
    }
}
