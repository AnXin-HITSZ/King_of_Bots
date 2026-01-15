package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: IndexController
 * Package: com.kob.backend.controller.pk
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/15 16:05
 * @Version 1.0
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "pk/index.html";
    }
}
