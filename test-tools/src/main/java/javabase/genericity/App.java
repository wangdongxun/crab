package javabase.genericity;

/**
 * Created by wdx on 2017/3/17.
 */
public class App {
    public static void main(String[] args) {
        Generator generatorF=new FruitGenerator();
        Generator generatorV=new VegetableGenerator();
        System.out.println("水果随机："+generatorF.next());
        System.out.println("蔬菜随机："+generatorV.next());
    }
}
