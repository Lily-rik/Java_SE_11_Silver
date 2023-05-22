package chapter9;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Sample {
    private int id;
    private String name;

    public Sample(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //    4.
    public static void main(String[] args) {
        char a = '0';
        int num = 0;

        // 引数で受け取った文字がアルファベットかどうかをしラベルメソッド
        if (Character.isAlphabetic(a)) {
            num++;
        }
        // 引数で受け取った文字が数字かどうかを調べるメソッド
        if (Character.isDigit(a)) {
            num++;
        }
        // 引数で受け取った文字が小文字か小文字かどうかを調べるメソッド
        if (Character.isLowerCase(a)) {
            num++;
        }
        System.out.println(num);


//      5.
        // LocalDateは1-12の間で月を指定するため、実行時に例外がスローされる
        // 構文自体に問題はないためコンパイルエラーにはならない
//        LocalDate b = LocalDate.of(2015, 0, 1);
//        LocalDate c = LocalDate.parse("2015-01-01");
//        System.out.println(b.equals(c));


//        6.
        LocalDate d = LocalDate.of(2019, 8, 19);
        LocalDate e = LocalDate.now();
        // LocalDateはimmutableであるため、データの変更はできない
        // そのため、以下の場合はインスタンスの値は変更せずに、新しい日付をもった新しいインスタンスを持って戻す
        e.with(DayOfWeek.MONDAY);   // 変数の日付での週で、指定の曜日の日付に変更する
        System.out.println(d.equals(e) + ", " + d.isBefore(e));

    }

}
