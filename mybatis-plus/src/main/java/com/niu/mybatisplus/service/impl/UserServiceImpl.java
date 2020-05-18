package com.niu.mybatisplus.service.impl;

import com.niu.mybatisplus.entity.User;
import com.niu.mybatisplus.mapper.UserMapper;
import com.niu.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author niuhaijun
 * @since 2020-05-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
