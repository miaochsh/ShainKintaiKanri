/**
 * 
 */
package jp.co.bss.kintai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.bss.kintai.mapper.FaqInfoMapper;
import jp.co.bss.kintai.model.FaqInfo;

@Service
public class FaqService {
	@Autowired
	private FaqInfoMapper faqInfoMapper;
	
	public List<FaqInfo> getFaqInfoList() {
		List<FaqInfo> data = faqInfoMapper.getFaqListInfoByUserName();
		return data;
	}
	
	@Transactional
	public void insertFAQ1(FaqInfo faq) {
		faqInfoMapper.insertFAQ1(faq);
	}

	@Transactional
	public void updateFAQ(FaqInfo faq) {
		faqInfoMapper.updateFAQ(faq);
	}
	
	@Transactional
	public void updateFAQ1(FaqInfo faq) {
		faqInfoMapper.updateFAQ1(faq);
	}
	
	@Transactional
	public void deleteFAQ(String id) {
		faqInfoMapper.deleteById(id);
	}

}
