package top.weiyuexin.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

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

    //@Transactional(rollbackFor = {IOException.class}) // 表示遇到IOException就回滚，IOException默认不参与回滚
    @Transactional
    public void transfer(String out,String in,Double money) ;
}
