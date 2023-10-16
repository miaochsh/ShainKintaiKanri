package jp.co.bss.kintai.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.bss.kintai.model.FaqInfo;
import jp.co.bss.kintai.service.FaqService;

/**
 * FaqController
 */
@Controller
public class FaqController {
	/*
	 * Faq情報 Service
	 */
	@Autowired
	private FaqService faqService;

	/*
	 * Faq情報一覧画面を表示
	 */
//	@GetMapping("/faq")
//	public String faq(HttpSession session, Model model) {
//		List<FaqInfo> data = faqService.getFaqInfoList();
//		model.addAttribute("faqs", data);
//		return "faq";
//	}	
	
	/*
	 * test code
	 */
    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }
	
}
