package top.weiyuexin.factory;

import top.weiyuexin.dao.UserDao;
import top.weiyuexin.dao.impl.UserDaoImpl;

/**
 * @PackageName: top.weiyuexin.factory
 * @ProjectName: SSM_itheima
 * @ClassName: UserDaoFactory
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/19 12:30
 */
public class UserDaoFactory {
    /*非静态*/
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
