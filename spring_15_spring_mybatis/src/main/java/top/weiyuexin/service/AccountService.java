package top.weiyuexin.service;

import top.weiyuexin.dao.AccountDao;
import top.weiyuexin.domain.Account;

import java.util.List;

/**
 * @PackageName: top.weiyuexin.service
 * @ProjectName: SSM_itheima
 * @ClassName: AccountService
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/2 21:22
 */
public interface AccountService {

    public void save(Account account);
    public void update(Account account);
    public void delete(Integer id);
    public Account findById(Integer id);
    public List<Account> findAll();

}
