/**
 * 
 */
package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.bss.kintai.model.NoticeInfo;

/**
 * Notifications情報 Mapper
 *
 */
@Mapper
public interface NoticeInfoMapper {
	
	List<NoticeInfo> getNoticeListInfoByUserName();
	
	void insertNotice1(NoticeInfo notifications);

	void updateNotice(NoticeInfo notifications);
	
	void updateNotice1(NoticeInfo notifications);
	
	void deleteById(String id);

}
