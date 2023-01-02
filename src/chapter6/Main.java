package chapter6;

public class Main {
    public static void main(String[] args) {
//  1.
//        //  7.8行目でインスタンスが2つ生成されている。
//        Item a = new Item();
//        Item b = new Item();
//        b.setNum(20);
//        System.out.println(a.getNum());

//  2.
//        Item a = new Item();
//        Item b = new Item();
//        a.name = "apple";
//        b.price = 100;
//        a.price = 200;
//        b.name = "banana";
//        a = b;
//        a.printInfo();

//  4.
//        Object a = new Object();
//        Object b = new Object();
//        Object c = a;
//        a = null; // aの参照nullになるが、cがaと同じ場所を参照しているため、ガベージコレクションの対象とはならない
//        b = null; // ガベージコレクションの対象となる
//        // more codes

//  5.
//        // staticな領域にあるnumは、インスタンスと異なり複数の領域を持たないため、
//        // 代入されるたびに値が書き換わる。よって最後に代入された30が出力される。
//        Sample.num = 10;
//        Sample s = new Sample();
//        Sample s2 = new Sample();
//        s.num += 10;
//        s2.num = 30;
//        System.out.println(Sample.num);

//  7.
//        Sample sample = new Sample();
//        sample.hello();

//  8.
//        Sample s = new Sample();
//        System.out.println(s.add(10));
//
//        // No.8を実行すると以下のように引数の長さが違うためコンパイルエラーとなる
//
//        // 実行結果
//        // java: クラス chapter6.Sampleのメソッド addは指定された型に適用できません。
//        // 期待値: java.lang.Integer,java.lang.Integer
//        // 検出値:    int
//        // 理由: 実引数リストと仮引数リストの長さが異なります

//  11.
//        Sample s = new Sample();
//        String val = s.setValue("hello");
//        s.getValue();
//        System.out.println(val);
//
//        // 戻り値がないものを変数に代入することはできないためコンパイルエラーとなる
//
//        // 実行結果
//        // java: 不適合な型: voidをjava.lang.Stringに変換できません:

//  12.
//        Sample s = new Sample();
//        double result = s.divide(10, 2);
//        System.out.println(result);

//  13.
//        Sample s = new Sample();
//        int result = s.method(2);
//        System.out.println(result);
//
//        // 実引数リストと仮引数リストの長さが異なるためコンパイルエラーとなる
//
//        // 実行結果
//        // java: クラス chapter6.Sampleのメソッド methodは指定された型に適用できません。
//        // 期待値: int,int
//        // 検出値:    int
//        // 理由: 実引数リストと仮引数リストの長さが異なります

//  17.
//        Main m = new Main();
//        // 数値リテラルは、デフォルトでint型の値として解釈される
//        System.out.println(m.calc(2, 3));
//
//        // 実行結果
//        // java: calcの参照はあいまいです
//        // chapter6.Mainのメソッド calc(double,int)とchapter6.Mainのメソッド calc(int,double)の両方が一致します

//  20.
//        Sample s = new Sample();
//        s.Sample();

//  21.
//        Sample s = new Sample();

//  22.
        // staticで修飾されたクラス変数は、インスタンスを生成していない場合、
        // 初期化子やコンストラクタの影響を受けず、デフォルト値で初期化されたまま変更されない。
        System.out.println(Sample.num);

        // 以下のようにインスタンスを生成し利用した場合は、初期化子、コンストラクタの影響を受ける
        Sample s = new Sample();
        System.out.println(Sample.num);


    }

//  17.
//    private double calc(double a, int b) {
//        return (a + b) / 2;
//    }
//
//    private double calc(int a, double b) {
//        return (a + b) / 2;
//    }


}
