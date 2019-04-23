package otherTest.extend;

public class ParentClass {

    static {
        System.out.println("parentClass的静态语句块初始化1");
    }

    {
        System.out.println("parentClass的语句块初始化3");
    }

    ParentClass() {
        System.out.println("parentClass构造函数初始化4");
    }

}
