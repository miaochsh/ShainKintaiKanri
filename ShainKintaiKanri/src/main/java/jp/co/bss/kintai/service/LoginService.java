/**
 * 
 */
package jp.co.bss.kintai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.bss.kintai.mapper.UserMapper;
import jp.co.bss.kintai.model.User;

@Service
public class LoginService {
    @Autowired
    private UserMapper userMapper;

    public boolean validateUser(String name, String password) {
        User userInfo = userMapper.getUserInfoByName(name);
        if (userInfo != null && userInfo.getPassword().equals(password)) {
            return true; // 验证成功
        }
        return false; // 验证失败
    }
}
