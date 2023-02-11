package jp.co.bss.kintai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.bss.kintai.dao.Kintai;
import jp.co.bss.kintai.service.KintaiService;

/**
 * @author miaoc
 *
 */
@Controller
@RequestMapping("/kintai")
public class KintaiController {
	@Autowired
	private KintaiService kintaiService;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("kintai", kintaiService.findAll());
//		System.out.println("kintai findall------------");
		return "index";
	   }
	 
	 @GetMapping("newkintai")
	 public String newKintai(@ModelAttribute("kintai") Kintai kintai, Model model) {
	  return "newkintai";
	 }
	 
	 
	 @PostMapping
	 public String create(@ModelAttribute("kintai") @Validated Kintai kintai, BindingResult result, Model model) {
	  if (result.hasErrors()) {
	   return "newkintai";
	  } else {
	   kintaiService.save(kintai);
	   return "redirect:/kintai";
	  }
     }
	 
	 
	
}
