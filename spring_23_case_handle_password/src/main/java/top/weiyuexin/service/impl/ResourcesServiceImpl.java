package top.weiyuexin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.weiyuexin.dao.ResourcesDao;
import top.weiyuexin.service.ResourcesService;

/**
 * @PackageName: top.weiyuexin.service.impl
 * @ProjectName: SSM_itheima
 * @ClassName: ResourcesServiceImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/5 19:17
 */
@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private ResourcesDao resourcesDao;
    @Override
    public boolean openURL(String url, String password) {
        //System.out.println(password.length());
        return resourcesDao.readResources(url,password);
    }
}
