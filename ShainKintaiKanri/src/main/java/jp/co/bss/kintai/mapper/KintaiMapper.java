package jp.co.bss.kintai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.bss.kintai.dao.Kintai;

//import com.example.demo.dto.UserSearchRequest;

/**
 * @author miaoc
 *
 */
@Mapper
public interface KintaiMapper {
	
	/*
	 *情報検索
	 * ＠ユーザー情報
	 */
	
//	Kintai search(KintaiSearchRequest kintai);
	List<Kintai> findAll();

}
