package com.kob.backend.service.impl.user.account;

import com.kob.backend.pojo.User;
import com.kob.backend.service.impl.utils.UserDetailsImpl;
import com.kob.backend.service.user.account.LoginService;
import com.kob.backend.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LoginServiceImpl
 * Package: com.kob.backend.service.impl.user.account
 * Description:
 *
 * @Author AnXin
 * @Create 2026/3/23 19:17
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    /**
     * Spring Security 认证管理器接口
     */
    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public Map<String, String> getToken(String username, String password) {
        // 封装认证请求（创建未认证令牌）
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        // 执行身份验证（由认证管理器校验）
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        // 获取用户详情对象
        UserDetailsImpl loginUser = (UserDetailsImpl) authentication.getPrincipal();    // 获取当前用户的身份信息
        // 提取业务用户实体
        User user = loginUser.getUser();
        // 生成 JWT 令牌
        String jwt = JwtUtil.createJWT(user.getId().toString());

        Map<String, String> map = new HashMap<>();
        map.put("error_message", "success");
        map.put("token", jwt);

        return map;
    }
}
