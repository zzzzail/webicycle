package com.webicycle.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author zhangxq
 * @since 2023/11/1
 */
@Data
@EqualsAndHashCode
@ToString
@TableName("t_admin_role_authority")
public class AdminRoleAuthority {
    @TableId(type = IdType.AUTO)
    private Long id;
    // 角色 id
    private Long roleId;
    // 权限 id
    private Long authorityId;
}
