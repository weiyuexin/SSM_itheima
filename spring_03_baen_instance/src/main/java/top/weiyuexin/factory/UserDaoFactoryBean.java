package top.weiyuexin.factory;

import org.springframework.beans.factory.FactoryBean;
import top.weiyuexin.dao.UserDao;
import top.weiyuexin.dao.impl.UserDaoImpl;

/**
 * @PackageName: top.weiyuexin.factory
 * @ProjectName: SSM_itheima
 * @ClassName: UserDaoFactoryBean
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/19 12:41
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    /*得到bean实例
    * */
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    /*
    * 得到bean的类型
    * */
    @Override
    public Class<?> getObjectType() {
        //返回UserDao的字节码
        return UserDao.class;
    }

    /*
    * 是否是单例模式运行
    * true：单例
    * false：非单例
    * 通常都是使用单例，所以通常默认不写
    * */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
