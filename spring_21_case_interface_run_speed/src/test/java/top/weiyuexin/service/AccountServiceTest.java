package top.weiyuexin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.weiyuexin.config.SpringConfig;
import top.weiyuexin.domain.Account;

import java.util.List;

/**
 * @PackageName: top.weiyuexin.service
 * @ProjectName: SSM_itheima
 * @ClassName: AccountServiceTest
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/4 20:20
 */
@RunWith(SpringJUnit4ClassRunner.class) //设置测试运行类
@ContextConfiguration(classes = SpringConfig.class) //设置spring配置文件
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void testFindById(){
        Account ac = accountService.findById(1);
        System.out.println(ac);
    }

    @Test
    public void testFindAll(){
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
