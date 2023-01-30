package top.weiyuexin.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import top.weiyuexin.dao.BookDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/30 22:05
 */
@Repository
// 定义单例或非单例
@Scope("singleton") //单例
//@Scope("prototype") //非单例
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
    @PostConstruct //初始化方法
    public void init(){
        System.out.println("init");
    }
    @PreDestroy //销毁方法
    public void destroy(){
        System.out.println("destroy");
    }
}
