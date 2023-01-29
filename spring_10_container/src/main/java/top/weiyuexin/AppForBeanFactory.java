package top.weiyuexin;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AppForBeanFactory
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/29 22:14
 */
public class AppForBeanFactory {
    public static void main(String[] args) {
        // BeanFactory加载bean是延迟加载的，加载配置文件时不加载bean
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(resource);
        BookDao bookDao = bf.getBean(BookDao.class);
        bookDao.save();
    }
}
