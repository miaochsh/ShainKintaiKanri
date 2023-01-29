package jp.co.bss.kintai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.bss.kintai.dao.Kintai;

/**
 * @author miaoc
 *
 */
@Controller
@RequestMapping("/items")
public class KintaiController {
	
	@Autowired
	private Kintai kintai;

}
