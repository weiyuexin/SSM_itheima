package top.weiyuexin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @PackageName: top.weiyuexin.config
 * @ProjectName: SSM_itheima
 * @ClassName: SpringConfig
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/31 22:01
 */
@Configuration
@ComponentScan("top.weiyuexin")
@PropertySource("jdbc.properties") //加载外部properties文件源，不支持使用通配符*
public class SpringConfig {
}
