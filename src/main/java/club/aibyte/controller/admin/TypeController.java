package club.aibyte.controller.admin;

import club.aibyte.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Yang Chan
 * @Package_name club.aibyte.controller.admin
 * @Project_name Blog_YangChan
 * @Create 2022-06 28
 * @QQ群：339575270
 * @URL：www.aibyte.club
 */
@Controller
@RequestMapping("/admin")
public class TypeController {
    @Autowired
    private TypeService typeService;


}
