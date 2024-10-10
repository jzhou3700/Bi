package com.yupi.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.springbootinit.model.entity.Chart;

import java.util.Map;

/**
* @author 95279
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2024-09-06 15:59:10
* @Entity com.yupi.springbootinit.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {

    Map<String,Object> queryChartData(String querysql);
}




