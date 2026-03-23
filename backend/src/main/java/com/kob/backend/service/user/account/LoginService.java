package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * ClassName: LoginService
 * Package: com.kob.backend.service.user.account
 * Description:
 *
 * @Author AnXin
 * @Create 2026/3/23 19:16
 * @Version 1.0
 */
public interface LoginService {
    public Map<String, String> getToken(String username, String password);
}
