/**
 * 
 */
package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.bss.kintai.model.FaqInfo;

/**
 * Faq情報 Mapper
 *
 */
@Mapper
public interface FaqInfoMapper {
	
	List<FaqInfo> getFaqListInfoByUserName();
	
	void insertFAQ1(FaqInfo faq);

	void updateFAQ(FaqInfo faq);
	
	void updateFAQ1(FaqInfo faq);
	
	void deleteById(String id);

}
