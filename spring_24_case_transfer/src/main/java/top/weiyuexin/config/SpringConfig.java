package top.weiyuexin.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @PackageName: top.weiyuexin.config
 * @ProjectName: SSM_itheima
 * @ClassName: SpringConfig
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/5 20:52
 */
@Configuration
@ComponentScan("top.weiyuexin")
@PropertySource("jdbc.properties")
@EnableAspectJAutoProxy
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement //告诉spring，我们使用注解开发事务
public class SpringConfig {
}
