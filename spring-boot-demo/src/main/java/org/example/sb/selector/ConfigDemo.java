package org.example.sb.selector;

import org.example.sb.selector.bean.ConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * config demo
 *
 * @author shichao
 * @since 1.0.0
 * 2021/5/5 16:55
 */
@Configuration
@Import({DeferredImportSelectorDemo.class, ImportSelectorDemo.class})
public class ConfigDemo {
    @Bean
    ConfigBean getConfigDemo() {
        return new ConfigBean();
    }
}
