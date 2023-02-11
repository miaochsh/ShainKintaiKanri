package jp.co.bss.kintai.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.bss.kintai.bean.UserBean;
import jp.co.bss.kintai.mapper.KintaiMapper;
import jp.co.bss.kintai.service.KintaiService;

@Service
public class UserServiceImpl implements KintaiService {

    //将DAO注入Service层
    @Autowired
    private KintaiMapper kintaiMapper;

    @Override
    public UserBean loginIn(String accountId, String password) {
        return kintaiMapper.getInfo(accountId,password);
    }
}
