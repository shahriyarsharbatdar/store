package model;

public class Vegetable extends Food{
    public Vegetable(int count) {
        super("vegetable", count, 30);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                ", id='" + id + '\'' +
                ", count=" + count +
                "addedTimeInSeconds=" + addedTimeInSeconds +
                ", expireDurationInSeconds=" + expireDurationInSeconds +
                '}';
    }
}
