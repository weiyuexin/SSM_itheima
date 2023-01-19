package top.weiyuexin.factory;

import top.weiyuexin.dao.OrderDao;
import top.weiyuexin.dao.impl.OrderDaoImpl;

/**
 * @PackageName: top.weiyuexin.factory
 * @ProjectName: SSM_itheima
 * @ClassName: OrderDaoFactory
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/19 12:20
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("factory setup...");
        return new OrderDaoImpl();
    }
}
