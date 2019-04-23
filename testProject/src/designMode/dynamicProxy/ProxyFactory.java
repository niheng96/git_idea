package designMode.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class  ProxyFactory implements InvocationHandler {

    private Object target;//注册被代理的对象

    void setTarget(Object target) {
        this.target = target;
    }

    //本代理类调用方法时自动执行invoke方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        if(proxy instanceof Pet){
            if("say".equals(method.getName())){
                System.out.println("say前");
                result = method.invoke(target,args);
                System.out.println("say后");
                return result;
            }
        }
        return method.invoke(target,args);
    }

    Object createProxy(){
        Class[] interfaces = target.getClass().getInterfaces();
        if(interfaces.length==0){
            System.out.println("这个类没有接口啊~");
            throw new RuntimeException("没有接口，不能使用jdk动态代理");
        }

        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        //this指的就是实现了InvocationHandler接口的实现类
        return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), interfaces, this);
    }

}
