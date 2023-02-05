package top.weiyuexin.aop;

/**
 * @PackageName: top.weiyuexin.aop
 * @ProjectName: SSM_itheima
 * @ClassName: DataAdvice
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/5 20:25
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution(boolean top.weiyuexin.service.*Service.*(..))")
    private void servicePt(){}

    @Around("servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {

        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            // 判断参数是不是字符串
            if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }

        Object ret = pjp.proceed(args); //将修改完的参数返回调用原来方法中

        return ret;
    }
}
