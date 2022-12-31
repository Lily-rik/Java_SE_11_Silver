package chapter6;

public class Main {
    public static void main(String[] args) {
//  1.
//        //  7.8行目でインスタンスが2つ生成されている。
//        Item a = new Item();
//        Item b = new Item();
//        b.setNum(20);
//        System.out.println(a.getNum());

//  2.
//        Item a = new Item();
//        Item b = new Item();
//        a.name = "apple";
//        b.price = 100;
//        a.price = 200;
//        b.name = "banana";
//        a = b;
//        a.printInfo();

//  4.
        Object a = new Object();
        Object b = new Object();
        Object c = a;
        a = null; // aの参照nullになるが、cがaと同じ場所を参照しているため、ガベージコレクションの対象とはならない
        b = null; // ガベージコレクションの対象となる
        // more codes

    }


}
