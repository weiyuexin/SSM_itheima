package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.weiyuexin.dao.OrderDao;
import top.weiyuexin.factory.OrderDaoFactory;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AppForInstanceOrder
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/19 12:21
 */
public class AppForInstanceOrder {
    public static void main(String[] args) {
        // 通过静态工厂创建对象
       /* OrderDao orderDao = OrderDaoFactory.getOrderDao();
        orderDao.save();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.save();
    }
}
