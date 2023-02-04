package top.weiyuexin.dao.impl;

import org.springframework.stereotype.Service;
import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/4 21:39
 */
@Service
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id,String password) {
        System.out.println("id:"+id);
        if (true) new NullPointerException();
        return "weiyuexin";
    }
}
