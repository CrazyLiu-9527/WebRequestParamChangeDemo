package per.lzy.demo.param.model;

/**
 * @author liuzhiyuan
 * @date 2021/1/15 18:15
 */
public class TestEntity {

    private String name;

    private String nickName;

    private int age;

    public TestEntity(String name, String nickName, int age) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
