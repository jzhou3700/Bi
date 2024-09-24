package com.yupi.springbootinit.model.dto.chart;

import com.baomidou.mybatisplus.annotation.TableField;
import com.yupi.springbootinit.common.PageRequest;
import lombok.Data;

import java.io.Serializable;


@Data
public class ChartEditRequest  extends PageRequest implements Serializable {

    private long id;

    private String goal;

    private String chartType;

    private Long userID;

    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}