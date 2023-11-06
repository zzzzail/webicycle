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
@TableName("t_bicycle_version")
public class BicycleVersion {
    
    @TableId(type = IdType.AUTO)
    private Long id;
    // 版本号
    private String version;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
