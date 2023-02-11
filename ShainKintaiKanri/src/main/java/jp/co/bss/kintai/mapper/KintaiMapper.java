/**
 * 
 */
package jp.co.bss.kintai.mapper;

import jp.co.bss.kintai.bean.UserBean;
/**
 * @author miaoc
 *
 */
public interface KintaiMapper {
    UserBean getInfo(String accountId,String password);
}
