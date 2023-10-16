/**
 * 
 */
package jp.co.bss.kintai.mapper;

import org.apache.ibatis.annotations.Mapper;

import jp.co.bss.kintai.model.User;

/**
 * @author miaoc
 *
 */
@Mapper
public interface UserMapper {
	User getUserInfoByName(String name);

}
