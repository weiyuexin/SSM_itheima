package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: App
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/28 21:58
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);
    }
}
