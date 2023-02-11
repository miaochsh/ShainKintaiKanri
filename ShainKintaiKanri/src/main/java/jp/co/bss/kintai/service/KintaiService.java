/**
 * 
 */
package jp.co.bss.kintai.service;

import jp.co.bss.kintai.bean.UserBean;
/**
 * @author miaoc
 *
 */

public interface KintaiService {

    UserBean loginIn(String accountId,String password);

}