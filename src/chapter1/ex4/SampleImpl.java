package chapter1.ex4;

// 同一パッケージではないのでSampleクラスを使用するためにはimport宣言が必要
import chapter1.Sample;

public class SampleImpl extends Sample {

    public static void main (String[] args) {
        // 宣言をするとそのクラスを使用することができる(型はクラスの型になる)
        Sample sample = new Sample();
        System.out.println(sample);
    }


}
