package org.example.sb;

import org.example.sb.ch3.configuration.WithoutAnnoConfiguration;
import org.example.sb.ch3.initializer.LearnApplicationInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * spring boot demo
 *
 * @author shichao
 * @since 1.0.0
 * 2021/4/26 23:23
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // SpringApplication.run(DemoApplication.class, args);
        SpringApplication demoApp = new SpringApplication(DemoApplication.class);
        demoApp.addInitializers(new LearnApplicationInitializer());
        // 关闭banner
        //  demoApp.setBannerMode(Banner.Mode.OFF);
        // 设置source
        Set<String> sources = new HashSet<>();
        sources.add(WithoutAnnoConfiguration.class.getName());
        demoApp.setSources(sources);

        ConfigurableApplicationContext context = demoApp.run(args);

        WithoutAnnoConfiguration withoutBean = context.getBean(WithoutAnnoConfiguration.class);
        System.out.println(withoutBean);
    }
}
