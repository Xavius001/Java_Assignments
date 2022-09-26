package Java_8_Features;

@FunctionalInterface //Annotation
interface ITest1 {
    int Method1(int a);

}

public class Example4 {
    public static void main(String[] args) {
        ITest1 I = (a) -> {
            int sum = 0;
            for(int i = 0; i<= a; i++) {
                sum += i;
            }
            System.out.println("The sum is " + sum);
            return sum;
        };
    }
}
