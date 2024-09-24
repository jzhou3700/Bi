package com.yupi.springbootinit.model.dto.chart;

import lombok.Data;

import java.io.Serializable;

@Data
public class GenChartByAiRequest implements Serializable {

    /*
    * 名称
    * */
    private String name;

    private String goal;

    private String chartType;
    private static final long serialVersionID = 1L;
}
