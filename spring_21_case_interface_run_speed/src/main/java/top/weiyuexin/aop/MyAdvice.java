package top.weiyuexin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @PackageName: top.weiyuexin.aop
 * @ProjectName: SSM_itheima
 * @ClassName: MyAdvice
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/4 20:26
 */
@Component //定义成bean，交给spring管理
@Aspect  //定义为切面类，告诉spring，这个类当作aop处理
public class MyAdvice {
    //定义切点,匹配业务层所有方法
    @Pointcut("execution(* top.weiyuexin.service.*Service.*(..))")
    private void servicecPt(){}

    //环绕
    @Around("servicecPt()")
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        // 获取一次执行封装的签名信息
        Signature signature = pjp.getSignature();
        //System.out.println(signature.getDeclaringType()); //获取方法所在的类名和类型 interface top.weiyuexin.service.AccountService
        //System.out.println(signature.getName()); //获取方法名 findAll
        //System.out.println(signature.getDeclaringTypeName()); //获取方法所在类名 top.weiyuexin.service.AccountService

        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        // 记录执行前时间
        long startTime = System.currentTimeMillis();

        for (int i=0;i<10000;i++){
            pjp.proceed();
        }

        //记录运行结束的时间
        long endTime = System.currentTimeMillis();

        System.out.println("万次执行"+ className +"." + methodName + "-------> " + (endTime-startTime) + "ms");
        return null;
    }
}
