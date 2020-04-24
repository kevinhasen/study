package how.jiekou;

public abstract class Item {
    public abstract boolean disposable();

    public static void main(String[] args) {
        Item i = new Item() {
            @Override
            public boolean disposable() {
                System.out.println("我是匿名类");
                return false;
            }
        };//必须加分号！！！！！！

        System.out.println(i.disposable());
    }
}
