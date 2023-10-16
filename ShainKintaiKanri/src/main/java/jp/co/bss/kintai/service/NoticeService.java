/**
 * 
 */
package jp.co.bss.kintai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.bss.kintai.mapper.NoticeInfoMapper;
import jp.co.bss.kintai.model.NoticeInfo;

@Service
public class NoticeService {
	@Autowired
	private NoticeInfoMapper noticeInfoMapper;
	
	public List<NoticeInfo> getNoticeInfoList() {
		List<NoticeInfo> data = noticeInfoMapper.getNoticeListInfoByUserName();
		return data;
	}
	
	@Transactional
	public void insertNotice1(NoticeInfo notice) {
		noticeInfoMapper.insertNotice1(notice);
	}

	@Transactional
	public void updateNotice(NoticeInfo notice) {
		noticeInfoMapper.updateNotice(notice);
	}
	
	@Transactional
	public void updateNotice1(NoticeInfo notice) {
		noticeInfoMapper.updateNotice1(notice);
	}
	
	@Transactional
	public void deleteNotice(String id) {
		noticeInfoMapper.deleteById(id);
	}

}
