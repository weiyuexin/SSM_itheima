package top.weiyuexin.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @PackageName: top.weiyuexin.config
 * @ProjectName: SSM_itheima
 * @ClassName: ServletContainerInitConfig
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/6 20:27
 *
 * AbstractDispatcherServletInitializer 类是SpringMvc提供的快速初始化Web3.0容器的抽象类
 *                                      提供三个接口方法供用户实现
 * createServletApplicationContext() 方法，创建Servlet容器时，加载springMVC对应的bean并放入
 */

// 定义一个servlet容器启动的配置类，在里边加载spring的配置
public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {
    // 加载springmvc容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class); //加载springmvc的配置
        return ctx;
    }

    //设置那些请求归属springmvc处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};  //所有请求都归springmvc处理
    }

    //加载spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
