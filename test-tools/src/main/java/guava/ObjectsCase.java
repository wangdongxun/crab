package guava;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

/**
 * Created by wdx on 2016/11/11.
 */
public class ObjectsCase {
    public static void main(String[] args) {
        System.out.println(Objects.equal("sdf",null));

        System.out.println(java.util.Objects.equals("sdf",null));

        System.out.println(Objects.toStringHelper("MyObject").add("x", 1).toString());

        Person p=new Person();
        p.setAge(1);
        p.setName("wdx");
        Person p2=new Person();
        p2.setAge(1);
        p2.setName("wdx");

        System.out.println(ComparisonChain.start()
                .compare("a", "A")
                .result());
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
