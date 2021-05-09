package com.kongoking.ksdstate.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lnx
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Accessors(chain = true)
@TableName("ksd_state")
public class State implements Serializable {
    private static final long serialVersionUID = -5075816865134059602L;
   /**
    *　数据主键
    */
   @TableId(type = IdType.AUTO)
    private Long id ;
    /**
     *  统计标题
     */
    private  String title;
    /**
     * 统计描述
     */
    private String description;
    /**
     * 参与人数
     */
    private int personnum;
    /**
     * 结束时间
     */
    private  String endtime;
    /**
     * '发布状态'
     */
    private int state;
    /**
     * '创建时间'
     * 配置ｍｙｂａｔｉｓｐｌｕｓ自动填充
     */
    @TableField(fill=FieldFill.INSERT)
    private Date createTime;
    /**
     * '更新时间'
     *  配置ｍｙｂａｔｉｓｐｌｕｓ自动填充
     */
    @TableField(fill=FieldFill.INSERT_UPDATE)
    private Date updateTime;
    /**
     * '添加人'
     */
    private int userid;
    /**
     * '添加人名字'
     */
    private String username;
    /**
     * 背景图片路径
     */
    private String bgImg;

}
