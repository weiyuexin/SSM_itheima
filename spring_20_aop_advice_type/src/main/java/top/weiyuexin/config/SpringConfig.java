package top.weiyuexin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @PackageName: top.weiyuexin.config
 * @ProjectName: SSM_itheima
 * @ClassName: SpringConfig
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/3 11:53
 */
@Configuration //定义这个类是spring配置类
@ComponentScan("top.weiyuexin") //扫描bean
@EnableAspectJAutoProxy //告诉spring，我们是使用注解开发的aop，
public class SpringConfig {
}
