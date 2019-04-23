package designMode.dynamicProxy;

import java.util.ArrayList;
import java.util.List;

public abstract class ProxyTemplate extends ProxyFactory {
    private List<Object> list = new ArrayList<>();

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

}
