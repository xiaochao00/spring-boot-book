package org.example.sb.ch3.configuration;

import org.springframework.beans.factory.annotation.Value;

/**
 * configuration
 *
 * @author shichao
 * @since 1.0.0
 * 2021/5/6 19:18
 */
public class WithoutAnnoConfiguration {
    public WithoutAnnoConfiguration() {
        System.out.println("Create WithoutAnnoConfiguration instance.");
    }

    @Value("${admin.name}")
    private String name;

    @Value("${admin.age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WithoutAnnoConfiguration{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
