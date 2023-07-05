package model;

public abstract class Goods {
    private final String prefixId;
    protected int count;
    protected String id;
    private static int COUNTER;

    public Goods(String prefixId, int count) {
        this.prefixId = prefixId;
        this.count = count;
        this.id = prefixId + "-" + COUNTER;
    }

    public String getPrefixId() {
        return prefixId;
    }

    public int getCount() {
        return count;
    }


    public static int getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(int COUNTER) {
        Goods.COUNTER = COUNTER;
    }

    @Override
    public String toString() {
        return "Goods{" +
                ", id='" + id + '\'' +
                ", count=" + count +
                '}';
    }
}
