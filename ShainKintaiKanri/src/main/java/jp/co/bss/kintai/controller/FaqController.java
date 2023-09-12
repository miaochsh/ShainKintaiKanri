package jp.co.bss.kintai.controller;

import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.bss.kintai.dao.FaqInfo;
import jp.co.bss.kintai.service.FaqService;

@Controller
public class FaqController {
	@Autowired
    private FaqService faqService;
	
    @GetMapping("/faq")
    public String faq(HttpSession session, Model model) {
    	String username = (String) session.getAttribute("username");
    	if(username!=null) {
    		FaqInfo data =faqService.getFaqInfo(username);
    		model.addAttribute("faqs",data);
    	}
        return "internal_faq";
    }
    
    @PostMapping("/insert")
    public String addFAQ(HttpSession session, Model model, @RequestParam String buttonNm, @RequestParam String question1, @RequestParam String answer1, @RequestParam String question2, @RequestParam String answer2, @RequestParam String question3, @RequestParam String answer3) {
        String username = (String) session.getAttribute("username");
        Date currentDate = new Date(System.currentTimeMillis());
        FaqInfo data = null;
    	FaqInfo faq = new FaqInfo();
    	
        if (username != null) {
        	if("insert".equals(buttonNm)){
            	faq.setName(username);
            	faq.setQuestion1(question1);
            	faq.setAnswer1(answer1);

            	faq.setQuestion2(question2);
            	faq.setAnswer2(answer2);

            	faq.setQuestion3(question3);
            	faq.setAnswer3(answer3);
            	
            	faq.setCreate_date(currentDate);
            	
            	faqService.updateFAQ(faq);
            	
            	data =faqService.getFaqInfo(username);
        		model.addAttribute("faqs",data);
        		model.addAttribute("insertSuccess", true);
        		
        	}else if("update".equals(buttonNm)){
            	faq.setName(username);
            	faq.setQuestion1(question1);
            	faq.setAnswer1(answer1);

            	faq.setQuestion2(question2);
            	faq.setAnswer2(answer2);

            	faq.setQuestion3(question3);
            	faq.setAnswer3(answer3);
            	
            	faq.setCreate_date(currentDate);
            	
            	faqService.updateFAQ(faq);
            	
            	data =faqService.getFaqInfo(username);
        		model.addAttribute("faqs",data);
        		model.addAttribute("updateSuccess", true);
        		
        	}else if("delete".equals(buttonNm)){
            	faq.setName(username);
            	faq.setQuestion1("");
            	faq.setAnswer1("");

            	faq.setQuestion2("");
            	faq.setAnswer2("");

            	faq.setQuestion3("");
            	faq.setAnswer3("");
            	
            	faq.setCreate_date(currentDate);
            	
            	faqService.updateFAQ(faq);
            	
            	data =faqService.getFaqInfo(username);
        		model.addAttribute("faqs",data);
        		model.addAttribute("deleteSuccess", true);
        	}
        	
        }

        return "internal_faq";
    }
}
