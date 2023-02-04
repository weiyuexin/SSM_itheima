package top.weiyuexin.config;

import org.springframework.context.annotation.*;

/**
 * @PackageName: top.weiyuexin.config
 * @ProjectName: SSM_itheima
 * @ClassName: SpringConfig
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/4 20:14
 */
@Configuration
@ComponentScan("top.weiyuexin") //扫描bean
@PropertySource("classpath:jdbc.properties") //加载properties文件
@Import({JdbcConfig.class, MybatisConfig.class}) //加载jdbc和mybatis配置类
@EnableAspectJAutoProxy //告诉spring我们使用注解开发aop
public class SpringConfig {
}
