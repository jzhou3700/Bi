package com.yupi.springbootinit.model.dto.chart;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.yupi.springbootinit.model.entity.Chart;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ChartAddRequest implements Serializable {

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

    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}