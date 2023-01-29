package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: App
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/29 21:59
 */
public class App {
    public static void main(String[] args) {
        // TODO 加载配置文件的两种方法
        //1、加载类路径下的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、从文件系统下加载配置文件
        //ApplicationContext context = new FileSystemXmlApplicationContext("F:\\IDEA_WorkSpace\\SSM_itheima\\spring_10_container\\src\\main\\resources\\applicationContext.xml");
        // TODO 获取Bean的三种方法
        // 1、使用bean名称获取（需要强制类型转换）
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        // 2、使用bean名称并指定类型
        BookDao bookDao1 = context.getBean("bookDao",BookDao.class);
        // 3、使用bean类型获取
        BookDao bookDao2 = context.getBean(BookDao.class);
        bookDao.save();
    }
}
