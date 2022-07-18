package chapter3;

public class Sample {
    private int num;
    private String name;

//  8.
    public Sample(int num) {
        this.num = num;
    }

//  9.
    // この書き方がメソッドのオーバーロード
    public Sample(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if (obj instanceof Sample) {
            Sample s = (Sample) obj;
            return s.num == this.num;
        }
        return false;
    }

//  10.
    public boolean equals(Sample obj) {
        if (obj == null) {
            return false;
        }
        return this.num == obj.num;
    }
}
