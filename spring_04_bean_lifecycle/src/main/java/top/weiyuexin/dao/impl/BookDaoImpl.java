package top.weiyuexin.dao.impl;

import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/21 21:34
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
    //初始化方法
    public void init(){
        System.out.println("init...");
    }
    //销毁，要想销毁方法执行，必须在使用完容器后手动关闭
    public void destory(){
        System.out.println("destory...");
    }
}
