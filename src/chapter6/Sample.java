package chapter6;

public class Sample {
//  5.
//    static int num = 0;

//  7.
//    public void hello() {
//        System.out.println("hello.");
//    }

//  8.
//    public int add(Integer a, Integer b) {
//        return a + b;
//    }

//  11.
//    private String value;
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//    public String getValue() {
//        return this.value;
//    }

//  12.
//    float divide(int a, int b) {
//        return (float) a / (float) b;
//    }

//  13.
//    public int method(int a, int b) {
//        return a + b;
//    }

//  15.
//    public void method(int num) {
//        if (num < 0) return;
//        System.out.println("A");
//        return;
//        // このように実行されないことが明白なコードがあった場合、コンパイラは「到達不可能なコードがある」として
//        // コンパイルエラーを発生させる
//        System.out.println("B");
//
//        // 実行結果
//        // java: この文に制御が移ることはありません
//    }

//  19.
//    // 非公開なコンストラクタを使用したクラス定義
//    private Sample() {}
//    public static Sample getInstance() {
//        return new Sample();
//    }

//    // このクラスはコンストラクタが非公開になっているため、他のクラスがnewを使ってインスタンス化できないようにしている。
//    // もしインスタンスを取得したければ、staticなgetInstanceを使用するしかない
//    // 以下のように実装すると、そのアプリケーション内でインスタンスがひとつしかないことを保証できる。
//
//    private static Sample instance = null;
//    private Sample() {}
//    public static Sample getInstance() {
//        if (instance == null) {
//            instance = new Sample();
//        }
//        return instance;
//    }

//    // 非公開のコンストラクタの呼び出し
//    // このようにコンストラクタをオーバーロードして複数定義し、公開するコンストラクタと非公開にするコンストラクタに分けることもできる
//
//    public Sample() {
//        this("sample");
//        // so something
//    }
//
//    private Sample(String val) {
//        // do something
//    }

//  20.
//    // 一見コンストラクタのように見えるが、こちらは戻り値型を記述している。
//    // そのためこの定義は通常のメソッドとして解釈される。
//    // コンストラクタではない通常のメソッドの名前が、クラス名と同じではいけないというルールはない。
//    void Sample() {
//        System.out.println("hello.");
//    }

//  21.
//    Sample() {
//        System.out.println("A");
//    }
//
//    // 初期化子
//    // これが一番最初に処理される(コンストラクタより前)
//    {
//        System.out.println("B");
//    }

//  22.
//    // 初期化子やコンストラクタはインスタンスを生成するタイミングでしか実行されないため、
//    // インスタンス生成前クラス変数の値を初期化することはできない。
//
//    static int num;
//
//    {
//        num = 10;
//    }
//
//    public Sample() {
//        num = 100;
//    }

//    // もし、クラス変数を初期化するための何らかの処理を記述したいのであれば、
//    // 初期化子ではなく、static初期化子を使用する。
//    static int num;
//
//    static {
//        num = 10;
//    }
//
//    public Sample() {
//        num = 100;
//    }

//  23.
//    // 戻り値が設定されているため、メソッド
//    void Sample() {
//        System.out.println("A");
//    }
//
//    // コンストラクタ
//    // ひとつでもコンストラクタが定義されている場合は、デフォルトコンストラクタは定義されない
//    Sample(String str) {
//        System.out.println(str);
//    }

//  24.
//    public Sample() {
//        this(null, 0);
//    }
//
//    public Sample(String str, int num) {
//        System.out.println("OK.");
//    }

//  25.
//    public Sample() {
//        System.out.println("A");
//        // オーバーロードされた別のコンストラクタを呼び出すコードは、処置の後に記述することはできない
//        // (最初に記述しなければならない)
//        this("B");
//    }
//
//    public Sample(String str) {
//        System.out.println(str);
//    }
//
//    // 実行結果
//    // java: thisの呼出しはコンストラクタの先頭文である必要があります

//  28.
//    // カプセル化
//    private int num;
//
//    public int getNum() {
//        return num;
//    }
//
//    private void setNum(int num) {
//        this.num = num;
//    }

    //  29.30.
    int num;

    public Sample(int num) {
        this.num = num;
    }


}
