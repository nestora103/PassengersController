package ru.geekbrains.java2.dz.dz3.gubenkoDM;

import java.util.*;

/**
 * Created by Nestor on 01.12.2016.
 */
public class Controller {
    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    private List<Passenger> passengers=new ArrayList<>();

    public List<Passenger> join(){
        //ввод пассажиров
        Scanner sc=new Scanner(System.in);
        int pMum=1;
        System.out.println("Вас приветствует программа для рассадки пассажиров!");
        System.out.println("Заполните данные регистрации пассажиров!");
        while(true){
            System.out.println("# пассажира при вводе: ".concat(String.valueOf(pMum)));
            System.out.println("Введите имя пассажира!");
            String name=sc.nextLine();
            System.out.println("Введите номер паспорта пассажира!");
            long paspNum;
            try {
                paspNum=sc.nextLong();
            }catch (Exception e){
                System.out.println("Ошибка ввода!");
                paspNum=0;
            }
            sc.nextLine();
            System.out.println("Введите номер рейса!");
            //String aeroNum=sc.nextLine();
            int aeroNum;
            try{
                aeroNum=sc.nextInt();
            }catch (Exception e){
                System.out.println("Ошибка ввода!");
                aeroNum=0;
            }

            sc.nextLine();
            System.out.println("Для прекращения регистрации пассажиров введите \"Выход\"");
            //добавляем пассажира в список пассажиров
            getPassengers().add(new Passenger(name,paspNum,aeroNum));
            String opr=new String(sc.nextLine());
            if (opr.equals("Выход")||(opr.equals("выход"))){
                break;
            }
            pMum++;
        }

        //отсортируем коллекцию пассажиров по имени
        Collections.sort(getPassengers(),
                new Comparator<Passenger>() {
                    public int compare(final Passenger e1, final Passenger e2) {
                        return e1.getName().compareTo(e2.getName());
                    }
                }
        );

        return getPassengers();
    }
}
