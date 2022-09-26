package Java_8_Features;

interface Shape {
    double Area();
    double Perimeter();
    default double Volume() {
        return 100;
    }
}


class Rectangle implements Shape
{

    @Override
    public double Area() {
        System.out.println("area");
        return 100;
    }

    @Override
    public double Perimeter() {
        return 120;
    }


}

class Circle implements Shape
{
    @Override
    public double Area() {
        System.out.println("area");
        return 100;
    }

    @Override
    public double Perimeter() {
        return 120;
    }

    @Override
    public double Volume() {
        return 0;
    }
}

public class Example5 {
    public static void main(String[] args) {
        Shape S = new Rectangle();
        System.out.println(S.Area());
        System.out.println(S.Perimeter());
        System.out.println(S.Volume());
    }
}
