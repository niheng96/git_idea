package otherTest.extend;

public class ChildClass extends ParentClass {

    static {
        System.out.println("ChildClass的静态语句块初始化2");
    }

    {
        System.out.println("ChildClass的语句块初始化5");
    }

    ChildClass() {
        System.out.println("ChildClass构造函数初始化6");
    }

}
