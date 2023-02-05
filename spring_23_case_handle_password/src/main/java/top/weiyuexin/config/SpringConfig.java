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
 * @Date: 2023/2/5 19:15
 */
@Configuration
@ComponentScan("top.weiyuexin")
@EnableAspectJAutoProxy
public class SpringConfig {
}
