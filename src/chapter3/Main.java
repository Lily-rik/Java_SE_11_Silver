package chapter3;

public class Main {
    public static void main(String[] args) {
//  8.
        Sample s1 = new Sample(10);
        Sample s2 = s1; // s2はs1と同じインスタンスを参照している
        s1 = new Sample(10); // s1は新たにインスタンスを作成しており、この段階でs1とs2は異なるインスタンスを参照している
        System.out.println(s1 == s2); // よってs1とs2は同一ではなくなるためfalse

//  9.
        Sample a = new Sample(10, "a");
        Sample b = new Sample(10, "b");
        System.out.println(a.equals(b));

//  10.
        // 設問のSample(No.10)クラスに定義されているequalsメソッドは引数がSample型
        // 今回こちらで使用している型はObject型なので、Objectクラスに定義されているequalsメソッドが呼ばれる
        // Objectクラスに定義されているequalsメソッドは同一性の判定をするため、
        // 変数cとdはインスタンスが異なり参照が異なるため結果はfalseとなる
        Object c = new Sample(10);
        Object d = new Sample(10);
        System.out.println(c.equals(d)); // false

//  11.
        Object obj = new Object(); // これはnullではない。objには参照先が設定されている。
                                   // そして、参照先の中身は定義されていない、という事になる
        System.out.println(obj);   // そのためこの結果はjava.lang.Object@3fee733dとなり、nullではない

//  12.
        String str1 = "sample";  // 文字列リテラルは定数値として定数用のメモリ空間に作られ、
        String str2 = "sample";  // そこへの参照がString型に代入される
        System.out.print(str1 == str2);  // そのため、str1とstr2の参照値は同じになり、同一性であるためtrueになる
        System.out.print(", ");
        System.out.println(str1.equals(str2));

//  13.
        String str3 = new String("sample");  // 明示的にnew演算子を使用した場合は新しくインスタンスが生成される
        String str4 = "sample";
        System.out.print(str3 == str4);  // そのためstr3とstr4は参照が異なりfalse
        System.out.print(", ");
        System.out.println(str3.equals(str4));  // Stringクラスのequalsメソッドは「同値」かを確認する。よってtrue

//  14.
        String str5 = new String("def");
        String str6 = new String("def");
        // こちらは参照先が異なるためfalseが返る
        System.out.println(str5 == str6);
        // こちらはinternメソッドが、すでにメモリ内にある参照を戻すため、参照先が同じになりtrueが返る
        System.out.println(str5.intern() == str6.intern());

//  15.
        int num = 10;
        // if文は{}は省略可！
        if (num <= 10)
            System.out.println("OK");

//  16.
        //  if文の{}を省略した場合、次の一文のみがif文の条件に合致したときの処理として実行される
        //  この書き方は可読性が損なわれるため非推奨
        if(false)
            System.out.println("A");
            System.out.println("B");

//  17.
        int num2 = 10;
        if (num2 < 10)
            System.out.println("A");
        else
            System.out.println("B");
        if (num2 == 10)
            System.out.println("C");

//  18.
        //  設問で{}が省略されていてわかりにくい時は自分で書き足す！
        int num3 = 10;
        if (num3 == 100)
            System.out.println("A");
        else if (10 < num3)
            System.out.println("B");
        else
            if (num3 == 10)
                System.out.println("C");
            else
                if (num3 == 10)  // num3 == 10がfalseの時にこのルートに入るので、このルートに入ることはない
                    System.out.println("D");  // よって"D"は表示されない

//  20.
        final int NUM = 0;
        int num4 = 10;
        switch (num4) {
//            case "10": System.out.println("A");  // 条件式が戻す値と同じ型、もしくは互換性があるものでないといけない
//            break;
//            case num: System.out.println("B");  // 変数は分岐が成り立たなく場合があるため使用できない
//            break;
            case 2 * 5: System.out.println("C");
            break;
            case NUM: System.out.println("D");
        }

//  21.
        //  breakがない場合はcase式と合致しても処理は下に流れていき、全て処理される
        int num5 = 1;
        switch (num5) {
            case 1:
            case 2:
            case 3: System.out.println("A");
            case 4: System.out.println("B");
            default: System.out.println("C");
        }

    }

}
