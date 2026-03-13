package com.kob.backend.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kob.backend.mapper.UserMapper;
import com.kob.backend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: UserController
 * Package: com.kob.backend.controller.user
 * Description:
 *
 * @Author AnXin
 * @Create 2026/3/11 22:50
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户
     */
    @GetMapping("/user/all/")
    public List<User> getAll() {
        return userMapper.selectList(null);
    }

    /**
     * 查询单个用户
     */
    @GetMapping("/user/{userId}/")
    public User getUser(@PathVariable("userId") Integer userId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", userId);

        return userMapper.selectOne(queryWrapper);
    }

    /**
     * 添加某个用户，直接输入 id、name、password
     */
    @GetMapping("/user/add/{userId}/{username}/{password}/")
    public String addUser(@PathVariable("userId") Integer userId,
                          @PathVariable("username") String username,
                          @PathVariable("password") String password) {
        User user = new User(userId, username, password);
        userMapper.insert(user);
        return "Add User Successfully";
    }

    /**
     * 删除某个用户，直接输入 id
     */
    @GetMapping("/user/delete/{userId}/")
    public String deleteUser(@PathVariable("userId") Integer userId) {
        userMapper.deleteById(userId);
        return "Delete User Successfully";
    }

}
