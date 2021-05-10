package cn.bdqn.service.impl;

import cn.bdqn.mapper.ProductsMapper;
import cn.bdqn.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年04月01日 00时42分12秒
 */
@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductsMapper productsMapper;

    public List<Map<String, Object>> queryAll() {
        return productsMapper.queryAll();
    }
}
