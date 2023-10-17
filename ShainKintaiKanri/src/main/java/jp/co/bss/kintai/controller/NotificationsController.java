package jp.co.bss.kintai.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.bss.kintai.model.NotificationsInfo;
import jp.co.bss.kintai.service.NotificationsService;

@Controller
public class NotificationsController {

	@Autowired
	private NotificationsService notificationsService;

	@GetMapping("/notifications")
	public String showNotifications(HttpSession session, Model model) {
		List<NotificationsInfo> data = notificationsService.getNotificationsInfoList();
		model.addAttribute("notifications", data);
		return "notifications";
	}

}