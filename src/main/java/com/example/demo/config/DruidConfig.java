package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 配置druid需要的配置类，引入application.properties文件中以spring.datasource开头的信息
 * <p>
 * 因此需要在application.properties文件中配置相关信息。
 *
 * @author Administrator
 */
@Configuration
public class DruidConfig {
    //配置的是数据源
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")//把配置文件中的属性整合到类中与bean结合使用
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
    //配置监控
    //1.配置一个后台的servlet
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");
        Map<String, String> initParams = new HashMap<>();
        initParams.put("allow","192.168.1.20,127.0.0.1");
        initParams.put("deny","192.168.16.111");
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        initParams.put("resetEnable","false");
        bean.setInitParameters(initParams);
        return bean;
    }
    
    
    //2.配置一个filter,过滤规则
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String, String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

}