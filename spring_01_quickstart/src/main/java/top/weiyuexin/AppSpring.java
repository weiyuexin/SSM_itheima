package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.weiyuexin.dao.BookDao;
import top.weiyuexin.service.BookService;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AppSpring
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/17 22:19
 */
public class AppSpring {
    public static void main(String[] args) {
        // 3、获取IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4、获取bean
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();

        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
