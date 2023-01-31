package top.weiyuexin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.weiyuexin.config.SpringConfig;
import top.weiyuexin.service.BookService;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: App
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/31 21:59
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}
