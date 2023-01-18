package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AppForInstanceBook
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/18 22:31
 */
public class AppForInstanceBook {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");

        bookDao.save();
    }
}
