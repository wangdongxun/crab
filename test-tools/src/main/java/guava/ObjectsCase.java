package guava;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

/**
 * Created by wdx on 2016/11/11.
 */
public class ObjectsCase {
    public static void main(String[] args) {
        //guava Objects 对象是否相等
        System.out.println(Objects.equal("sdf", null));
        //jdk Objects 对象是否相等
        System.out.println(java.util.Objects.equals("sdf", null));

        //生成 MyObject{x=1} 对象

        System.out.println(Objects.toStringHelper("MyObject").add("x", 1).toString());

        Person p = new Person();
        p.setAge(3);
        p.setName("wdx");
        Person p2 = new Person();
        p2.setAge(4);
        p2.setName("wdx");
        //编辑两个对象年龄是否相等，感觉用处不大
        System.out.println(ComparisonChain.start().compare(p2.getAge(), p.getAge()).result());
    }

    static class Person{
        String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        int age;
    }
}
