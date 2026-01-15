package com.kob.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        // 1️⃣ 配置跨域规则
        CorsConfiguration config = new CorsConfiguration();

        // 如果你不需要携带 cookie，可以直接使用 "*"
        // config.addAllowedOrigin("*");

        // 如果需要携带 cookie，则必须指定前端地址
        config.setAllowedOrigins(Arrays.asList("http://localhost:8080"));

        // 允许所有请求头
        config.addAllowedHeader(CorsConfiguration.ALL);

        // 允许所有请求方法 GET/POST/PUT/DELETE/OPTIONS
        config.addAllowedMethod(CorsConfiguration.ALL);

        // 允许携带 cookie
        config.setAllowCredentials(true);

        // 预检请求的有效期，单位秒
        config.setMaxAge(3600L);

        // 2️⃣ 绑定路径
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config); // 对所有接口生效

        // 3️⃣ 返回 CorsFilter
        return new CorsFilter(source);
    }
}
