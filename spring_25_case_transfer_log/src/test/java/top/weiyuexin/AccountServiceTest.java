package top.weiyuexin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.weiyuexin.config.SpringConfig;
import top.weiyuexin.service.AccountService;

import java.io.IOException;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AccountServiceTest
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/6 19:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void test() throws IOException {
        accountService.transfer("Tom","Jerry",50D);
    }

}
