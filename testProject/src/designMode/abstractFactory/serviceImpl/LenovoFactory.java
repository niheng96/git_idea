package designMode.abstractFactory.serviceImpl;

import designMode.abstractFactory.service.ComputerFactory;
import designMode.abstractFactory.service.Cpu;
import designMode.abstractFactory.service.KeyBord;

public class LenovoFactory implements ComputerFactory {
    @Override
    public Cpu getCpu() {
        System.out.println("联想核心");
        return new Cpu2();
    }

    @Override
    public KeyBord getKeyBord() {
        return new KeyBord2();
    }
}
