package top.weiyuexin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    @Pointcut("execution(void top.weiyuexin.dao.BookDao.update())")
    public void pt(){}
    @Pointcut("execution(int top.weiyuexin.dao.BookDao.select())")
    public void pt2(){}

    //@Before("pt()")
    public void before(){
        System.out.println("before advice...");
    }

    //@After("pt()")
    public void after(){
        System.out.println("after advice ...");
    }
    // 环绕：前后都有
    /**
     ●@Around注意事项
     1.环绕通知必须依赖形 参ProceedingJoinPoint才能实现对原始方法的调用, 进而实现原始方法调用前后同时添加通知
     2.通知中如果未使用ProceedingJoinPoint对原始方法进行调用将跳过原始方法的执行
     3.对原始方法的调用可以不接收返回值 , 通知方法设置成void即可,如果接收返回值,必须设定为Object类型
     4.原始方法的返回值如果 是void类型,通知方法的返回值类型可以设置成void ,也可以设置成Object
     5.由于无法预知原始方法运行后是否会抛出异常 ,因此环绕通知方法必须抛出Throwable对象
     */
    //@Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice... ");
        // 表示对原始操作的调用 方法形参使用ProceedingJoinPoint，调用proceed()方法，需要抛出异常
        Object ret = pjp.proceed();
        System.out.println("around after advice...");
        return ret;
    }
    //@Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice... ");
        // 表示对原始操作的调用 方法形参使用ProceedingJoinPoint，调用proceed()方法，需要抛出异常
        Object ret = pjp.proceed(); //调用原始方法，接收原始方法的返回值
        System.out.println("around after advice...");
        return ret;  //原始方法有返回值时，使用@Around环绕通知，需要在最后面返回原来类型的返回值
    }
    // 和After的区别：afterafterReturning只有在原始方法正常运行完后才能调用
    //@AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }
    //抛出异常后运行
    @AfterThrowing("pt2()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice...");
    }

}
