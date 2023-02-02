package top.weiyuexin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @PackageName: top.weiyuexin.config
 * @ProjectName: SSM_itheima
 * @ClassName: SpringConfig
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/2 21:21
 */
@Configuration
@ComponentScan("top.weiyuexin")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
