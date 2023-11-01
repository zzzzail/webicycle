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
@TableName("t_bicycle_warning")
public class BicycleWarning {
    
    @TableId(type = IdType.AUTO)
    private Long id;
    // 车辆 id
    private Long bicycleId;
    // 报警类型
    private Integer warningType;
    // 处理状态
    private Integer handleStatus;
    // 创建时间
    private LocalDateTime createTime;
    // 修改时间
    private LocalDateTime updateTime;
}
