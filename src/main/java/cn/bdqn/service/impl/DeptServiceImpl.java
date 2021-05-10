package cn.bdqn.service.impl;

import cn.bdqn.mapper.DeptMapper;
import cn.bdqn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年03月31日 20时40分19秒
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    public List<Map<String, Object>> queryAll() {
        return deptMapper.queryAll();
    }
}
