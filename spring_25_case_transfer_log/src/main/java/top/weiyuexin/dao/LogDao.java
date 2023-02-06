package top.weiyuexin.dao;

import org.apache.ibatis.annotations.Insert;

/**
 * @PackageName: top.weiyuexin.dao
 * @ProjectName: SSM_itheima
 * @ClassName: LogDao
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/6 19:27
 */
public interface LogDao {
    @Insert("insert into tbl_log(info,createDate) values(#{info},now())")
    void log(String info);
}
