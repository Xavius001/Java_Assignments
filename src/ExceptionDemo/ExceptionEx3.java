package ExceptionDemo;

class ParentCls {
    private String message;
    public ParentCls() {
        System.out.println("Default");
    }
    public ParentCls(String s) {
        message = s;
    }
}

class ChildCls extends ParentCls {
    public ChildCls() {
        System.out.println("default in child");
    }
    public ChildCls(String s) {
        super(s);
        System.out.println(s);
    }
}

public class ExceptionEx3 {
    public static void main(String[] args) {
        ChildCls C = new ChildCls("Hello");
    }
}
