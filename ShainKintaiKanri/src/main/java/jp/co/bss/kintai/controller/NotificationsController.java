package jp.co.bss.kintai.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.bss.kintai.service.FaqService;

@Controller
public class NotificationsController {
	@Autowired
	private FaqService faqService;

	@GetMapping("/notifications")
	public String showNotification(HttpSession session, Model model) {
//		String username = (String) session.getAttribute("username");
//		if (username != null) {
//			List<FaqInfo> data = faqService.getFaqInfoList();
//			model.addAttribute("faqs", data);
//		}
		return "notifications";
	}

}
