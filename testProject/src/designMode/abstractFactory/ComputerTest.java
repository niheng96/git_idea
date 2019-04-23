package designMode.abstractFactory;

import designMode.abstractFactory.service.ComputerFactory;
import designMode.abstractFactory.service.Cpu;
import designMode.abstractFactory.service.KeyBord;
import designMode.abstractFactory.serviceImpl.DellFactory;
import designMode.abstractFactory.serviceImpl.LenovoFactory;

public class ComputerTest {
    public static void main(String[] args) {
        ComputerFactory factory = new LenovoFactory();
//        ComputerFactory factory = new DellFactory();
        Cpu cpu = factory.getCpu();
        cpu.run();
        KeyBord keyBord = factory.getKeyBord();
        keyBord.click();
    }
}
