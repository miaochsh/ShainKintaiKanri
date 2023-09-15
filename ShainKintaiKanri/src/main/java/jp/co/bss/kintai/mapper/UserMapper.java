/**
 * 
 */
package jp.co.bss.kintai.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.bss.kintai.model.User;

/**
 * @author miaoc
 *
 */
@Mapper
public interface UserMapper {
  @Select("SELECT * FROM public.user WHERE name = #{name}")
	User getUserInfoByName(String name);

}
