package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * ClassName: BotInfoController
 * Package: com.kob.backend.controller.pk
 * Description:
 *
 * @Author AnXin
 * @Create 2026/3/11 15:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/pk/")
public class BotInfoController {

    @RequestMapping("getbotinfo/")
    public List<Map<String, String>> getBotInfo(){
        return null;
    }

}
