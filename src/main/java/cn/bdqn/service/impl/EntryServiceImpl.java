package cn.bdqn.service.impl;

import cn.bdqn.mapper.EntryMapper;
import cn.bdqn.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年04月01日 00时22分14秒
 */
@Service
public class EntryServiceImpl implements EntryService {

    @Autowired
    EntryMapper entryMapper;

    public List<Map<String, Object>> queryAll() {
        return entryMapper.queryAll();
    }
}
