package jp.co.bss.kintai.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jp.co.bss.kintai.model.FaqInfo;
import jp.co.bss.kintai.service.FaqService;

/*
 * Faq登録
 */
@Controller
public class FaqLoginController {
	/*
	 * Faq情報 Service
	 */
	@Autowired
	private FaqService faqService;

	/*
	 * Faq情報一覧画面を表示
	 */
	@GetMapping("/faqLogin")
	public String faqLogin(HttpSession session, Model model) {
		List<FaqInfo> data = faqService.getFaqInfoList();
		model.addAttribute("faqs", data);
		return "faqLogin";
	}

	/*
	 * Faq情報 登録処理
	 */
	@PostMapping("/insert")
	public String addFAQ(HttpSession session, Model model, @RequestParam String buttonNm,
			@RequestParam String questionId, @RequestParam String question, @RequestParam String answer,
			@RequestParam("file") MultipartFile file) {
		String username = (String) session.getAttribute("username");
		Date currentDate = new Date(System.currentTimeMillis());
		List<FaqInfo> data = null;
		FaqInfo faq = new FaqInfo();
		String fileName = "";
		byte[] fileBytes = null;

		try {
			if (!file.isEmpty()) {
				fileName = file.getOriginalFilename();
				fileBytes = file.getBytes();
			}

			// 登録
			if (username != null) {
				if ("insert".equals(buttonNm)) {
					faq.setClaimer(username);
					faq.setQuestion(question);
					// 0:新規、1:更新、2:削除
					faq.setAnswerflg("0");
					faq.setBlob_data(fileBytes);
					faq.setCreate_date(currentDate);

					faqService.insertFAQ1(faq);

					data = faqService.getFaqInfoList();
					model.addAttribute("faqs", data);
					model.addAttribute("insertSuccess", true);

					// 更新
				} else if ("update".equals(buttonNm)) {
					faq.setId(Integer.parseInt(questionId));
					faq.setReponder(username);
					faq.setAnswer(answer);
					faq.setBlob_data(fileBytes);
					// 0:新規、1:更新、2:削除
					faq.setAnswerflg("1");
					// faq.setUpdate_date(currentDate);

					faqService.updateFAQ(faq);

					data = faqService.getFaqInfoList();
					model.addAttribute("faqs", data);
					model.addAttribute("updateSuccess", true);

					// 削除
				} else if ("delete".equals(buttonNm)) {
					faq.setId(Integer.parseInt(questionId));
					// 0:新規、1:更新、2:削除
					faq.setAnswerflg("2");
					faq.setDelete_date(currentDate);

					faqService.updateFAQ1(faq);
					// faqService.deleteFAQ(questionId);

					data = faqService.getFaqInfoList();
					model.addAttribute("faqs", data);
					model.addAttribute("deleteSuccess", true);
				}

			}

		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
			e.printStackTrace();
		}
		return "faqLogin";
	}

}
