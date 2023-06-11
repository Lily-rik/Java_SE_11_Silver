package chapter10;

public class Main {
    public static void main(String[] args) {
        //  1.
        try {
            int[] array = {};
            // 要素0の配列に対して、存在しない1番目の要素として値10を代入しようとしているためエラーになりcatchに入る
            array[0] = 10;
            System.out.println("finish");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        }

        // 2.
        try {
            // パラメータを渡さずMainクラスを実行した場合、
            // mainメソッドのString配列型引数には要素数0の配列インスタンスへの参照が渡される。
            // そのため、if文の条件に一致するためcatchには入らず、try-finallyの処理が実行される。
            if (args.length == 0) {
                System.out.println("A");
            }
        } catch (NullPointerException e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }

        // 3.
        try {
            sample();
            sub();

        } catch (SampleException e) {
            // SubSampleExceptionはSampleExceptionを継承しているため、こちらのcatchに入る
            // よってSubSampleExceptionのcatchに入る処理はないため、到達できないコードなのでコンパイルエラーとなる
            System.out.println("B");
//        } catch (SubSampleException e) {
//            System.out.println("A");
        }

        // 5.
        System.out.println(test(null));

        // 6.
        int result = sample2();
        System.out.println(result);

    }

    private static void sample() throws SampleException {
        throw new SampleException();
    }

    private static void sub() throws SubSampleException {
        throw new SubSampleException();
    }

    private static String test(Object obj) {
        try {
            System.out.println(obj.toString());
        } catch (NullPointerException e) {
            // returnで戻る前にfinallyが処理される
            return "A";
        } finally {
            System.out.println("B");
        }
        return "C";
    }

    private static int sample2() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            // finallyブロックがあるため、ここのreturnでは戻らない
            return 10;
        } finally {
            // finallyで戻り値が20になっているため、20が返される
            return 20;
        }
    }

}
