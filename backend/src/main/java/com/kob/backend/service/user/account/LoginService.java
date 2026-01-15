package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * ClassName: LoginService
 * Package: com.kob.backend.service.user.account
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/15 19:54
 * @Version 1.0
 */
public interface LoginService {
    Map<String, String> getToken(String username, String password);
}
