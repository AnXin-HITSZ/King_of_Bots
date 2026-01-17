package com.kob.backend.controller.bot;

import com.kob.backend.pojo.Bot;
import com.kob.backend.service.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: GetListController
 * Package: com.kob.backend.controller.bot
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/17 17:00
 * @Version 1.0
 */
@RestController
public class GetListController {
    @Autowired
    private GetListService getListService;

    @GetMapping("/user/bot/getlist/")
    public List<Bot> getList(){
        return getListService.getList();
    }
}
