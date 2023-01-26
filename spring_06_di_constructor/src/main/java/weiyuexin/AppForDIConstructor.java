package weiyuexin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import weiyuexin.service.BookService;

/**
 * @PackageName: weiyuexin
 * @ProjectName: SSM_itheima
 * @ClassName: AppForDIConstructor
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/26 20:39
 */
public class AppForDIConstructor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
    /*
    依赖注入方式选择
    1.强制依赖使用构造器进行,使用setter注入有概率不进行注入导致nu11对象出现
    2.可选依赖使用setter注入进行 ,灵活性强
    3. Spring框架倡导使用构造器,第三方框架内部大多数采用构造器注入的形式进行数据初始化,相对严谨
    4.如果有必要可以两者同时使用,使用构造器注入完成强制依赖的注入,使用setter注入完成可选依赖的注入
    5. 实际开发过程中还要根据实际情况分析,如果受控对象没有提供setter方法就必须使用构造器注入
    6.自己开发的模块推荐使用setter注入

    * */
}
