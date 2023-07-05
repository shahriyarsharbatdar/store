package model;

public class NonFood extends Goods {
    public NonFood(int count, String id) {
        super("nonFood", count, id);
    }

    @Override
    public String toString() {
        return "NonFood{" +
                "count=" + count +
                ", id='" + id + '\'' +
                '}';
    }
}
