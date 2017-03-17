package javabase.proxy.natived;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wdx on 2017/3/17.
 */
public class App {
    public static void main(String[] args) {
        HelloWorld helloWorld=new HelloWorldImpl();
        InvocationHandler handler=new HelloWorldHandler(helloWorld);

        //创建动态代理对象
        HelloWorld proxy=(HelloWorld) Proxy.newProxyInstance(
                helloWorld.getClass().getClassLoader(),
                helloWorld.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("this handler invoke method");
                        return null;
                    }
                });

        proxy.sayHelloWorld();
    }
}
