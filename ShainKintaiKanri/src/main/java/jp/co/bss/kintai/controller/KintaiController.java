package jp.co.bss.kintai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.bss.kintai.service.KintaiService;

/**
 * @author miaoc
 *
 */
@Controller
@RequestMapping("/kintai")
public class KintaiController {
	
	// http://localhost:8080/kintai
	
	@Autowired
	private KintaiService kintaiService;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("kintai", kintaiService.findAll());
		return "index";
	}

}
