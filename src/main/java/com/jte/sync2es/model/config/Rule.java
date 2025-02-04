package com.jte.sync2es.model.config;

import lombok.Data;

/**
 * 规则配置
 */
@Data
public class Rule {
    /**
     * 表名，支持正则表达式
     */
    private String table;
    /**
     * 自定义es的index名称
     */
    private String index;
    /**
     * 自定义同步到es的字段名称和字段类型
     * 字段类型请参考类：com.jte.sync2es.model.es.EsDateType
     * 如：map:  {"group_code":"groupCode","hotel_code":"hotelCode,integer","user_code":",integer"}
     */
    private String map;
    /**
     * 字段过滤，多个字段用逗号分隔。如果有值，则只保留这里填写的字段。
     */
    private String fieldFilter;
}
