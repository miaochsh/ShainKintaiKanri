/**
 * 
 */
package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.bss.kintai.model.FaqInfo;

/**
 * @author lyc
 *
 */
@Mapper
public interface FaqInfoMapper {
	@Select("SELECT * FROM public.faq WHERE name = #{name}")
	FaqInfo getFaqInfoByUserName(String name);
	
	@Select("SELECT * FROM public.faq")
	List<FaqInfo> getFaqListInfoByUserName();

	@Insert("INSERT INTO faq (name) VALUES (#{name})")
	void insertFAQ(@Param("name") String name);

	@Update("UPDATE faq SET question1 = #{question1}, answer1 = #{answer1}, question2 = #{question2}, answer2 = #{answer2}, question3 = #{question3}, answer3 = #{answer3},create_date = #{create_date} WHERE name = #{name}")
	void updateFAQ(FaqInfo faq);

}
