package top.weiyuexin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import top.weiyuexin.dao.BookDao;
import top.weiyuexin.service.BookService;

/**
 * @PackageName: top.weiyuexin.service.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookServiceImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/31 22:02
 */
@Service
public class BookServiceImpl implements BookService {
    /**
     * @Autowired 自动装配，写不写setter方法均可
     */
    @Autowired
    @Qualifier("bookDao")  //指定bean名称
    private BookDao bookDao;

   /* public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }*/

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
