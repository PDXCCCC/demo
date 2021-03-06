package cn.bdqn.service.impl;

import cn.bdqn.mapper.ProjectinfoMapper;
import cn.bdqn.service.ProjectinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年03月31日 20时47分04秒
 */
@Service
public class ProjectinfoServiceImpl implements ProjectinfoService {

    @Autowired
    ProjectinfoMapper projectinfoMapper;

    public List<Map<String, Object>> queryAll() {
        return projectinfoMapper.queryAll();
    }
}
