package com.kob.backend.config;

/**
 * ClassName: WebSocketConfig
 * Package: com.kob.backend.config
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/17 19:56
 * @Version 1.0
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {

        return new ServerEndpointExporter();
    }
}
