package cn.bdqn.service.impl;

import cn.bdqn.mapper.InvitationMapper;
import cn.bdqn.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.service.impl
 * @Description:
 * @Author 刘胡明
 * @Create 2021年04月01日 00时54分46秒
 */
@Service
public class InvitationServiceImpl implements InvitationService {

    @Autowired
    InvitationMapper invitationMapper;

    public List<Map<String, Object>> queryAll() {
        return invitationMapper.queryAll();
    }
}
