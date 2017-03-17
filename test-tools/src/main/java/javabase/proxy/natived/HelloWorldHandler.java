package javabase.proxy.natived;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wdx on 2017/3/17.
 */
public class HelloWorldHandler implements InvocationHandler {

    //要代理的原始对象
    private Object obj;

    public HelloWorldHandler(Object obj) {
        super();
        this.obj = obj;
    }

    public HelloWorldHandler() {

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        //调用之前
        doBefore();

        //调用原始对象的方法
        result=method.invoke(obj, args);

        //调用之后
        doAfter();
        return result;
//        return null;
    }

    private void doBefore() {
        System.out.println("before method invoke");
    }

    private void doAfter() {
        System.out.println("after method invoke");
    }
}
