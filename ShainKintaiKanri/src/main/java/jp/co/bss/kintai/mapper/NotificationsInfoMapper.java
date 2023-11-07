package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.bss.kintai.model.NotificationsInfo;

/**
 * Notifications情報 Mapper
 *
 */
@Mapper
public interface NotificationsInfoMapper {
	
	List<NotificationsInfo> getAllNotifications();
	
	List<NotificationsInfo> getNormalNotifications();
	
	List<NotificationsInfo> getNotificationsDate(@Param("yearMonth") String yearMonth);
	
	List<NotificationsInfo> getNormalNotificationsDate(@Param("yearMonth") String yearMonth);
	
	List<NotificationsInfo> getNotificationsDateList();
	
	void insertNotifications1(NotificationsInfo notifications);

	void updateNotifications(NotificationsInfo notifications);
	
	void updateNotifications1(NotificationsInfo notifications);
	
	void deleteById(String id);

}
