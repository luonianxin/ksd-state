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
@TableName("ksd_state_detail")
public class StateDetail implements Serializable {

 private static final long serialVersionUID = -7105525503196454517L;
 /**
    *　数据主键,统计项目ｉｄ
    */
   @TableId(type = IdType.AUTO)
    private Long id ;
    /**
     *  统计标题
     */
    private  String title;


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
     * 统计id
     */
    private Long stateid;
    /**
     * 具体项目点击数量
     */
    private int itemnum;

}
