package com.kob.backend.controller.bot;

import com.kob.backend.mapper.BotMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName: RemoveController
 * Package: com.kob.backend.controller.bot
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/16 17:03
 * @Version 1.0
 */
@RestController
public class RemoveController {
    @Autowired
    private BotMapper botMapper;

    @PostMapping("/user/bot/remove")
    public Map<String, String> remove(@RequestParam Map<String,String> data){

    }
}
