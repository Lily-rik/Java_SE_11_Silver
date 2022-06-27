package chapter2;

public class Sample {
//    フィールドの宣言はvarを使って型推論を行うことはできない
//    private final var value;
    private final String value;

//    引数の型宣言に型推論は使用できない
//    →メソッドの定義をコンパイルしようとした時に、
//     どのコードからこのメソッドが使われているかを探して型推論行うことはできないため
//    public Sample(var value) {
//        this.value = value;
//    }

    public Sample(String value) {
        this.value = value;
    }

    public void test() {
        System.out.println(value);
    }
}
