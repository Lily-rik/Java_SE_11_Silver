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
//        String str = "abcde";
//        System.out.println(str.charAt(5));

//  12.
//        String str = "abcde";
//        System.out.println(str.indexOf("abcdef"));

//  13.
//        String str = "abcde";
//        System.out.println(str.substring(2, 4));

//  14.
//        String str = "aaaa";
//        System.out.println(str.replace("aa", "b"));

//  15.
//        String str = "abcde";
//        System.out.println(str.charAt(str.length()));

//  16.
//        String str = "abcde";
//        System.out.println(str.substring(1, 3).startsWith("b"));

//  17.
//        String str = "Hello, ".concat("Java!");
//        System.out.println(str);

//  18.
//        System.out.println(10 + 20 + "30" + 40);

//  19.
//        String str = null;
//        str += "null";
//        System.out.println(str);

//  20.
//        StringBuilder sb = new StringBuilder("abcde");
//        System.out.println(sb.capacity());

//  21.
//        StringBuilder sb = new StringBuilder();
//        sb.append("abcde");
//        sb.reverse();
//        sb.replace(1, 3, "a");
//        System.out.println(sb);

//  22.
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb.indexOf("bcd"));
    }
}
