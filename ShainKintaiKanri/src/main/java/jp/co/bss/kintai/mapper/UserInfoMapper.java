/**
 * 
 */
package jp.co.bss.kintai.mapper;

import org.apache.ibatis.annotations.Mapper;

import jp.co.bss.kintai.dao.UserInfo;

/**
 * @author miaoc
 *
 */
@Mapper
public interface UserInfoMapper {
	UserInfo getUserInfoByName(String name);

}
