package designMode.observerMode.demo1;

public class Doctor implements Observer,Subject {
    private String name;

    public Doctor(String name){
        super();
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void update(String string) {
        System.out.println(name+"观察到变化:"+string);
//        System.out.println(this.getName()+"观察到变化:"+string);
    }
}
