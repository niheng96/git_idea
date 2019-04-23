/*
package designMode.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PetFactory implements InvocationHandler {

    private Object target;//注册被代理的对象

    public void setTarget(Object target) {
        this.target = target;
    }

    */
/**
     * 代理类增强方法
     * @param proxy 被代理的类
     * @param method 被增强的方法
     * @param args 传递参数
     * @return 被代理的类
     * @throws Throwable 抛异常
     *//*

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //如果被代理的类中实现了Pet接口，且传递的是需要增强的方法
        if(proxy instanceof Pet && "say".equals(method.getName())){
            Object result;
            System.out.println("增强我们的方法");
            result = method.invoke(target,args);//target类自己的方法
            System.out.println("再次增强我们的方法");
            return result;
        }
        //不是我们要增强的方法，那么原样返回
        return method.invoke(target,args);
    }
}
*/
