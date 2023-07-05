package model;

public class Fruit extends Food{
    public Fruit( int count, int expireDurationInSeconds) {
        super("fruit", count, 45);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                ", id='" + id + '\'' +
                ", count=" + count +
                "addedTimeInSeconds=" + addedTimeInSeconds +
                ", expireDurationInSeconds=" + expireDurationInSeconds +
                '}';
    }
}
