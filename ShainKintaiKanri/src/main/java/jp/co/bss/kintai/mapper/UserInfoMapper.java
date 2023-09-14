/**
 * 
 */
package jp.co.bss.kintai.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.bss.kintai.dao.UserInfo;

/**
 * @author miaoc
 *
 */
@Mapper
public interface UserInfoMapper {
	
	@Select("SELECT * FROM public.user WHERE name = #{name}")
	UserInfo getUserInfoByName(String name);

}
