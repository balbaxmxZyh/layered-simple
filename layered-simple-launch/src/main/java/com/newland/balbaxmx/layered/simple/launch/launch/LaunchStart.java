package com.newland.balbaxmx.layered.simple.launch.launch;


import com.newland.balbaxmx.layered.simple.common.SpringBeanUtil;
import com.newland.balbaxmx.layered.simple.module.User;
import com.newland.balbaxmx.layered.simple.service.RoleService;
import com.newland.balbaxmx.layered.simple.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: zhangyh
 * @ClassName: LaunchStart
 * @Date: 2020/5/11 16:19
 * @Operation:
 * @Description: 主程序
 */
@Component
public class LaunchStart {

    private static Logger logger = LoggerFactory.getLogger(LaunchStart.class);

    @Autowired
    private UserService service;

    @Autowired
    private RoleService roleService;

    public void start(String[] args){
        logger.info("启动");
        List<User> list = service.selectAll();
        list.forEach(System.out::println);
        roleService.say();
        while (true){

        }
    }
}
