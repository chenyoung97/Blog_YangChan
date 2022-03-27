package club.aibyte.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @Author Yang Chan
 * @Package_name club.aibyte.controller
 * @Project_name Blog_Yangchan
 * @Create 2022-03 05
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        System.out.println("------index------");
        return "index";
    }

    @GetMapping("blog")
    public String blog() {
        return "blog";
    }
}
