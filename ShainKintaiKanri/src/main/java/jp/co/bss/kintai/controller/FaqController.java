package jp.co.bss.kintai.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * FaqController
 */
@Controller
public class FaqController {
	/*
	 * Faq情報 Service
	 */
	/*
	 * @Autowired private FaqService faqService;
	 */

	/*
	 * Faq情報一覧画面を表示
	 */
	@GetMapping("/faq")
	public String showFaq(HttpSession session, Model model) {
		/*
		 * List<FaqInfo> data = faqService.getFaqInfoList(); model.addAttribute("faqs",
		 * data);
		 */
		return "faq";
	}
}
