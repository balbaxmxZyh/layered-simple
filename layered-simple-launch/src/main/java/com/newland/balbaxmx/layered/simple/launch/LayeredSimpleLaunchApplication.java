package com.newland.balbaxmx.layered.simple.launch;

import com.newland.balbaxmx.layered.simple.common.LogUtil;
import com.newland.balbaxmx.layered.simple.common.SpringBeanUtil;
import com.newland.balbaxmx.layered.simple.launch.launch.LaunchStart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.newland.balbaxmx")
@MapperScan(basePackages = "com.newland.balbaxmx.layered.simple.mapper")
public class LayeredSimpleLaunchApplication {

    public static void main(String[] args) {
        LogUtil.setLogFilePath();
        ApplicationContext context = SpringApplication.run(LayeredSimpleLaunchApplication.class, args);
        SpringBeanUtil.setApplicationContext(context);
        LaunchStart start = SpringBeanUtil.getBean(LaunchStart.class);
        start.start(args);

    }

}
