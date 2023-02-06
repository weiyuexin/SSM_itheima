package top.weiyuexin.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @PackageName: top.weiyuexin.service
 * @ProjectName: SSM_itheima
 * @ClassName: LogService
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/6 19:29
 */
public interface LogService {
    @Transactional(propagation = Propagation.REQUIRES_NEW) //设置事务的传播行为，表示创建一个新事务，
    public void log(String out,String in,Double money);
}
