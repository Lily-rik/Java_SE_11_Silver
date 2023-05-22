package chapter9;

import chapter2.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
//        2.
        Sample[] samples = {
                new Sample(2, "B"),
                new Sample(3, "C"),
                new Sample(1, "A")
        };
        List<Sample> list2 = new ArrayList<Sample>(Arrays.asList(samples));
        list2.sort(new SampleComparator());
        for (Sample s : list2) {
            System.out.println(s.getName());
        }

//        3.
        List<Integer> list3 = Arrays.asList(new Integer[]{1, 2, 3});
        // 自然順と逆に並べる場合は、-演算子をつけて結果の数字を逆にする
        list3.sort((a, b) -> -a.compareTo(b));  // sortの引数はComparator型
        for (Integer num : list3) {
            System.out.println(num);
        }

//        8.
        // ArryListの取り扱う引数や戻り値はObject型であるため、型が混在していても追加等が可能となる
        ArrayList list8 = new ArrayList<>();
        list8.add("A");
        list8.add(10);
        list8.add('B');

        // 実行時にダウンキャストするタイミングで例外が発生する可能性があるため注意が必要
        // 設問はObject型を使用しているため、ここもエラーにはならない
        for (Object obj : list8) {
            System.out.println(obj);
        }

        // 型が混在しないようにジェネリクスという記述がある
        ArrayList<String> listJ = new ArrayList<String>();

        // Java SE7以降は以下のように省略記法も可能(型推論)
        ArrayList<String> listJE = new ArrayList<>();

//        9.
//        ArrayList<String> list9 = new ArrayList<>();
//        list9.add("A");
//        // この時点ではまだIndexが0,1しか存在しておらず、2はIndexOutOfBoundsExceptionとなる
//        // 文法上の誤りではないためコンパイルエラーは発生しない
//        list9.add(2, "B");  // 第一引数がindex、第二引数が追加内容
//        list9.add("C");
//        list9.add("D");
//        for (String str : list9) {
//            System.out.println(str);
//        }

//        10.
        ArrayList<String> list10 = new ArrayList<>();
        list10.add("A");
        // setメソッドは追加ではなく置き換えのメソッド
        list10.set(0, "B");
        list10.add("C");
        list10.set(1, "D");
        for (String str : list10) {
            System.out.println(str);
        }

//        11.
        ArrayList<Item> list11 = new ArrayList<>();
        list11.add(new Item("A", 100));
        list11.add(new Item("B", 200));
        list11.add(new Item("C", 300));
        list11.add(new Item("A", 100));
        // removeメソッドは、インデックス指定だけでなく、引数で受け取った要素も削除できる
        // ※ただし、削除するのは条件に合う最初の要素のみ
        list11.remove(new Item("A", 500));
        for (Item item : list11) {
            System.out.println(item.getName());
        }

//        12.
        ArrayList<String> list12 = new ArrayList<>();
        list12.add("A");
        list12.add("B");
        list12.add("C");
        for (String str : list12) {
            if ("B".equals(str)) {
                // removeメソッドで要素が削除されると、次の要素が繰り上がる
                // for文では次のindexを取り出すが"C"は繰り上がったためそこに要素はなく、ループは終了となる
                list12.remove(str);
            } else {
                System.out.println(str);
            }
        }

//        13.
//        ArrayList<String> list13 = new ArrayList<>();
//        list13.add("A");
//        list13.add("B");
//        list13.add("C");
//        list13.add("D");
//        list13.add("E");
//        // ArrayListはスレッドセーフなクラスではないため、removeメソッドの実行後に読み出しを行うと例外がスローされる
//        for (String str : list13) {
//            if ("C".equals(str)) {
//                list13.remove(str);
//            }
//        }
//        for (String str : list13) {
//            System.out.println(str);
//        }

//        15.
        String[] a = {"b", "c"};
        String[] b = {"a", "b", "c"};
        System.out.println(Arrays.mismatch(a, b));

//    16.
        String[] c = {"B", "A"};
        String[] d = {"A", "B"};
        // 第一引数"B"は第二引数"A"より辞書順が後なので、正の値「1」が返る
        // 先に場合は負の値「-1」、等しいときは「0」を返す
        System.out.println(Arrays.compare(c, d));

//        17.
        // asListは固定長であり要素の削除ができないため、ArrayListを生成し直している
        List<String> list17 = new ArrayList<>(
                Arrays.asList(new String[]{"A", "B", "C"})
        );
        list17.removeIf(
                (String s) -> {
                    return s.equals("B");
                }
        );
        System.out.println(list17);

//        18.
        List<String> list18 = List.of("A", "B", "C");
        // forEacはConsumer型を返す
        list18.forEach(str -> System.out.println(str));
        // 以下と同じ
        Consumer<String> logic = (str) -> {
            System.out.println(str);
        };
        list18.forEach(logic);

        // メソッド参照を使用することでさらに簡略化できる
        list18.forEach(System.out::println);

        // メソッド参照
        Consumer<String> logic2 = chapter9.Main::test;
        list18.forEach(logic2);

    }

    public static void test(String str) {
        System.out.println(str);
    }

    // 以下のように互換性のないメソッドへの参照は代入できずエラーになる
//    public static String test(String str, int num) {
//        System.out.println(str);
//    }

}
