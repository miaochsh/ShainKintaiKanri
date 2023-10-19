package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.bss.kintai.model.HomeInfo;

/**
 * Notifications情報 Mapper
 *
 */
@Mapper
public interface HomeInfoMapper {
	
	List<HomeInfo> getNotificationTitleListInfoByUserName();

	void updateNotificationTitle(HomeInfo notificationTitle);

}
