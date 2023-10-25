package jp.co.bss.kintai.controller;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.bss.kintai.model.NotificationsInfo;
import jp.co.bss.kintai.service.NotificationsService;

@Controller
public class NotificationsSearchController {

	@Autowired
	private NotificationsService notificationsService;

	// お知らせ一覧を表示
    @GetMapping("/notifications_search")
    public String notificationsList(HttpSession session, Model model) {
        List<NotificationsInfo> notificationsData = notificationsService.getNotificationsInfoList();
        
        //降順にソート 
		Collections.reverse(notificationsData);
        model.addAttribute("notificationsInfoData", notificationsData);
        return "notificationsSearch";
    }
    
    // 重要と通常のお知らせ出し分け
    @GetMapping("/important_notifications")
    public String importantNotificationsList(HttpSession session, Model model) {
        List<NotificationsInfo> importantNotificationsData = notificationsService.getImportantNotifications();
        model.addAttribute("notificationsInfoData", importantNotificationsData);
        return "notificationsSearch";
    }
}