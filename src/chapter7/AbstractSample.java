package chapter7;

abstract class AbstractSample {
    public void sample() {
        System.out.println("A");
        test();
        System.out.println("C");
    }

    protected abstract void test(); // 抽象メソッド

}
