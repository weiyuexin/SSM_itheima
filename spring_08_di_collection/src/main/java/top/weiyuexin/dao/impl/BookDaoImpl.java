package top.weiyuexin.dao.impl;

import top.weiyuexin.dao.BookDao;

import java.util.*;

/**
 * @PackageName: top.weiyuexin.dao.impl
 * @ProjectName: SSM_itheima
 * @ClassName: BookDaoImpl
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/1/28 21:25
 */
public class BookDaoImpl implements BookDao {
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("bookDao save ...");
        System.out.println("遍历数组:"+ Arrays.toString(array));
        System.out.println("遍历List:" + list);
        System.out.println("遍历Ste:"+set);
        System.out.println("遍历Map:"+map);
        System.out.println("遍历Properties:"+properties);
    }
}
