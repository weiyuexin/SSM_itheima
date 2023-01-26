package weiyuexin.service.impl;

import weiyuexin.dao.BookDao;
import weiyuexin.dao.UserDao;
import weiyuexin.service.BookService;

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

    /*构造器注入*/
    public BookServiceImpl(BookDao bookDao1, UserDao userDao) {
        this.bookDao = bookDao1;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }
}
