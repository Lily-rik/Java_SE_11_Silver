package chapter2;

public class Main {
    public static void main(String[] args) {
//  7.
//        Sample s = new Sample("sample");
//        s.test();

//  8.
//        var a = new B();  // コンパイル時にvarによる型推論が行われるため、変数aの型はBになる
//        a = new C();  // そのため、型Bの変数aに型Cのインスタンスを作成しようとしているためエラーとなっている
//        a.test();

//  10.
//        String str = "hoge, world.";
//        hello(str);
//        System.out.println(str);
//    }
//
//    private static void hello(String msg) {
//        Stringはimmutableなオブジェクトなので、replaceAllで書き換えることはできない
//        よって、この場合実行結果は"hoge, world."(初期のstr値)になる
//        msg.replaceAll("hoge", "hello");
//    }

//  10. immutableなクラス
//        このクラスがfinalで修飾されているため、継承したサブクラスを定義することはできない
//        public final class Sample {
//
//            privateなフィールドは、コンストラクトで初期化した後は、このフィールドを変更することはできない
//            private final String name;
//            public Sample(String name) {
//                this.name = name;
//            }
//            public void greet() {
//                System.out.println("hello" + name);
//            }
//        }

//  11.
        String str = "abcde";
        System.out.println(str.charAt(5));

//  12.
        String str2 = "abcde";
        System.out.println(str2.indexOf("abcdef"));

//  13.
        String str3 = "abcde";
        System.out.println(str3.substring(2, 4));

//  14.
        String str4 = "aaaa";
        System.out.println(str4.replace("aa", "b"));

//  15.
        String str5 = "abcde";
        System.out.println(str.charAt(str5.length()));

//  16.
        String str8 = "abcde";
        System.out.println(str8.substring(1, 3).startsWith("b"));

//  17.
        String str9 = "Hello, ".concat("Java!");
        System.out.println(str9);

//  18.
        System.out.println(10 + 20 + "30" + 40);

//  19.
        String str10 = null;
        str10 += "null";
        System.out.println(str10);

//  20.
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb.capacity());

//  21.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("abcde");
        sb2.reverse();
        sb2.replace(1, 3, "a");
        System.out.println(sb2);

//  22.
        StringBuilder sb3 = new StringBuilder("abcde");
        System.out.println(sb3.indexOf("bcd"));
    }
}
