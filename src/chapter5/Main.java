package chapter5;

public class Main {

    public static void main(String[] args) {
//  1.
        // これは要素を１つも扱わないインスタンスを生成しているだけなので、役目はないが、
        // 文法的に間違っているわけではないためエラーにはならない
        int[] array = new int[0];
        // 引数に配列(への参照)を渡すと、参照先にある配列インスタンスのtoStringメソッドを呼び出す
        // そこから継承元のObjectクラスの戻り値で、ハッシュコードが表示される
        System.out.println(array);

//  2.
        // ここで生成しているのは「配列インスタンス」のみ。Itemのインスタンスを生成しているわけではない。
        Item[] items = new Item[3];

        // 要素を詰める処理の例 以下の処理でItemの要素を入れてあげるとエラーにはならない
        // 今回はpriceのみなので、nameはなくてもヌルポにはならない
//        Item item1 = new Item();
////        item1.name = "aaa";
//        item1.price = 100;
//
//        Item item2 = new Item();
////        item2.name = "bbb";
//        item2.price = 200;
//
//        Item item3 = new Item();
////        item3.name = "ccc";
//        item3.price = 300;
//
//        items[0] = item1;
//        items[1] = item2;
//        items[2] = item3;

        int total = 0;
        for (int i = 0; i < items.length; i++) {
            // この配列は要素の中身が作られていないため、オブジェクト型配列のデフォルト値である「null」で初期化されている
            // 変数の参照先がないためヌルポになる
            total += items[i].price;
        }
        System.out.println(total);
    }
}
