package org.example.sb.ch3.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * initializer
 *
 * @author shichao
 * @since 1.0.0
 * 2021/5/6 18:04
 */
public class LearnApplicationInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("There are beans count:" + applicationContext.getBeanDefinitionCount() + " in spring container when initializer.");
    }
}
