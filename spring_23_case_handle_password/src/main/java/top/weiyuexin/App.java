package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.weiyuexin.config.SpringConfig;
import top.weiyuexin.service.ResourcesService;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: App
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/5 19:15
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = context.getBean(ResourcesService.class);
        boolean flag = resourcesService.openURL("https://pan.baidu.com/hhh","root ");
        System.out.println(flag);
    }
}
