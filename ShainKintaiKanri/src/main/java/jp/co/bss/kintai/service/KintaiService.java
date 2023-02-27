/**
 * 
 */
package jp.co.bss.kintai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	public List<Kintai> findAll() {
		return kintaiMapper.findAll();
	}

	@Transactional
	public Kintai findOne(Long id) {
		return kintaiMapper.findOne(id);
	}

	@Transactional
	public void save(Kintai kintai) {
		kintaiMapper.save(kintai);
	}
	
	@Transactional
	public void update(Kintai kintai) {
		kintaiMapper.update(kintai);
	}

	@Transactional
	public void delete(Long id) {
		kintaiMapper.delete(id);
	}

}
