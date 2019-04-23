package designMode.observerMode.demo2;


import java.util.Observable;
import java.util.Observer;

public class Doctor implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o.getClass().getSimpleName() + "====获得update====" + arg);
    }
}
