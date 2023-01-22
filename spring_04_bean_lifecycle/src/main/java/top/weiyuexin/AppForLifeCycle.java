package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AppForLifeCycle
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/21 21:36
 */
public class AppForLifeCycle {
    public static void main(String[] args) {
        //使用ClassPathXmlApplicationContext才有close方法，使用其父类ApplicationContext没有close方法
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 注销/关闭容器的两种方法
        //2、注册关闭钩子，意味着在关闭虚拟机之前要把容器关掉
        context.registerShutdownHook();
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        //context.close(); //1、关闭容器，比较暴力
    }
}
