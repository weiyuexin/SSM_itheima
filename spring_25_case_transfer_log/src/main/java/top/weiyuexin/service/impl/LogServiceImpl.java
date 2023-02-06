package top.weiyuexin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.weiyuexin.dao.LogDao;
import top.weiyuexin.service.LogService;

/**
 * @PackageName: top.weiyuexin.service.impl
 * @ProjectName: SSM_itheima
 * @ClassName: LogServiceImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/6 19:30
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;
    @Override
    public void log(String out, String in, Double money) {
        logDao.log("转账操作由"+out+"到"+in+",金额："+money);
    }
}
