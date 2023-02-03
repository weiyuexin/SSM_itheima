package top.weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.weiyuexin.config.SpringConfig;
import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: App
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/3 11:53
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        bookDao.update();
        System.out.println(bookDao);//top.weiyuexin.dao.impl.BookDaoImpl@58e1d9d
        System.out.println(bookDao.getClass()); //用的是代理的对象  class jdk.proxy2.$Proxy20

        // TODO Aop工作流程
        /**
         1. Spring容器启动
         2.读取所有切面配置中的切入点
         3.初始化bean ,判定bean对应的类中的方法是否匹配到任意切入点
             ●匹配失败 ,创建对象
             ●匹配成功 ,创建原始对象 (目标对象 )的代理对象
         4.获取bean执行方法
             ●获取bean ,调用方法并执行,完成操作
             ●获取的bean是代理对象时 ,根据代理对象的运行模式运行原始方法与增强的内容, 完成操作
         */

        // TODO Aop核心概念
        /**
         ●目标对象( Target ) :原始功能去掉共性功能对应的类产生的对象,这种对象是无法直接完成最终工作的
         ●代理(Proxy ) :目标对象无法直接完成工作,需要对其进行功能回填,通过原始对象的代理对象实现
         */
    }
}
