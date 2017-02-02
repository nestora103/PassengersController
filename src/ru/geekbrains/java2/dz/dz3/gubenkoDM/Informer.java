package ru.geekbrains.java2.dz.dz3.gubenkoDM;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Nestor on 01.12.2016.
 */
public class Informer {
    private Map<Integer,List<Passenger>> table= new TreeMap();
    private List<Passenger> passengers;

    public Map<Integer, List<Passenger>> getTable() {
        return table;
    }

    public void setTable(Map<Integer, List<Passenger>> table) {
        this.table = table;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Informer(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void inform(){
        for (Passenger passeng:getPassengers()) {
            table.put(passeng.getAeroFlightNum(),getPassengers());
        }
        System.out.println("Информационное табло:");
        for (Map.Entry<Integer,List<Passenger>> entry:getTable().entrySet()) {
            int aeroNum=entry.getKey();
            System.out.println("Номер авиарейса: "+aeroNum);
            int flyPasNum=0;
            for (Passenger pas:getPassengers()) {
                if (pas.getAeroFlightNum()==aeroNum){
                    System.out.println("Имя пассажира: "+pas.getName()+".".concat(" Номер паспорта пассажира: ".
                            concat(String.valueOf(pas.getPassportNum())).concat(".")));
                    flyPasNum++;
                }
            }
            System.out.println("Список пассажиров на борту самолета: "+flyPasNum);
            System.out.println("");
        }
        System.out.println("Спасибо за внимание!");
    }
}
