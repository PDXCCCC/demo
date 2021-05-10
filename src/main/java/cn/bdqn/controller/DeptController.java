package cn.bdqn.controller;

import cn.bdqn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.controller
 * @Description:
 * @Author 刘胡明
 * @Create 2021年03月31日 20时38分47秒
 */
@Controller
@RequestMapping("/de")
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping("/dept")
    public String show(){
        return "/dept";
    }

    @ResponseBody
    @RequestMapping("/query")
    public List<Map<String, Object>> queryAll(Model model){
        return deptService.queryAll();
    }

}
