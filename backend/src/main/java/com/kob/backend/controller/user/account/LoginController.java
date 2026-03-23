package com.kob.backend.controller.user.account;

import com.kob.backend.service.user.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static net.sf.jsqlparser.util.validation.metadata.NamedObject.user;

/**
 * ClassName: LoginController
 * Package: com.kob.backend.controller.user.account
 * Description:
 *
 * @Author AnXin
 * @Create 2026/3/23 19:46
 * @Version 1.0
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/account/token/")
    public Map<String, String> getToken(@RequestParam Map<String, String> map) {
        String username = map.get("username");
        String password = map.get("password");

        return loginService.getToken(username, password);
    }
}
