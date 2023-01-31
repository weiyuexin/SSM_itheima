package top.weiyuexin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.weiyuexin.config.SpringConfig;

import javax.sql.DataSource;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: App
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/31 23:01
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取第三方bean
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
