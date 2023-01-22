package top.weiyuexin.service.impl;

import top.weiyuexin.dao.BookDao;
import top.weiyuexin.dao.UserDao;
import top.weiyuexin.dao.impl.BookDaoImpl;
import top.weiyuexin.service.BookService;

/**
 * @PackageName: top.weiyuexin.service.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookServiceImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/21 21:35
 */
public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;


    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set...");
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
