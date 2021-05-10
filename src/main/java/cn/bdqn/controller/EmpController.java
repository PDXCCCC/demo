package cn.bdqn.controller;

import cn.bdqn.service.IEmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.bdqn.controller
 * @Description: 员工
 * @Author 刘胡明
 * @Create 2021年03月31日 17时20分35秒
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    IEmpService empService;

    @RequestMapping("/show")
    public String show(){
        return "/show";
    }

    @ResponseBody
    @RequestMapping("/query")
    public List<Map<String, Object>> queryAll(Model model){
        return empService.queryAll();
    }

}
