package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.bss.kintai.model.NotificationsInfo;

/**
 * Notifications情報 Mapper
 *
 */
@Mapper
public interface NotificationsInfoMapper {

	List<NotificationsInfo> getNotificationsListInfoByUserName();
	
	List<NotificationsInfo> getImportantNotifications();

	void insertNotifications1(NotificationsInfo notifications);

	void updateNotifications(NotificationsInfo notifications);

	void updateNotifications1(NotificationsInfo notifications);

	void deleteById(String id);

}
