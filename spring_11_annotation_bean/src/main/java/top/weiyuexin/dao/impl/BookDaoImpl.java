package top.weiyuexin.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/30 21:32
 */
//@Component配置bean

/**
 * @Component的衍生注解：
 * @Controller：用于定义表现层bean
 * @Service：用于定义业务层bean
 * @Repository：用于定义数据层bean
 * 功能一样，只是为了方便理解
 */
//@Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
