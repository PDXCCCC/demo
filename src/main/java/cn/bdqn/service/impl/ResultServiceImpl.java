package cn.bdqn.service.impl;

import cn.bdqn.mapper.ResultMapper;
import cn.bdqn.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年03月31日 20时20分06秒
 */
@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    ResultMapper resultMapper;

    public List<Map<String, Object>> queryAll() {
        return resultMapper.queryAll();
    }
}
