package chapter7;


public class Parent {
//    1.
//    static String name = "";

//    19.
//    String name;
//
//    String getName() {
//        return this.name;
//    }

    //    21.
    public Parent() {
        System.out.println("A");
    }

    public Parent(String val) {
        this();
        System.out.println(val);
    }

}
