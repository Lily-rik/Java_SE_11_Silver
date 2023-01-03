package chapter5;

public class Main {

    public static void main(String[] args) {
//  1.
//        // これは要素を１つも扱わないインスタンスを生成しているだけなので、役目はないが、
//        // 文法的に間違っているわけではないためエラーにはならない
//        int[] array = new int[0];
//        // 引数に配列(への参照)を渡すと、参照先にある配列インスタンスのtoStringメソッドを呼び出す
//        // そこから継承元のObjectクラスの戻り値で、ハッシュコードが表示される
//        System.out.println(array);

//  2.
//        // ここで生成しているのは「配列インスタンス」のみ。Itemのインスタンスを生成しているわけではない。
//        Item[] items = new Item[3];
//
//        // 要素を詰める処理の例 以下の処理でItemの要素を入れてあげるとエラーにはならない
//        // 今回はpriceのみなので、nameはなくてもヌルポにはならない
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

//        int total = 0;
//        for (int i = 0; i < items.length; i++) {
//            // この配列は要素の中身が作られていないため、オブジェクト型配列のデフォルト値である「null」で初期化されている
//            // 変数の参照先がないためヌルポになる
//            total += items[i].price;
//        }
//        System.out.println(total);

//  6.
//        String[] array = {"A", "B", "C", "D"};
//        array[0] = null;
//        for (String str : array) {
//            System.out.println(str);
//        }

//  7.
        // 配列インスタンスの生成・初期化と配列型変数の宣言と参照の代入①
        int[] array1 = {2, 3};

        // 配列インスタンスの生成・初期化と配列型変数の宣言と参照の代入②
        int[] array2 = new int[]{2, 3};

        // 配列の要素数を指定した場合
        // 初期化子が出てきた時に要素数は自動計算れるため、指定するとコンパイルエラーとなる
//        int[] array3 = new int[2]{2,3};

        // 要素数ゼロの配列インスタンスの生成①
        int[] array4 = {};

        // 要素数ゼロの配列インスタンスの生成②
        int[] array5 = new int[0];

        // 多次元配列の生成・宣言・初期化①
        int[][] array6 = {{2, 3}, {4, 5}};

        // 多次元配列の生成・宣言・初期化②(コンパイルエラー)
        // このコードは変数は二次元、参照先の配列インスタンスは1次元であるため、コンパイルエラーとなる
//        int[][] array7 = new int[]{};

        // 多次元配列の生成・宣言・初期化③
        int[][] array8 = new int[][]{};

        // 多次元配列の生成・宣言・初期化④
        // newを使用せずに初期化してもコンパイルエラーにはならない
        // これは初期化子が自動的に必要な次元を算出して、必要な初期化を行うため
        int[][] array9 = {};

        // 大カッコを使い、明示的に次元数を記述した場合
        int[][] array10;
        array10 = new int[][]{};

//  8.
//        String[][] array11 = {{"A", "B"}, null, {"C", "D", "E"}};
//        int total = 0;
//        for (String[] tmp : array11) {
//            // nullは参照先が存在しないため、null.lengthでぬるぽとなる
//            total += tmp.length;
//        }
//        System.out.println(total);
//
//        // 実行結果
//        // NullPointerException

//  9.
        // CとDのクラスはAを継承しているため、Aの型を使用することができる
        A[] array12 = {new C(), null, new D()};
        // 全てのクラスはobject型を暗黙的に継承しているため、型変換が行われエラーにはならない
        Object[] objectArray = array12;

//  10.
        int[][] arrayA = {{1, 2}, {1, 2}, {1, 2, 3}};
        // cloneメソッドは、配列の内容をそのままコピーする
        int[][] arrayB = arrayA.clone();
        int total = 0;
        for (int[] tmp : arrayB) {
            for (int val : tmp) {
                total += val;
            }
        }
        System.out.println(total);

        // cloneメソッドを使用した配列のコピー
        int arrayC[] = {1, 2, 3, 4};
        int[] arrayD = arrayC.clone();
        System.out.println(arrayC == arrayD);   // falseとなるため、arrayCとarrayDの参照先は異なることがわかる
        for (int i : arrayD) {
            System.out.println(i);
        }
    }
}
