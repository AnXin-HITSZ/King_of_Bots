package com.kob.backend.service.impl.bot;

import com.kob.backend.pojo.User;
import com.kob.backend.service.bot.RemoveService;
import com.kob.backend.service.impl.utils.UserDetailsImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * ClassName: RemoveServiceImpl
 * Package: com.kob.backend.service.impl.bot
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/16 17:05
 * @Version 1.0
 */
@Service
public class RemoveServiceImpl implements RemoveService {
    @Override
    public Map<String, String> remove(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();
    }
}
