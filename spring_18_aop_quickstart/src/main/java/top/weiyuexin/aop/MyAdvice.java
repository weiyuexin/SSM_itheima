package top.weiyuexin.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @PackageName: top.weiyuexin.aop
 * @ProjectName: SSM_itheima
 * @ClassName: MyAdvice
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/3 12:02
 */

@Component //把这个类定义成bean，交给spring管理
@Aspect //告诉spring，这个类当作aop处理
public class MyAdvice {
    //定义切入点
    @Pointcut("execution(void top.weiyuexin.dao.BookDao.update())")
    private void pt(){}

    @Pointcut("execution(void top.weiyuexin.dao.BookDao.delete())")
    private void pt1(){}

    @Before("pt()") //绑定共性功能和切入点
    public void method(){ //定义共性功能
        System.out.println(System.currentTimeMillis());
    }
}
