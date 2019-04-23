package designMode.observerMode.demo1;

public class Test {
    public static void main(String[] args) {
        Observable cell = new Cell();
        Doctor doctor1 = new Doctor("doc1");
        Doctor doctor2 = new Doctor("doc2");
        Doctor doctor3 = new Doctor("doc3");
//        doctor1.setName("doctor1");
//        doctor2.setName("doctor2");
//        doctor3.setName("doctor3");
        cell.addObserver(doctor1);
        cell.addObserver(doctor2);
        cell.addObserver(doctor3);
        cell.notifyObserver("细胞分裂了");
        cell.removeObserver(doctor3);
        cell.notifyObserver("细胞死亡");
    }
}
