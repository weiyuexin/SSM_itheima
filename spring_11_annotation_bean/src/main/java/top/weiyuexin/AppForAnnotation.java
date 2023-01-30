package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.weiyuexin.config.SpringConfig;
import top.weiyuexin.dao.BookDao;
import top.weiyuexin.service.BookService;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AppForAnnotation
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/30 21:53
 */
// 纯注解开发
public class AppForAnnotation {
    public static void main(String[] args) {
        //加载配置类初始化容器
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}
