package designMode.abstractFactory.serviceImpl;

import designMode.abstractFactory.service.Cpu;

public class Cpu2 implements Cpu {
    @Override
    public void run() {
        System.out.println("cpu2跑的飞起");
    }
}
