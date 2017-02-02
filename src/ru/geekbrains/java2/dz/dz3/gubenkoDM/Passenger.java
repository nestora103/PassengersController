package ru.geekbrains.java2.dz.dz3.gubenkoDM;

/**
 * Created by Nestor on 30.11.2016.
 */
public class Passenger {
    private String name;
    private long passportNum;
    private int aeroFlightNum;

    public Passenger(String name, long passportNum, int aeroFlightNum) {
        this.name = name;
        this.passportNum = passportNum;
        this.aeroFlightNum = aeroFlightNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(long passportNum) {
        this.passportNum = passportNum;
    }

    public int getAeroFlightNum() {
        return aeroFlightNum;
    }

    public void setAeroFlightNum(int aeroFlightNum) {
        this.aeroFlightNum = aeroFlightNum;
    }
}
