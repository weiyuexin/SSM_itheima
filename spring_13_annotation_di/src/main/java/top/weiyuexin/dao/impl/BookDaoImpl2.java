package top.weiyuexin.dao.impl;

import org.springframework.stereotype.Repository;
import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/31 22:00
 */
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ....2");
    }
}
