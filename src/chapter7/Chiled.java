package chapter7;

//  1.
public class Chiled extends Parent {
    Chiled() {
        // Childクラスにはnameフィールドが定義されていないため、Parentクラスで定義されている必要がある
        name = "Java";
    }

    void hello() {
        System.out.println("hello" + name);
    }
}
