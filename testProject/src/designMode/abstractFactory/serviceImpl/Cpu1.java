package designMode.abstractFactory.serviceImpl;

import designMode.abstractFactory.service.Cpu;

public class Cpu1 implements Cpu {
    @Override
    public void run() {
        System.out.println("cpu1跑起来了");
    }
}
