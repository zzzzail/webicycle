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
@TableName("t_user_role")
public class UserRole {
    @TableId(type = IdType.AUTO)
    private Long id;
    // 角色名称
    private String roleName;
    // 过期时间类型
    private Integer expireType;
    // 创建时间
    private LocalDateTime createTime;
    // 修改时间
    private LocalDateTime updateTime;
}
