package com.kongoking.ksdstate.vo;

import com.baomidou.mybatisplus.annotation.*;
import com.kongoking.ksdstate.entity.StateDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author lnx
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Accessors(chain = true)
public class StateVo implements Serializable {
    private static final long serialVersionUID = -5075816865134059602L;
   /**
    *　数据主键
    */
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
    private Date createTime;
    /**
     * '更新时间'
     *  配置ｍｙｂａｔｉｓｐｌｕｓ自动填充
     */
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
     * 建立与统计详情的对应关系
     */

    private List<StateDetail> stateDetailList;
}
