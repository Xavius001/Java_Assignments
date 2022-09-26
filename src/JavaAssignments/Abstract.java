// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bark bark");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Quadrilateral q = new Quadrilateral();
        System.out.println(q.area());
        System.out.println(q.perimeter());
    }
}

abstract class Shape {
    protected int length = 100;
    protected int width = 200;
    public abstract int area();
    public abstract int perimeter();
}

class Quadrilateral extends Shape {
    public int area(){
        return length*width;
    }
    public int perimeter() {
        return (length+width)*2;
    }
}