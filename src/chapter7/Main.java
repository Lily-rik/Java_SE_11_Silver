package chapter7;

public class Main implements A, E {

    public static void main(String[] args) {
//  4.
//        A a = new B();
//        a.sample();

//  5.
//        A a = new B();
//        System.out.println(a);

//  5.
//        A a = new D();
//        a.sample();

//  7.
        new Main().test();


    }

    //  7.
    // インターフェイスの多重継承をしていて同じシグニちゃの「デフォルトメソッドが存在する場合、
    // Overrrideで呼び出すデフォルトメソッドを特定してあげる必要がある。
    @Override
    public void test() {
        A.super.test();
    }
}
