package cn.bdqn.mapper;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.mapper
 * @Description: 员工
 * @Author 刘胡明
 * @Create 2021年03月31日 17时12分08秒
 */
public interface EmpMapper {

    List<Map<String,Object>> queryAll();
}
