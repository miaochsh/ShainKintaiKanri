/**
 * 
 */
package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.bss.kintai.dao.Kintai;

/**
 * @author miaoc
 *
 */

@Mapper
public interface KintaiMapper {
	List<Kintai> findAll();
	  
	Kintai findOne(Long id);
	  //新增
	  void save (Kintai kintai);
	  

}
