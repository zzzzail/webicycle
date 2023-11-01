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
@TableName("t_bicycle")
public class Bicycle {
    @TableId(type = IdType.AUTO)
    private Long id;
    // 自行车编码 二维码
    private String code;
    // 自行车版本 id
    private Long versionId;
    /**
     * 自行车状态
     * @see com.webicycle.enums.BicycleStatusEnum
     */
    private Integer status;
    // 创建时间
    private LocalDateTime createTime;
    // 更新时间
    private LocalDateTime updateTime;
}
