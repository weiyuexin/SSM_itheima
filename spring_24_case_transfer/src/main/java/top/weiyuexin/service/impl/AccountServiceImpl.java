package top.weiyuexin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.weiyuexin.dao.AccountDao;
import top.weiyuexin.service.AccountService;

/**
 * @PackageName: top.weiyuexin.service.impl
 * @ProjectName: SSM_itheima
 * @ClassName: AccountServiceImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/5 20:59
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);
        int i = 1/0;
        accountDao.inMoney(in,money);
    }
}
