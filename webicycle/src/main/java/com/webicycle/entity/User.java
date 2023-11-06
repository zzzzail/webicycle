package com.webicycle.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author zhangxq
 * @since 2023/11/1
 */
@Data
@EqualsAndHashCode
@ToString
@TableName("t_user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    // 真实姓名
    private String realname;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 角色 id
    private Long roleId;
    // 账号过期时间
    private LocalDateTime expireTime;
    // 创建时间
    private LocalDateTime createTime;
    // 更新时间
    private LocalDateTime updateTime;
}
