package jp.co.bss.kintai.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.bss.kintai.model.NoticeInfo;
import jp.co.bss.kintai.service.NoticeService;

@Controller
public class NotificationsController {

	@Autowired
	private NoticeService noticeService;

	@GetMapping("/notifications")
	public String showNotifications(HttpSession session, Model model) {
		List<NoticeInfo> data = noticeService.getNoticeInfoList();
		model.addAttribute("notices", data);
		return "notifications";
	}

}