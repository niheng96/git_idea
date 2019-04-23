package designMode.observerMode.demo2;

import java.util.Observable;

public class Mouse extends Observable {

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

}
