package com.kob.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kob.backend.mapper.UserMapper;
import com.kob.backend.pojo.User;
import com.kob.backend.service.impl.utils.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserDetailsServiceImpl
 * Package: com.kob.backend.service.impl
 * Description:
 *
 * @Author AnXin
 * @Create 2026/3/12 21:02
 * @Version 1.0
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户名加载用户的认证信息
     * @param username 一个 String 类型的用户名，通常来自登录表单或请求参数
     * @return 返回一个 UserDetails 对象，该对象封装了用户的所有认证相关信息，包括：
     *      * 密码（加密后的）
     *      * 权限集合（GrantedAuthority）
     *      * 账户状态（是否启用、未过期、未锁定等）
     * @throws UsernameNotFoundException 如果用户名不存在，必须抛出 UsernameNotFoundException，以告知认证提供者该用户无效
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("username", username);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            throw new RuntimeException("用户不存在");
        }

        return new UserDetailsImpl(user);
    }
}
