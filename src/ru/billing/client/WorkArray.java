package ru.billing.client;

public class WorkArray <T extends Number> {
    public T[] arrNums;

    public WorkArray(T[] numP) {
        arrNums = numP;
    }

    public double sum() {
        double doubleWork = 0;
        for (T val: arrNums) {
            doubleWork += val.doubleValue();
        }
        return doubleWork;
    }
}
