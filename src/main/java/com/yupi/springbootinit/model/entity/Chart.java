package com.yupi.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 图表信息表
 * @TableName chart
 */
@TableName(value ="chart")
@Data
public class Chart implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 生成的图表名称
     */
    private String genchart;
    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表数据
     */
    private String chartdata;

    /**
     * 图表类型
     */
    private String charttype;

    /**
     * 生成的图表名称
     */
    private String name;

    /**
     * 生成的分析结论
     */
    private String genresult;

    /**
     * 任务状态
     */
    private String status;

    /**
     *执行信息
     */
    private String execMessage;
    /**
     * 创建用户
     */
    private Long userid;
    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 
     */
    private Date updatetime;



    /**
     * 是否删除
     */
    private Integer isdelte;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}