package cn.bdqn.service.impl;

import cn.bdqn.mapper.CategoryMapper;
import cn.bdqn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年04月01日 00时34分54秒
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    public List<Map<String, Object>> queryAll() {
        return categoryMapper.queryAll();
    }
}
