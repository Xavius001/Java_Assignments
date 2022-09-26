class Parent {
    private int a,b;
    public Parent() {
        a=1;
        b=1;
        System.out.println("Default in Parent");
    }
    public Parent(int i) {
        a=i;
        b=i;
    }
    public Parent(int i, int j) {
        a=i;
        b=j;
    }
    public void Print() {
        System.out.println("a is "+a+"\nb is "+b);
    }
    public void Yeet() {
        System.out.println("yeet");
    }
}

class Child extends Parent {
    private int c, d;
    public Child() {
        c=1;
        d=1;
        System.out.println("Default in Child");
    }
    public Child(int i, int j, int k, int l) {
        super(i, j);
        c=k;
        d=l;
    }
    public void Print() {
        super.Print();
        System.out.println("c is "+c+"\nd is "+d);
    }
}

class Grandchild extends Child {
    int e, f;
    public Grandchild() {
        e=1;
        f=1;
        System.out.println("Default in Grandchild");
    }
    public Grandchild(int i, int j, int k, int l, int e, int f) {
        super(i, j, k, l);
        this.e = e;
        this.f = f;
    }
    public void Print() {
        super.Print();
        System.out.println("e is "+e+"\nf is "+f);
    }
    public void Delete() {
        System.out.println("delete");
    }
}

public class ConstructorEx2 {
    public static void main(String[] args) {
        //parent methods and overidden methods in child
        Parent p = new Grandchild(1,2,3,4,5,6);
        p.Yeet();

        //can access all parent methods along with its own
        Child C = new Child();
        C.Yeet();

        //can access parent methods only
        Parent P = new Parent();
    }
}
