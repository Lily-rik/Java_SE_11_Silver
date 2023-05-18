package chapter7;

class G extends F {
//    String vsl = "B";

    //    20.
    public G() {
        super();    //記述しない場合、コンパイラによって自動で追加される。
        // この記述により、インスタンス生成時コンストラクタはスーパークラスから実行される。
        System.out.println("B");
    }
}
