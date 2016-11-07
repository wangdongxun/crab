package nutz;

import org.nutz.el.El;
import org.nutz.lang.Lang;
import org.nutz.lang.util.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wdx on 2016/11/2.
 */
public class ELTest {
    public static void main(String[] args) {

        String rule01="0<=a&&a<131";
        String rule02="131<=a&&a<1521";
        String rule03="1521<=a&&a<8000";
        String rule04="a>=8000";
        List<String> list=new ArrayList();
        list.add(rule01);
        list.add(rule02);
        list.add(rule03);
        list.add(rule04);

        Context context = Lang.context();
        context.set("a", 140L);

        for (String s:list){
            if((boolean) El.eval(context, s)){
                System.out.println(s);
            }
        }

    }
}
