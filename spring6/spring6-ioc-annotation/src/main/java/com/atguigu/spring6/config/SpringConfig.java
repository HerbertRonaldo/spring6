package com.atguigu.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration         // 配置类
@ComponentScan("com.atguigu.spring6")  // 指定要扫描的包的路径
public class SpringConfig {
}
