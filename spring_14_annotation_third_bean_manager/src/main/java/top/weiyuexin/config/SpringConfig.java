package top.weiyuexin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @PackageName: top.weiyuexin.config
 * @ProjectName: SSM_itheima
 * @ClassName: SpringConfig
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/31 23:01
 */
@Configuration
@ComponentScan("top.weiyuexin.dao") //注入引用类型时需要扫描bean
@Import({JdbcConfig.class}) //导入配置类class
public class SpringConfig {
    /*// 1、定义一个方法获得要管理的bean对象
    // 2、添加@Bean，表示当前方法返回值是一个bean
    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.cj.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/ssm_db");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }*/


    /**
     * 第三方bean管理
     *   @Bean
     * 第三方bean依赖注入
     *   引用类型：方法形参
     *   简单类型：成员变量
     *
     */

}
