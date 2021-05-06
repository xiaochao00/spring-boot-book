# Spring Boot 技术内幕

## import注解
[ImportSelector和DeferredImportSelector区别](./spring-boot-demo/src/main/java/org/example/sb/selector)

## 自定义应用程序初始化加载器
[LearnApplicationInitializer](./spring-boot-demo/src/main/java/org/example/sb/ch3/initializer/LearnApplicationInitializer.java)

## 自定义应用程序监听器
[LearnListener](./spring-boot-demo/src/main/java/org/example/sb/ch3/listener/LearnListener.java)

## 加载自定义配置源
[WithoutAnnoConfiguration](./spring-boot-demo/src/main/java/org/example/sb/ch3/configuration/WithoutAnnoConfiguration.java)

另外在启动类中通过SpringApplication的setSources方法加入该配置类：
```java
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
```

