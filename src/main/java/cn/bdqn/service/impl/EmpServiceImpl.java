package cn.bdqn.service.impl;

import cn.bdqn.mapper.EmpMapper;
import cn.bdqn.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年03月31日 17时31分15秒
 */
@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    private EmpMapper empMapper;

    public List<Map<String, Object>> queryAll() {
        return empMapper.queryAll();
    }
}
