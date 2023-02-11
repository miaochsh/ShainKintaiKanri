package jp.co.bss.kintai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.bss.kintai.dao.Kintai;
import jp.co.bss.kintai.mapper.KintaiMapper;

/**
 * @author miaoc
 *
 */
@Service
public class KintaiService {
	
	@Autowired
	private KintaiMapper kintaiMapper;
	
	public List<Kintai> searchAll(){
		
		return kintaiMapper.findAll();
		
	}
}
