package top.weiyuexin.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.weiyuexin.domain.Account;

import java.util.List;

/**
 * @PackageName: top.weiyuexin.dao
 * @ProjectName: SSM_itheima
 * @ClassName: AccountDao
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/2 21:23
 */
public interface AccountDao {
    @Insert("insert into tbl_account(name,money) values(#{name},#{money})")
    void save(Account account);

    @Delete("delete from tbl_account where id = #{id}")
    void delete(Integer id);

    @Update("update tbl_account set name = #{name}, money = #{money} where id = #{id}")
    void update(Account account);

    @Select("select * from tbl_account")
    List<Account> findAll();

    @Select("select * from tbl_account where id = #{id}")
    Account findById(Integer id);
}
