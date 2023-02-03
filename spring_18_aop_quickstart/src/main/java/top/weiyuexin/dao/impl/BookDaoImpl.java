package top.weiyuexin.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/3 11:55
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        //输出当前系统时间
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save...");
    }

    @Override
    public void update() {
        System.out.println("book dao update...");
    }

    @Override
    public void delete() {
        System.out.println("book dao delete...");
    }
}
