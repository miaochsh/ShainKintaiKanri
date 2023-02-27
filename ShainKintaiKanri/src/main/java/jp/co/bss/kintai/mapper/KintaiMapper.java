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
	  
	//查询单个
	Kintai findOne(Long id);
	
	  //新增
	void save (Kintai kintai);
	
	  //修改已有信息
	void update (Kintai kintai);
	  
	//删除
	void delete (Long id);
	  

}
