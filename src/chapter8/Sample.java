package chapter8;

import javax.swing.plaf.TableHeaderUI;

public class Sample {

//    匿名クラスを使用したコード例
//    Runnable r = new Runnable() {
//    @Override
//    public void run() {
//        System.out.println("hello!");
//    }

    //    ラムダ式に置き換えたコード例
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("hello!");
        };
        Thread thread = new Thread(r);
        thread.start();
        System.out.println("finish!");

//    1.
//    ラムダ式①
//    関数型インターフェイス定義されているメソッドの引数宣言と、ラムダ式の引数宣言は一致させなければならない

        Algorithm a = (String name) -> {
            /* do something */
        };
        //    ラムダ式②
//    引数の変数宣言を行うのは、処理ブロック内で変数を使用したいから
        Algorithm al = (String name) -> {
            System.out.println(name);
        };

//    ラムダ式③
//    宣言した変数以外は使用できないため、コンパイルエラーとなる
//    Algorithm alg = (String name) -> {
//        System.out.println(value);
//};

        //    ラムダ式④
//    ラムダ式の変数宣言はデータ型の指定を省略することができる
//    これは、代入しようとしている関数型インターフェイスの型から、引数の型を推論できるため。
//    逆にデータ型のみを記述して変数名を省略することはできない。
        Algorithm algo = (name) -> {
            System.out.println(name);
        };

        //    ラムダ式⑤
//    引数を受け取らないメソッドの場合は変数名を省略することができる。
        Runnable ru = () -> {
            System.out.println("hello!");
        };


//    2.
//        Test t = (x) -> {System.out.println(x);};     // ラムダ式の基本構文
        Test t = x -> System.out.println(x);    // 変数、処理がそれぞれ１つずつの場合は()、{}は省略可能。（複数は省略不可。）
        t.process(10);

//        Test2 t2 = () -> {return "hello!";};  // 中かっこがある場合はreturnを省略することはできない。
        Test2 t2 = () -> "hello!";  // ラムダ式の処理が何らかの戻り値を戻すとき、処理が１つしかなく、かつ中かっこを省略した場合は
        // returnキーワードを省略する ※「省略できる」ではなく「記述できない」。コンパイルエラーになる。
        System.out.println(t2.process());

    }

    //    5.
    private int num;

    public Sample(int num) {
        this.num = num;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Sample == false) {
            return false;
        }
        if (this.num == ((Sample) obj).num) {
            return true;
        }
        return false;
    }


}
