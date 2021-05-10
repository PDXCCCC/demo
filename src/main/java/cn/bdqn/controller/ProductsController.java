package cn.bdqn.controller;

import cn.bdqn.service.ProductsService;
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
 * @Create 2021年04月01日 00时43分05秒
 */
@Controller
@RequestMapping("/produ")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @RequestMapping("/products")
    public String products(){
        return "/products";
    }

    @ResponseBody
    @RequestMapping("/query")
    public List<Map<String, Object>> queryAll(Model model){
        return productsService.queryAll();
    }

}
