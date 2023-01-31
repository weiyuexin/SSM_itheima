package top.weiyuexin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import top.weiyuexin.dao.BookDao;

import javax.sql.DataSource;

/**
 * @PackageName: top.weiyuexin.config
 * @ProjectName: SSM_itheima
 * @ClassName: JdbcConfig
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/31 23:12
 */
public class JdbcConfig {
    // 1、定义一个方法获得要管理的bean对象
    // 2、添加@Bean，表示当前方法返回值是一个bean

    // 注入简单类型资源
    @Value("com.cj.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/ssm_db")
    private String url;
    @Value("root")
    private String userName;
    @Value("root")
    private String passWord;
    @Bean
    public DataSource dataSource(BookDao bookDao){ // 注入引用类型资源
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(passWord);
        System.out.println(bookDao);
        bookDao.save();
        return ds;
    }
}
