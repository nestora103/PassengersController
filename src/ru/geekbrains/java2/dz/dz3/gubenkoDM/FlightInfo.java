package ru.geekbrains.java2.dz.dz3.gubenkoDM;

/**
 * Created by Nestor on 30.11.2016.
 */
public class FlightInfo {
   public static void main(String[] args) {
       //создаем контроллера регистрации пассажиров, который формирует список пассажиров отсортированных по имени
       //в алфавитном порядке и передает их информеру который отображает результаты на авиатабло
       // по номерам авиарейсов по возрастанию
       new Informer(new Controller().join()).inform();
   }
}
