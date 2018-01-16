package guava;

import com.google.common.base.Optional;

import java.util.HashMap;
import java.util.Map;

import static java.util.Optional.ofNullable;

/**
 * Created by wdx on 2016/11/10.
 */
public class OptionalCase {
    public static void main(String[] args) {
        Map<String,Boolean> m=new HashMap<>();
        m.put("one",true);
        m.put("two",false);

        //jdk 1.8  实现
        System.out.println(ofNullable(m.get("one")).isPresent());
        System.out.println(ofNullable(m.get("three")).isPresent());
        //google guava 实现
        System.out.println(Optional.fromNullable(m.get("one")).isPresent());
        System.out.println(Optional.fromNullable(m.get("three")).isPresent());
    }
}
