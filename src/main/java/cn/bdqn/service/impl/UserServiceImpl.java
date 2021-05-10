package cn.bdqn.service.impl;

import cn.bdqn.mapper.UserMapper;
import cn.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年03月31日 19时27分26秒
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public List<Map<String, Object>> queryAll() {
        return userMapper.queryAll();
    }
}
