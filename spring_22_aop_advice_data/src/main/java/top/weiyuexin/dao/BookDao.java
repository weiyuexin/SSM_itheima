package top.weiyuexin.dao;

import org.springframework.stereotype.Repository;

/**
 * @PackageName: top.weiyuexin.dao
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoi
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/4 21:39
 */
@Repository
public interface BookDao {
    public String findName(int id,String password);
}
