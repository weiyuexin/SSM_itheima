package top.weiyuexin.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @PackageName: top.weiyuexin.config
 * @ProjectName: SSM_itheima
 * @ClassName: MybatisConfig
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/2 21:36
 */
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("top.weiyuexin.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("top.weiyuexin.dao");
        return msc;
    }
}
