package top.weiyuexin.domain;

/**
 * @PackageName: top.weiyuexin.domain
 * @ProjectName: SSM_itheima
 * @ClassName: Account
 * @Author: Weiyuexin
 * @Email: 3022422894@qq.com
 * @Date: 2023/2/5 20:54
 */
public class Account {
    private Integer id;
    private String name;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
