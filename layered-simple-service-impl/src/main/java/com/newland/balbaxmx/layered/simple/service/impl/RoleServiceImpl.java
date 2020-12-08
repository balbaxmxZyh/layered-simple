package com.newland.balbaxmx.layered.simple.service.impl;

import com.newland.balbaxmx.layered.simple.mapper.UserMapper;
import com.newland.balbaxmx.layered.simple.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangyh
 * @ClassName: RoleServiceImpl
 * @Date: 2020/5/12 14:07
 * @Operation:
 * @Description: ${description}
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void say() {
        userMapper.selectUser();
        System.out.println("say");
    }
}
