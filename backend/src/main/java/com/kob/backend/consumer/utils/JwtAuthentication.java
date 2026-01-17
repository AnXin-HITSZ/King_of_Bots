package com.kob.backend.consumer.utils;

import com.kob.backend.utils.JwtUtil;
import io.jsonwebtoken.Claims;

/**
 * ClassName: JwtAuthentication
 * Package: com.kob.backend.consumer.utils
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/17 20:47
 * @Version 1.0
 */
public class JwtAuthentication {
    public static Integer getUserId(String token) {
        Integer userId = -1;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userId = Integer.parseInt(claims.getSubject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return userId;
    }
}
