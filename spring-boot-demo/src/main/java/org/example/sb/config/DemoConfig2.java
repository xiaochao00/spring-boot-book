package org.example.sb.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * config 1
 *
 * @author shichao
 * @since 1.0.0
 * 2021/6/6 21:27
 */
@Configuration
public class DemoConfig2 {
    @Bean
    @ConditionalOnMissingBean
    IDemoService demoService() {
        return () -> System.out.println("I am generate by config 2.");
    }
}
