package top.weiyuexin.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @PackageName: top.weiyuexin.service
 * @ProjectName: SSM_itheima
 * @ClassName: AccountService
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/5 20:54
 */
@Service
public interface AccountService {
    /**
     * 转账操作
     * @param out 转出方
     * @param in 转入方
     * @param money 金额
     */

    @Transactional //开启事务管理，也可以写在类或接口上
    public void transfer(String out,String in,Double money);
}
