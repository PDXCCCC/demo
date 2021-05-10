package cn.bdqn.mapper;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.mapper
 * @Description:
 * @Author 刘胡明
 * @Create 2021年04月01日 00时40分33秒
 */
public interface ProductsMapper {

    List<Map<String,Object>> queryAll();
}
