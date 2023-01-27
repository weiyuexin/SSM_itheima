package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.weiyuexin.service.BookService;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: ${PROJECT_NAME}
 * @ClassName: ${NAME}
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: ${DATE} ${TIME}
 */
public class AppForDIAutoWare {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}