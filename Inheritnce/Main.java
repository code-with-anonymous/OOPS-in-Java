class Parent {
    String name = "parent";

    void info() {
        System.out.println("Basic Information");
    }
}

class Child extends Parent {
    void displayName() {
        name = "child";
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.info();
        obj.displayName();
    }
}
