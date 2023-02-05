package top.weiyuexin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.weiyuexin.config.SpringConfig;
import top.weiyuexin.dao.AccountDao;

import javax.annotation.security.RunAs;

/**
 * @PackageName: top.weiyuexin.service
 * @ProjectName: SSM_itheima
 * @ClassName: AccountServiceTest
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/5 21:02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void testTransfer(){
        accountService.transfer("Tom","Jerry",100D);
    }
}
