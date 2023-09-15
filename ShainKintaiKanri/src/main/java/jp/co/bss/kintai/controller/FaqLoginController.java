package jp.co.bss.kintai.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.bss.kintai.dao.FaqInfo;
import jp.co.bss.kintai.service.FaqService;

@Controller
public class FaqLoginController {
	@Autowired
	private FaqService faqService;

	@GetMapping("/faqLogin")
	public String faqLogin(HttpSession session, Model model) {
		String username = (String) session.getAttribute("username");
		if (username != null) {
			List<FaqInfo> data = faqService.getFaqInfoList();
			model.addAttribute("faqs", data);
		}
		return "faq";
	}

}
