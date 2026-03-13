package com.kob.backend.service.impl;

import com.kob.backend.service.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
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
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    }
}
