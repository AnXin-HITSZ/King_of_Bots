package com.kob.backend.service.impl.user.account;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kob.backend.mapper.UserMapper;
import com.kob.backend.pojo.User;
import com.kob.backend.service.user.account.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: RegisterServiceImpl
 * Package: com.kob.backend.service.impl.user.account
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/15 21:17
 * @Version 1.0
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private UserMapper userMapper;
    private PasswordEncoder passwordEncoder;

    @Override
    public Map<String, String> register(String username, String password, String confirmPassword) {
        Map<String, String> map = new HashMap<>();
        if (username == null) {
            map.put("error_success", "用户名不能为空");
            return map;
        }

        if (password == null || confirmPassword == null) {
            map.put("error_success", "密码不能为空");
            return map;
        }

        username = username.trim();
        if (username.isEmpty()) {
            map.put("error_success", "用户名不能为空");
            return map;
        }

        if (username.length() > 100) {
            map.put("error_success", "用户名长度不能大于 100");
            return map;
        }

        if (password.length() > 100 || confirmPassword.length() > 100) {
            map.put("error_success", "密码长度不能大于 100");
            return map;
        }

        if (!password.equals(confirmPassword)) {
            map.put("error_success", "两次输入的密码不一致");
            return map;
        }

        QueryWrapper<User> queryWrapper =  new QueryWrapper<User>();
        queryWrapper.eq("username",username);
        List<User> users = userMapper.selectList(queryWrapper);
        if (!users.isEmpty()) {
            map.put("error_success", "用户名已存在");
            return map;
        }

        String encodedPassword = passwordEncoder.encode(password);
        String photo = "D:\\Learn\\AcWing\\SpringBoot框架课\\doc\\2_配置git环境与项目创建\\images";
        User user = new User(null, username, encodedPassword, photo);
        userMapper.insert(user);

        map.put("error_success", "success");
        return map;
    }
}
