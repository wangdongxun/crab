package guava;

import com.google.common.base.Function;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by wdx on 2016/11/2.
 */
public class GroupBy {

   static class Fruit {
        String fruitName;
        String fruitType;
        Integer FruitPrice;

        public String getFruitName() {
            return fruitName;
        }

        public void setFruitName(String fruitName) {
            this.fruitName = fruitName;
        }

        public Integer getFruitPrice() {
            return FruitPrice;
        }

        public void setFruitPrice(Integer fruitPrice) {
            FruitPrice = fruitPrice;
        }

        public String getFruitType() {
            return fruitType;
        }

        public void setFruitType(String fruitType) {
            this.fruitType = fruitType;
        }

        @Override
        public String toString() {
            return "Fruit{" +
                    "fruitName='" + fruitName + '\'' +
                    ", fruitType='" + fruitType + '\'' +
                    ", FruitPrice=" + FruitPrice +
                    '}';
        }

    }

    static List<Fruit> fruitsList=new ArrayList<>();

    public GroupBy() {
        {
            Fruit b = new Fruit();
            b.setFruitName("apple");
            b.setFruitType("1");
            b.setFruitPrice(300);
            fruitsList.add(b);
        }
        {
            Fruit b = new Fruit();
            b.setFruitName("orange");
            b.setFruitType("2");
            b.setFruitPrice(350);
            fruitsList.add(b);
        }
        {
            Fruit b = new Fruit();
            b.setFruitName("pear");
            b.setFruitType("1");
            b.setFruitPrice(500);
            fruitsList.add(b);
        }

        {
            Fruit b = new Fruit();
            b.setFruitName("banana");
            b.setFruitType("2");
            b.setFruitPrice(600);
            fruitsList.add(b);
        }
        {
            Fruit b = new Fruit();
            b.setFruitName("lemon");
            b.setFruitType("2");
            b.setFruitPrice(380);
            fruitsList.add(b);
        }
    }

    public static void main(String[] args) {

        GroupBy groupBy=new GroupBy();

        Multimap<String, Fruit> userBookMultimap2= Multimaps.index(fruitsList, new Function<Fruit, String>() {
            public String apply(Fruit fruit) {
                return fruit.getFruitType();
            }
        });
        Map<String, Collection<Fruit>> userBookMap2 = userBookMultimap2.asMap();

        for (Map.Entry<String, Collection<Fruit>> entry2 : userBookMap2.entrySet()) {
            System.out.println(entry2.getKey());
            System.out.println(entry2.getValue().toString());
        }
    }
}
