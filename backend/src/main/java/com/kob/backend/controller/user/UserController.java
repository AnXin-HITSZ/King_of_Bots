package com.kob.backend.controller.user;

import com.kob.backend.mapper.UserMapper;
import com.kob.backend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: UserController
 * Package: com.kob.backend.controller.user
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/14 20:34
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;
    @GetMapping("/user/all/")
    public List<User> getAll() {
        return userMapper.selectList(null);
    }
}
