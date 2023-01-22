package top.weiyuexin.dao.impl;

import top.weiyuexin.dao.BookDao;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/21 21:34
 */
public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save..."+databaseName+","+connectionNum);
    }

}
