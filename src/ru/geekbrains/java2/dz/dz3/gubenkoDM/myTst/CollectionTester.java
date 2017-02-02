package ru.geekbrains.java2.dz.dz3.gubenkoDM.myTst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by DmitriX on 30.11.2016.
 */
public class CollectionTester {
    public static void main(String[] args) {
        //динамический массив ArrayList
        //new CollectionTester().arrayListTester();
        //связный список LinkedList
        //new CollectionTester().linkedListTester();
        //коллекция с использованием хэштаблицы без сохранения порядка внесения элементов
        //new CollectionTester().hashSetTester();
        //коллекция с использованием хэштаблицы c сохранением порядка внесения элементов, тоесть при извлечении итератором элементы будут идти
        //друг за другом как и вносились
        //new CollectionTester().linkedHashSet();

    }

    private void linkedHashSet() {
        //создаем пустое множество на основе hash таблицы. Элементы в этом множестве не могут повторяться.
        //послекдовательность сохраниться
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("A");
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        lhs.add("G");

        //последовательность не обязательно сохраниться
        HashSet<String> hs=new HashSet<>();
        hs.add("A");
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        hs.add("G");

        System.out.println(lhs.toString());
        System.out.println(hs.toString());
    }

    private void hashSetTester() {
        //создаем пустое множество на основе hash таблицы. Элементы в этом множестве не могут повторяться.
        HashSet<String> hs=new HashSet<>();
        hs.add("A");
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");

        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("X");
        arrayList2.add("С");
        //создаем  множество на основе hash таблицы. Элементы в этом множестве не могут повторяться.
        HashSet<String> hs1=new HashSet<>(arrayList2);
        hs1.add("A");
        hs1.add("A");
        hs1.add("B");
        hs1.add("C");
        hs1.add("D");
        //методы remove и removeAll работают аналогично варианта с ArrayList и linkedList
        hs1.remove("D");
        hs1.removeAll(hs);
        //размерность множества
        int size=hs1.size();
        //проверяем присутствует ли объект или примитив в хэш множестве
        Boolean b=hs1.contains("B");
        Boolean b1=hs1.contains("L");
        System.out.println();
    }

    private void linkedListTester() {
        //создание пустого связного списка
        //LinkedList<String> linkedList=new LinkedList<>();
        //создание  связнаго списка из содержимого переданной ему коллекции
        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("X");
        arrayList2.add("С");
        LinkedList<String> linkedList=new LinkedList<>(arrayList2);
        //добавление элементов в конец списка
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("B");
        //добавление элемента по индексу нумерация 0
        linkedList.add(2,"L");
        //добавление элемента в начало списка 2 варианта
        linkedList.addFirst("XF");
        linkedList.offerFirst("XOF");
        //добавление элементов в конец списка 2 варианта
        linkedList.addLast("XL");
        linkedList.offerLast("XOL");
        //удаление первого элемента из списка 2 варианта
        linkedList.removeFirst();
        linkedList.pollFirst();
        //удаление последнего элемента из списка 2 варианта
        linkedList.removeLast();
        linkedList.pollLast();
        //получение первого элемента из списка 2 варианта
        String strStr=new String(linkedList.getFirst());
        String strStr1=new String(linkedList.peekFirst());
        //получение последнего элемента из списка 2 варианта
        String strStr2=new String(linkedList.getLast());
        String strStr3=new String(linkedList.peekLast());

        //удаление первого элемента из списка
        linkedList.remove();
        //удаление первого попавшегося переданного объекта из связного списка
        linkedList.remove("A");
        //удаление элемента из списка под переданным индексом. Индексация с 0.
        linkedList.remove(2);

        //получение элемента из списка по переданному индексу
        linkedList.get(1);
        //установка элемента из списка по переданному индексу плюс передается нужное значение
        linkedList.set(1,"K");

        System.out.println("");
    }

    private void arrayListTester(){
        //создание пустого спискового массива
        //ArrayList<String> arrayList=new ArrayList<>();
        ArrayList<String> arrayList=new ArrayList<>();
        //добавление элемента в конец
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("X");
        arrayList.add("С");
        arrayList.add("С");
        arrayList.add("M");
        arrayList.add("MMM");
        //добавление элемента по индексу, нумерация элементов с 0
        arrayList.add(1,"X");
        //удаление элемента по индексу
        arrayList.remove(2);
        //удаление объекта из коллекции первого найденного от начала.
        //arrayList.remove("X");
        //удаление из ArrayList всех совпадающих элементов которые есть в переданной коллекции
        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("X");
        arrayList2.add("С");
        arrayList.removeAll(arrayList2);
        //создание массива размерности Коллекции
        String[] strArr=new String[arrayList.size()];
        //запись коллекции в массив
        strArr=arrayList.toArray(strArr);
        //arrayList.ensureCapacity(1);
        System.out.println("");
    }
}
