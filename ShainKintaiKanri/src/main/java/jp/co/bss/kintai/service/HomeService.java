package jp.co.bss.kintai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.bss.kintai.mapper.HomeInfoMapper;
import jp.co.bss.kintai.model.HomeInfo;

@Service
public class HomeService {
	@Autowired
	private HomeInfoMapper homeInfoMapper;
	
	public List<HomeInfo> getNotificationTitleInfoList() {
		List<HomeInfo> data = homeInfoMapper.getNotificationTitleListInfoByUserName();
		return data;
	}

	@Transactional
	public void updateNotifications(HomeInfo notificationTitle) {
		homeInfoMapper.updateNotificationTitle(notificationTitle);
	}

}
