package com.webicycle.service.impl;

import com.webicycle.entity.AdminUser;
import com.webicycle.mapper.AdminUserMapper;
import com.webicycle.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangxq
 * @since 2023/11/1
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    
    @Autowired
    private AdminUserMapper adminUserMapper;
    
    @Override
    public AdminUser getById(Long id) {
        return adminUserMapper.selectById(id);
    }
}
