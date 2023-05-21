package chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        3.
//        ラムダ式はそれを囲むブロックと同じスコープを持つため、以下のように変数宣言するとコンパイえるエラーになる。
//        String val = "A";
        Function1 f = (val) -> {
            System.out.println(val);
        };
        f.test("B");

//    4.
//      ラムダ式内から、式を宣言しているメソッドのローカル変数を使用することは可能。
        String val = "hello";
        Function2 f2 = () -> {
            System.out.println(val);
        };
        f2.test();

//      ラムダ式内から使用できるローカル変数は、実質finalである必要がある。
//      そのため、ラムダ式内でローカル変数の値を変更するとコンパイルエラーとなる。
//        Function2 fu2 = () -> {
//            val = "test";
//            System.out.println(val);
//        };
//        fu2.test();

//      以下のようにたとえラムダ式の外であったとしても、実質的にfinalな変数の値を変更するとコンパイルエラーとなる。
//        Function2 fun2 = () -> {
//            System.out.println(val);
//        };
//        val = "test";
//        fun2.test();


//        5.
        List<Sample> list = Arrays.asList(
                new Sample(10),
                new Sample(20),
                new Sample(30)
        );
        Predicate<Sample> x = s -> list.contains(s);
        if (x.test(new Sample(20))) {
            System.out.println("ok");
        }

//     6.
//     Supplierの利用例
        Supplier<String> func = () -> {
            return "Hello, Lambda";
        };
        System.out.println(func.get());

//      7.
//      Functionの利用例
        Function<String, Integer> funct = (str) -> {
            return Integer.parseInt(str);
        };
        System.out.println(funct.apply("100") * 2);

//      8.
//      Consumerの利用例
        Consumer<String> functi = str -> {
            System.out.println("Hello " + str);
        };
        functi.accept("Java");
    }

}
