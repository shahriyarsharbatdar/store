package model;

import util.TimeUtility;

public abstract class Food extends Goods {
    protected final long addedTimeInSeconds;
    protected final int expireDurationInSeconds;

    public Food(String prefixId, int count, int expireDurationInSeconds) {
        super("F" + prefixId, count);
        this.addedTimeInSeconds = TimeUtility.addTime();
        this.expireDurationInSeconds = expireDurationInSeconds;
    }

    boolean isExpire(){
        return TimeUtility.addTime() - addedTimeInSeconds >= expireDurationInSeconds;
    }

    @Override
    public String toString() {
        return "Food{" +
                ", id='" + id + '\'' +
                ", count=" + count +
                "addedTimeInSeconds=" + addedTimeInSeconds +
                ", expireDurationInSeconds=" + expireDurationInSeconds +
                '}';
    }
}
