package jp.co.bss.kintai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.bss.kintai.dao.Kintai;
import jp.co.bss.kintai.service.KintaiService;

/**
 * @author miaoc
 *
 */



@Controller
public class KintaiController {
	
//	@RequestMapping(value="index/kintai_list",method=RequestMethod.GET)
	@Autowired
	KintaiService kintaiService;
	
//	@RequestMapping("/Kintai_list")
	@RequestMapping(value="Kintai_list",method=RequestMethod.GET)
	public String Kintai_list(Model model) {
		
		List<Kintai>kintailist = kintaiService.searchAll();
		model.addAttribute("kintailist",kintailist);
		return "Kintai_list";
	}
	
	@GetMapping("/Kintai_edit")
	public String Kintai_edit(Model model) {
		
		
		return "Kintai_edit";
	}

}
