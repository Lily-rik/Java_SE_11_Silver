package chapter7;


public interface A {
// 4.
//    // デフォルトメソッドはインターフェイスに実装を持たせることが可能になる
//    default void sample() {
//        System.out.println("sample");
//    }

//  5.
//    @Override
//    // java.lang.Objectクラスに定義されているメソッドをインターフェイスでデフォルトメソッドとしてオーバーライドすると、
//    // コンパイルエラーとなるため注意
//    default String toString() {
//        return "A";
//    }
//    default void Sample() {
//        System.out.println("A");
//    }

//  6.
//    default void sample() {
//        System.out.println("Hello.");
//    }

    //  7.
    default void test() {
        System.out.println("A");
    }

}
