package chapter7;

public class Main {

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
//        new Main().test();

//  8.
//        AbstractSample s = new ConcreteSample();
//        s.sample();

//  12.
//        F f = new F();  // F型の変数を指定しているため、フィールドはA型に定義された値が使われる
//        F g = new G();  // 上と同様に、F型の変数を指定しているため、フィールドはA型に定義された値が使われる
//        System.out.println(f.val);
//        System.out.println(g.val);
//        f.print();  // printメソッドはAクラスに定義されているため、Aクラスに定義されているメソッドを使用する
//        g.print();  // 上と同様に、printメソッドはAクラスに定義されているため、Aクラスに定義されているメソッドを使用する

//  13.
//        Worker worker = new Engineer();
//        worker.work();

//  14.
//        Worker a = new Engineer();
//        Employee b = new Engineer();
//        Engineer c = new Engineer();
//
//        a.create(); // Workerクラスにcreateメソッドは定義されていない
//        b.work();   // Employeeクラスにworkメソッドは存在している
//        c.report(); // EngineerクラスはEmployeeメソッドを継承しており、継承先にreportメソッドは存在している

//  15.
//        H h = new I();
//        I i = (I) h;    // helloメソッドを使用するためにはIクラスの型を使用しなければならない
//        i.hello();

//  17.
        H h = new H();
        I i = (I) h;    // 変数hの参照先にあるインスタンスは、Hのインスタンスである。
        // HのインスタンスにはIの差分が含まれていないため、Iでオーバーライドしたメソッドは実行できずエラーとなる。
        i.hello();
    }

//  7.
//    // インターフェイスの多重継承をしていて同じシグニちゃの「デフォルトメソッドが存在する場合、
//    // Overrrideで呼び出すデフォルトメソッドを特定してあげる必要がある。
//    @Override
//    public void test() {
//        A.super.test();
//    }
}
