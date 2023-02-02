package top.weiyuexin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.weiyuexin.config.SpringConfig;

/**
 * @PackageName: top.weiyuexin.service
 * @ProjectName: SSM_itheima
 * @ClassName: AccountServiceTest
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/2 22:21
 */
//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring配置类
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void test(){
        System.out.println(accountService.findAll());
    }
}
