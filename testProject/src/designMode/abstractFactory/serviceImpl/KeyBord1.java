package designMode.abstractFactory.serviceImpl;

import designMode.abstractFactory.service.KeyBord;

public class KeyBord1 implements KeyBord {
    @Override
    public void click() {
        System.out.println("1号键盘手感一般");
    }
}
