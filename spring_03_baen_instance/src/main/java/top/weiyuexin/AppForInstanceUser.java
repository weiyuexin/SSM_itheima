package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.weiyuexin.dao.UserDao;
import top.weiyuexin.factory.UserDaoFactory;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AppForInstanceUser
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/19 12:31
 */
public class AppForInstanceUser {
    public static void main(String[] args) {
        //创建实例工厂对象
       // UserDaoFactory userDaoFactory = new UserDaoFactory();
        //通过实例工厂对象创建对象
       // UserDao userDao = userDaoFactory.getUserDao();
       // userDao.save();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDao");
        UserDao userDao2 = (UserDao) context.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
//        userDao.save();
    }
}
