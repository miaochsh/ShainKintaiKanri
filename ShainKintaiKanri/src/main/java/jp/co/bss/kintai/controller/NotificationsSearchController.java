package jp.co.bss.kintai.controller;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.bss.kintai.model.NotificationsInfo;
import jp.co.bss.kintai.service.NotificationsService;

@Controller
public class NotificationsSearchController {

	@Autowired
	private NotificationsService notificationsService;
	
//	// 全てのお知らせ一覧を表示
//    @GetMapping("notifications_all")
//    public String notificationsList(HttpSession session, Model model) {
//        List<NotificationsInfo> notificationsData = notificationsService.getNotificationsInfoList();
//        
//        //降順にソート 
//		Collections.reverse(notificationsData);
//        model.addAttribute("notificationsInfoData", notificationsData);
//        return "notificationsSearch";
//    }
    
    // お知らせのソート機能
    @GetMapping("/notifications_search")
    public String notificationsList(
    		@RequestParam(value = "status", required = false) String status,
    		@RequestParam(value = "creation_date", required = false) 
    		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date creationDate,
    		HttpSession session, Model model) {
        List<NotificationsInfo> notificationsData;
        if (creationDate != null) {
        	notificationsData = notificationsService.getNotificationsDate(creationDate); // 指定された日付に一致するデータを取得
        } else if (status.equals("1")) { 
            notificationsData = notificationsService.getNormalNotifications(); // status=1(通常のみ表示)
        } else {
            notificationsData = notificationsService.getNotificationsInfoList(); // status=all(全件表示)
        }
        Collections.reverse(notificationsData); // 降順にソート
        model.addAttribute("notificationsInfoData", notificationsData);
        return "notificationsSearch";
    }
}
