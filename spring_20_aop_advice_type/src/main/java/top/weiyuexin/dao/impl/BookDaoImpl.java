package top.weiyuexin.dao.impl;

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
    public void update() {
        System.out.println("book dao update is running...");
    }

    @Override
    public int select() {
        System.out.println("book dao select is running...");
        int i = 1/0;
        return 100;
    }

}
