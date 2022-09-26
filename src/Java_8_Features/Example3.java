package Java_8_Features;

@FunctionalInterface //Annotation
interface ITest {
    int Method1(int a);

}

public class Example3 {
    public static void main(String[] args) {
        ITest I = (a) -> {
            int sum = 0;
            for(int i = 0; i<= a; i++) {
                sum += i;
            }
            System.out.println("The sum is " + sum);
            return sum;
        };
    }
}


/*
public class Example3 {
    ITest I = new ITest() {
        @Override
        public void Method1(int a) {
            int sum = 0;
            for(int i = 1; i<=a; i++) {
             sum += i;
            }
            System.out.println("The sum is "+sum);
        }
    };
}

 */
