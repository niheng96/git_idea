package designMode.abstractFactory.serviceImpl;

import designMode.abstractFactory.service.KeyBord;

public class KeyBord2 implements KeyBord {
    @Override
    public void click() {
        System.out.println("2号键盘手感贼棒");
    }
}
