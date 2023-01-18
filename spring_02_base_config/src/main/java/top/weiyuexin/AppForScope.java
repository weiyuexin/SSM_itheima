package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.weiyuexin.service.BookService;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AppForScope
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/18 22:14
 */
public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService1 = (BookService) context.getBean("bookService");
        BookService bookService2 = (BookService) context.getBean("bookService");
        System.out.println(bookService1);
        System.out.println(bookService2);

    }
}
