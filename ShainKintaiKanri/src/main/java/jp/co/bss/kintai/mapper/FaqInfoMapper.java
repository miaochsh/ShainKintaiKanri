/**
 * 
 */
package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.bss.kintai.model.FaqInfo;

/**
 * Faq情報 Mapper
 *
 */
@Mapper
public interface FaqInfoMapper {
	
	@Select("SELECT * FROM faq where answerflg <> '2' order by create_date desc;")
	List<FaqInfo> getFaqListInfoByUserName();
	
	@Insert("INSERT INTO faq (claimer,question,answerflg,create_date,blob_data) VALUES (#{claimer}, #{question}, #{answerflg},#{create_date},#{blob_data});")
	void insertFAQ1(FaqInfo faq);

	@Update("UPDATE faq SET reponder = #{reponder}, answer = #{answer}, answerflg = #{answerflg}, update_date = #{update_date}, blob_data = #{blob_data} WHERE id = #{id};")
	void updateFAQ(FaqInfo faq);
	
	@Update("UPDATE faq SET answerflg = #{answerflg}, delete_date = #{delete_date} WHERE id = #{id};")
	void updateFAQ1(FaqInfo faq);
	
	@Delete("DELETE FROM faq WHERE id = #{id}")
	void deleteById(String id);

}
