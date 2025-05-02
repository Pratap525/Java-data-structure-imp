class Parent {
    static String name = "ParentClass";

    static void show() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {}

public class Main1 {
    public static void main(String[] args) {
        // Accessing static variable and method via subclass
        Child c = new Child();
        System.out.println(c.name); // ✅ Allowed
        c.show(); // ✅ Allowed
    }
}
