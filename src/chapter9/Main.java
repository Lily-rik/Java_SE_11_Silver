package chapter9;

import chapter2.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        list11.remove(new Item("A", 500));
        for (Item item : list11) {
            System.out.println(item.getName());
        }

    }

}
