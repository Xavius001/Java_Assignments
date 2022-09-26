package Java_8_Features;

interface ISample {
    void Sum(int[] a);
    void Average(int[] a);
}

class Sample implements ISample {

    @Override
    public void Sum(int[] a) {
        int tot = 0;
        for(int i : a) {
            tot += i;
        }
        System.out.println("The total is " + tot);
    }

    @Override
    public void Average(int[] a) {
        int tot = 0;
        for(int i : a) {
            tot += i;
        }
        double avg = tot / a.length;
        System.out.println("The average is " + avg  );
    }
}

public class Example1 {
    public static void main(String[] args) {
        ISample i = new Sample();
        int[] a = {1, 10, 100, 1000, 10000};
        i.Sum(a);
        i.Average(a);
    }
}