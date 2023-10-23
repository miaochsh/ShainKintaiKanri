package jp.co.bss.kintai.controller;

import java.util.ArrayList;
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
    	
    	// 通常のお知らせと重要なお知らせを区別して抽出
        List<HomeInfo> normalNotifications = new ArrayList<>();
        List<HomeInfo> importantNotifications = new ArrayList<>();
        for (HomeInfo notificationTitle : notificationsData) {
            if ("1".equals(notificationTitle.getStatus())) {  // ステータスが1の場合は通常のお知らせ
                normalNotifications.add(notificationTitle);
            } else if ("0".equals(notificationTitle.getStatus())) {  // ステータスが0の場合は重要なお知らせ
                importantNotifications.add(notificationTitle);
            }
        }
        
        // 重要・通常お知らせのデータを降順に並べ替え
        Collections.reverse(normalNotifications);
        Collections.reverse(importantNotifications);

        // 通常お知らせの最後から5件分を抽出
        List<HomeInfo> lastFiveNormalNotificationsTitle = normalNotifications.subList(0, Math.min(5, normalNotifications.size()));

        model.addAttribute("normalNotificationTitle", lastFiveNormalNotificationsTitle);
        model.addAttribute("importantNotificationTitle", importantNotifications);
        return "home";
    }
}