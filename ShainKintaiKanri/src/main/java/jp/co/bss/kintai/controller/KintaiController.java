package jp.co.bss.kintai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.bss.kintai.bean.UserBean;
import jp.co.bss.kintai.dao.Kintai;
import jp.co.bss.kintai.service.KintaiService;
import jp.co.bss.kintai.service.UserService;

/**
 * @author miaoc
 *
 */
@Controller
@RequestMapping("/kintai")
public class KintaiController {
	@Autowired
	private KintaiService kintaiService;
	
	//将Service注入Web层
	@Autowired
	private UserService userService;
	  
	@RequestMapping
    public String show(){
        return "index";
    }

    @RequestMapping(value = "/kintailist", method = RequestMethod.POST)
    public String login(String accountId,String password){
        UserBean userBean = userService.loginIn(accountId,password);
        if(userBean!=null){
        	System.out.println("login------------");
            return "redirect:/kintai/kintailist";
            
        }else {
        	System.out.println("error------------");
            return "error";
        }
    }
	
	@GetMapping("kintailist")
	public String index(Model model) {
		model.addAttribute("kintai", kintaiService.findAll());
		System.out.println("kintai findall------------");
		return "kintailist";
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
	   return "redirect:/kintai/kintailist";
	  }
     }
	 
	 
	 @GetMapping("{id}")
	 public String show(@PathVariable Long id, Model model) {
	  model.addAttribute("kintai", kintaiService.findOne(id));
	  return "showkintai";
	 }
	 
	 @GetMapping("{id}/edit")
	 public String edit(@PathVariable Long id, @ModelAttribute("kintai") Kintai kintai, Model model) {
	  model.addAttribute("kintai", kintaiService.findOne(id));
	  return "editkintai";
	 }
	 
	 @PostMapping("{id}")
	 public String update(@PathVariable Long id, @ModelAttribute("kintai") @Validated Kintai kintai, BindingResult result, Model model) {
	  if (result.hasErrors()) {
	   model.addAttribute("kintai", kintai);
	   return "editkintai";
	  } else {
	   kintai.setId(id);
	   kintaiService.update(kintai);
	   return "redirect:/kintai/kintailist";
	  }
	 }
	 
	 @RequestMapping(value="/delete/{id}")
	 public String delete(@PathVariable("id") Long id) {
	  kintaiService.delete(id);
	  return "redirect:/kintai/kintailist"; 
	 }
	 
	
}
