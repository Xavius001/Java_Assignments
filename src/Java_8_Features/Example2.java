package Java_8_Features;

interface ISample8 {
    void Sum(int[] a);
    void Average(int[] a);
}

public class Example2 {
    public static void main(String[] args) {
        //anonymous type
        ISample8 I = new ISample8() {
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
        };
        int[] a = {1, 10, 100, 1000};
        I.Sum(a);
        I.Average(a);
    }
}
