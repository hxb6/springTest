package test;

/**
 * @Package: test
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/15 10:06
 * @Description:
 **/
public class HelloTest {
    private String name;

    private String like;

    private Integer age;

    public HelloTest() {
    }

    public HelloTest(String name, String like, Integer age) {
        this.name = name;
        this.like = like;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("hello");
    }

    public void sayAnnotationHello(){
        System.out.println("Annotation hello");
        innerMethod();
    }

    public void innerMethod(){
        System.out.println("内部的方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "HelloTest{" +
                "name='" + name + '\'' +
                ", like='" + like + '\'' +
                ", age=" + age +
                '}';
    }
}
