package chapter7;

public class Child extends Parent {
//    1.
//    Child() {
//        // Childクラスにはnameフィールドが定義されていないため、Parentクラスで定義されている必要がある
//        name = "Java";
//    }
//
//    void hello() {
//        System.out.println("hello" + name);
//    }

//    19.
//    String name;

    //    21.
    public Child() {
        super("B");
        System.out.println("C");
    }

    public Child(String val) {
        this();
        System.out.println(val);
    }

}
