package chapter9;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // removeメソッドの削除対象は同値であるものである。
    // そのため、equalメソッドがtrueを戻す要素を「同じ」ものとして削除する
    // 今回はnameが一致すればtrueを返しているため、priceは同値出なくても「同値」判定になる
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            Item tmp = (Item) obj;
            if (tmp.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
