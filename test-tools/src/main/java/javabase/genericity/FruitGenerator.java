package javabase.genericity;

import java.util.Random;

/**
 * Created by wdx on 2017/3/17.
 */
public class FruitGenerator implements Generator<String>{

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}
