package javabase.genericity;

import java.util.Random;

/**
 * Created by wdx on 2017/3/17.
 */
public class VegetableGenerator implements Generator<Integer>{

    private Integer[] vegetableCode = new Integer[]{2, 1, 3};

    @Override
    public Integer next() {
        Random rand = new Random();
        return vegetableCode[rand.nextInt(3)];
    }
}
