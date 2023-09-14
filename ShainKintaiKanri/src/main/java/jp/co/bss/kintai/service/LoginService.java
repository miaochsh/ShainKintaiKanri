/**
 * 
 */
package jp.co.bss.kintai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.bss.kintai.dao.UserInfo;
import jp.co.bss.kintai.mapper.UserInfoMapper;

@Service
public class LoginService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public boolean validateUser(String name, String password) {
        UserInfo userInfo = userInfoMapper.getUserInfoByName(name);
        if (userInfo != null && userInfo.getPassword().equals(password)) {
            return true; // 验证成功
        }
        return false; // 验证失败
    }
}
