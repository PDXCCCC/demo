package cn.bdqn.controller;


import cn.bdqn.service.ProjectinfoService;
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
 * @Create 2021年03月31日 20时48分10秒
 */
@Controller
@RequestMapping("/pro")
public class ProjectinfoController {

    @Autowired
    ProjectinfoService projectinfoService;

    @RequestMapping("/project")
    public String projectinfo(){
        return "/project";
    }

    @ResponseBody
    @RequestMapping("/query")
    public List<Map<String,Object>> queryAll(Model model){
        return projectinfoService.queryAll();
    }

}
