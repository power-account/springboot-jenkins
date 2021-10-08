package com.example.jenkins.boot.autoconfigure;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import javax.sql.DataSource;
import java.util.regex.Pattern;

/**
 * @description: DataSourceProperty
 * @author: 279000728@qq.com
 * @create: 2021-10-6 11:58
 **/
@Slf4j
@Data
public class DataSourceProperty {
    /**
     * 加密正则
     */
    private static final Pattern ENC_PATTERN = Pattern.compile("^ENC\\((.*)\\)$");

    /**
     * 连接池名称(只是一个名称标识)</br> 默认是配置文件上的名称
     */
    private String poolName;
    /**
     * 连接池类型，如果不设置自动查找 Druid > HikariCp
     */
    private Class<? extends DataSource> type;
    /**
     * JDBC driver
     */
    private String driverClassName;
    /**
     * JDBC url 地址
     */
    private String url;
    /**
     * JDBC 用户名
     */
    private String username;
    /**
     * JDBC 密码
     */
    private String password;
    /**
     * jndi数据源名称(设置即表示启用)
     */
    private String jndiName;
    /**
     * 自动运行的建表脚本
     */
    private String schema;
    /**
     * 自动运行的数据脚本
     */
    private String data;
    /**
     * 是否启用seata
     */
    private Boolean seata = true;
    /**
     * 是否启用p6spy
     */
    private Boolean p6spy = true;
    /**
     * lazy init datasource
     */
    private Boolean lazy;
    /**
     * 错误是否继续 默认 true
     */
    private boolean continueOnError = true;
    /**
     * 分隔符 默认 ;
     */
    private String separator = ";";

    /**
     * 解密公匙(如果未设置默认使用全局的)
     */
    private String publicKey;

}
