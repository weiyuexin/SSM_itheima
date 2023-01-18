package top.weiyuexin.dao.impl;

import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/18 22:29
 */
public class BookDaoImpl implements BookDao {
    /*
    * 实例化bean的三种方法——构造方法（常用）
    * spring创建bean调用的是无参的构造方法（可以不写）
    * 方法可以是public的也可以是private的（原始的只有是public时才能访问）
    * */
    private BookDaoImpl() {
        System.out.println("bookDao 构造方法");
    }

    @Override
    public void save() {
        System.out.println("bookDao save...");
    }
}
