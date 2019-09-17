package com.woniu.service.impl;

import com.woniu.entity.User;
import com.woniu.entity.UserExample;
import com.woniu.mapper.UserMapper;
import com.woniu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    /**
     * 查询用户信息；
     * @param uid
     * @return
     * @throws Exception
     */
    @Override
    public User getUser(Integer uid) throws Exception {
        return userMapper.getUser(uid);
    }

    /**
     * 更新用户信息
     * @param user
     * @throws Exception
     */
    @Override
    public void updateUser(User user) throws Exception {
        userMapper.insertSelective(user);

    }

    /**
     * 删除用户信息
     * @param uid
     * @throws Exception
     */
    @Override
    public void deleteUser(Integer uid) throws Exception {
        UserExample ue=new UserExample();
        ue.createCriteria().andIdEqualTo(uid);
        userMapper.deleteByExample(ue);
    }

    /**
     * 新增用户信息
     * @param user
     * @throws Exception
     */
    @Override
    public void insertUser(User user) throws Exception {
        userMapper.insertSelective(user);
    }
}
