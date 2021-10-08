package com.example.jenkins.config;

import com.example.jenkins.boot.autoconfigure.DataSourceProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description: DynamicDataSourceProperties
 * @author: 279000728@qq.com
 * @create: 2021-10-6 11:55
 **/
@Slf4j
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = DynamicDataSourceProperties.PREFIX)
public class DynamicDataSourceProperties {

    public static final String PREFIX = "spring.datasource.dynamic";

    /**
     * 每一个数据源
     */
    private Map<String, DataSourceProperty> datasource = new LinkedHashMap<>();

    private Map<String, String> map = new LinkedHashMap<>();

}
