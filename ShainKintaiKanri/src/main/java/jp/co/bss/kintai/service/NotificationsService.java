package jp.co.bss.kintai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.bss.kintai.mapper.NotificationsInfoMapper;
import jp.co.bss.kintai.model.NotificationsInfo;

@Service
public class NotificationsService {
	@Autowired
	private NotificationsInfoMapper notificationsInfoMapper;
	
	public List<NotificationsInfo> getAllNotifications() {
		List<NotificationsInfo> data = notificationsInfoMapper.getAllNotifications();
		return data;
	}
	
	public List<NotificationsInfo> getNormalNotifications() {
		List<NotificationsInfo> normalNotificationsData = notificationsInfoMapper.getNormalNotifications();    
		return normalNotificationsData;
	}
	
	public List<NotificationsInfo> getNotificationsDate(String yearMonth) {
		List<NotificationsInfo> notificationsDate = notificationsInfoMapper.getNotificationsDate(yearMonth);
		return notificationsDate;
	}
	
	public List<NotificationsInfo> getNormalNotificationsDate(String yearMonth) {
		List<NotificationsInfo> notificationsDate = notificationsInfoMapper.getNormalNotificationsDate(yearMonth);
		return notificationsDate;
	}
	
	public List<NotificationsInfo> getNotificationsDateList() {
		List<NotificationsInfo> dateList = notificationsInfoMapper.getNotificationsDateList();
		return dateList;
	}
	
	@Transactional
	public void insertNotifications1(NotificationsInfo notifications) {
		notificationsInfoMapper.insertNotifications1(notifications);
	}

	@Transactional
	public void updateNotifications(NotificationsInfo notifications) {
		notificationsInfoMapper.updateNotifications(notifications);
	}
	
	@Transactional
	public void updateNotifications1(NotificationsInfo notifications) {
		notificationsInfoMapper.updateNotifications1(notifications);
	}
	
	@Transactional
	public void deleteNotifications(String id) {
		notificationsInfoMapper.deleteById(id);
	}

}
