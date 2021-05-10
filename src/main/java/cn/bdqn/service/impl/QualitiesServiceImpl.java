package cn.bdqn.service.impl;

import cn.bdqn.mapper.QualitiesMapper;
import cn.bdqn.service.QualitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年04月01日 00时48分31秒
 */
@Service
public class QualitiesServiceImpl implements QualitiesService {

    @Autowired
    QualitiesMapper qualitiesMapper;

    public List<Map<String, Object>> queryAll() {
        return qualitiesMapper.queryAll();
    }
}
