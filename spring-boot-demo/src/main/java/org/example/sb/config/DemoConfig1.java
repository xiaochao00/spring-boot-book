package org.example.sb.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * config 1
 *
 * @author shichao
 * @since 1.0.0
 * 2021/6/6 21:27
 */
@Order
@Configuration
public class DemoConfig1 {
    @Bean
    @ConditionalOnMissingBean
    IDemoService demoService() {
        return () -> System.out.println("I am generate by config 1.");
    }
}
