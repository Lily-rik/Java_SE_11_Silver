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

//  8.
        for (int i = 0; i < 3; i++, period()) {
            System.out.print(i);
        }

//  9.
        int array[][] = new int[][]{{1, 2}, {2, 3, 4}};
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                total += array[i][j];
            }
            System.out.println(total);
        }

//  11.
        String[][] array2 = {{"A", "B", "C"}};
        for (Object obj : array2) {
            System.out.println(obj);
        }

//  12.
        String[] array3 = {"A", "B", "C"};
        for (String str : array3) {
            str = "D";
        }
        for (String str : array3) {
            System.out.print(str);
        }

//  13.
//    設問
        int num = 10;
        do {
            num++;
        } while (++num < 10);   // do後に+1で11。条件式の前に+1で12。条件には当てはまらないため処理終了。
        System.out.println(num);    // num = 12

//    A
        while (++num < 10) {    // 条件式前に+1で11。条件式に合わないため処理終了。
            num++;
        }
        System.out.println(num);    // num = 11

//    B
        while (++num <= 10) {   // 条件式前に+1で11。条件式に合わないため処理終了。
            num++;
        }
        System.out.println(num);    // num = 11

//    C
        while (num++ < 10) {    // 条件式に合わないため処理終了。処理後に+1で11。
            num++;
        }
        System.out.println(num);    // num = 11

//    D
        while (num++ <= 10) {   // 条件式に合うため処理実行。条件式後に+1で11。
            num++;
        }   // 処理実行後に+1で12。
        // 再度条件式に入りfalseのため処理終了。条件式後に+1で13。
        System.out.println(num);    // num = 13

//  14.
        String[] array4 = {"A", "B"};
        for (String f : array4) {
            for (String g : array4) {
                if ("B".equals(g))
                    break;
                System.out.print(g);
            }
        }


    }

    private static void period() {
        System.out.print(",");
    }


}
