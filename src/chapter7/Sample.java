package chapter7;

//  3.
public interface Sample {
    // コンパイラによってpublicで修飾される
    void hello();

    // インターフェイスの抽象メソッドは中身を持つことはできないため、以下の実装はコンパイルエラーになる
//    public void hello() {}


}
