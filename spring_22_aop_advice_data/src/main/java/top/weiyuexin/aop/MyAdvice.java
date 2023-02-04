package top.weiyuexin.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @PackageName: top.weiyuexin.aop
 * @ProjectName: SSM_itheima
 * @ClassName: MyAdvice
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/4 21:38
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* top.weiyuexin.dao.impl.BookDaoImpl.findName(..))")
    private void pt(){}

    // 获取数据
   // @Before("pt()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice");
    }

    //@After("pt()")
    public void after(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp)  {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666; //修改参数

        Object proceed = null;
        try {
            proceed = pjp.proceed(args);
        } catch (Throwable e) { //获取异常数据
            throw new RuntimeException(e);
        }
        return proceed;
    }

    // 获取返回值
    @AfterReturning(value = "pt()",returning = "ret") //设置返回值放到ret变量中
    public void afterReturning(JoinPoint jp,Object ret){//参数有JoinPoint时，必须放到第一位
        System.out.println("afterRetuening..."+ret);
    }

    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("afterThrowing..."+t);
    }
}
