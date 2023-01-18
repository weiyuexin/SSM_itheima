package top.weiyuexin.service.impl;

import top.weiyuexin.dao.BookDao;
import top.weiyuexin.service.BookService;

/**
 * @PackageName: top.weiyuexin.service.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookServiceImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/17 21:50
 */
public class BookServiceImpl implements BookService {
    //private BookDao bookDao = new BookDaoImpl();

    // 5、删除业务层中使用new创建的dao对象
    private BookDao bookDao;


    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }



    // 6、提供对应的set方法，set方法由IoC容器调用，设置依赖属性
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
