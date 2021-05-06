package org.example.sb.ch3.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * listener
 *
 * @author shichao
 * @since 1.0.0
 * 2021/5/6 18:44
 */
@Component
public class LearnListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("There ara bean count:" + event.getApplicationContext().getBeanDefinitionCount() + " in listener when refresh context.");
    }
}
