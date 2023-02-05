package top.weiyuexin.dao.impl;

import org.springframework.stereotype.Repository;
import top.weiyuexin.dao.ResourcesDao;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: ResourcesDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/5 19:19
 */
@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {
        return password.equals("root");
    }
}
