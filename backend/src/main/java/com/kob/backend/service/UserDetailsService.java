package com.kob.backend.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserDetailsService
 * Package: com.kob.backend.service
 * Description:
 *
 * @Author AnXin
 * @Create 2026/3/12 21:02
 * @Version 1.0
 */
public interface UserDetailsService {

    /**
     * 根据用户名加载用户的认证信息
     * @param username 一个 String 类型的用户名，通常来自登录表单或请求参数
     * @return 返回一个 UserDetails 对象，该对象封装了用户的所有认证相关信息，包括：
     *      * 密码（加密后的）
     *      * 权限集合（GrantedAuthority）
     *      * 账户状态（是否启用、未过期、未锁定等）
     * @throws UsernameNotFoundException 如果用户名不存在，必须抛出 UsernameNotFoundException，以告知认证提供者该用户无效
     */
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
