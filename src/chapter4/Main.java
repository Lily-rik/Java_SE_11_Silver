package chapter4;

public class Main {
    public static void main(String[] args) {
//  1.
        int a = 11;
        int b = 0;
        while (b < 5) {
            if (a > 5) {
                System.out.println(b);
            }
            a--;
            b++;
        }

//  2.
        int c = 0;
        do {
            System.out.println(c++);
        } while (c < 5);

//  3.
//        int d = 0;
//        while (d < 5)
//            //  do-while文の{}を省略した場合、2文以上記述した場合はコンパイルエラーとなる
//            do
//                d++;
//                System.out.println(d);
//
//            while (true);

//  4.
//        //  for文の初期化文では、異なる型を宣言することはできないため、コンパイルエラーとなる
//        for (int i = 1, long j = 2; i < 5; i++) {
//            System.out.println(i * j);
//        }

//  5.
//        int e = 1;
//        for (int f = 2, total = 0; f <= 5; b++) {
//            total = e * f;
//        }
//        //  初期化文で宣言された変数はfor文の中でしか使用できないため、「変数が見つからない」とコンパイルエラーになる
//        System.out.println(total);

//  6.
        for (int i = 0; i == 0; i++) {
            System.out.println(i);
        }

//  7.
        //  条件文は「,」区切りでは表現できない。複数ある場合は論理演算子を用いる
//        for (int i = 0, j = 0; i < 3, j < 5; i++) {
        for (int i = 0, j = 0; i < 3 && j < 5; i++) {
            System.out.println(i++);
            j += 1;
        }


    }

}
