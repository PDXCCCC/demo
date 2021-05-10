package cn.bdqn.controller;

import cn.bdqn.service.UserService;
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
 * @Create 2021年03月31日 19时31分03秒
 */
@Controller
@RequestMapping("/us")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String user(){
        return "/user";
    }

    @ResponseBody
    @RequestMapping("/query")
    public List<Map<String, Object>> queryAll(Model model){
        return userService.queryAll();
    }
}
