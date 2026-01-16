package com.kob.backend.controller.bot;

import com.kob.backend.pojo.Bot;
import com.kob.backend.service.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName: AddController
 * Package: com.kob.backend.controller.bot
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/16 16:48
 * @Version 1.0
 */
@RestController
public class AddController {
    @Autowired
    private AddService addService;

    @PostMapping("/user/bot/add/")
    public Map<String, String> add(@RequestParam Map<String,String> data){
        return addService.add(data);
    }
}
