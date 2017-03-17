package guava;

import com.google.common.base.Optional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wdx on 2016/11/10.
 */
public class OptionalCase {
    public static void main(String[] args) {
        Map<String,Boolean> m=new HashMap<>();
        m.put("one",true);
        m.put("two",false);

        Boolean aBoolean=Optional.of(m.get("three")).orNull();
        System.out.println(aBoolean);
    }
}
