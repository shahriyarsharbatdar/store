package model;

public class NonFood extends Goods {
    public NonFood(int count) {
        super("nonFood", count);
    }

    @Override
    public String toString() {
        return "NonFood{" +
                "count=" + count +
                ", id='" + id + '\'' +
                '}';
    }
}
