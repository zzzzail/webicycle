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
@TableName("t_map_area")
public class MapArea {
    @TableId(type = IdType.AUTO)
    private Long id;
    // 区域名称
    private String areaName;
    // json 配置信息
    private String json;
    // 创建时间
    private LocalDateTime createTime;
    // 修改时间
    private LocalDateTime updateTime;
}
