package Java_8_Features;

@FunctionalInterface //Annotation
interface ITest2 {
    void Method1();
    default void Method2() {
        System.out.println("Method 2");
    }
    static void Method3() {
        System.out.println("Method 3");
    }
}

class Test2 implements ITest2 {

    @Override
    public void Method1() {
        System.out.println("Method 1");
    }

    @Override
    public void Method2() {
        System.out.println("Method 2 in Test2");
    }
}

public class Example6 {
    public static void main(String[] args) {
        Test2 T = new Test2();
        T.Method1();
        T.Method2();
        ITest2.Method3();
    }
}
