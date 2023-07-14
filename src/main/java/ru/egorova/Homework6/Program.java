package ru.egorova.Homework6;

import java.util.HashSet;

public class Program {

    public static void main(String[] args) {
        Cat cat = new Cat();
        HashSet<Cat> hashSet = new HashSet<>();
        task1(cat,hashSet);
        task2(cat,hashSet);
        System.out.println("3.  " + new Cat("cat3", "maine coon").equals(new Cat("cat3", "maine coon")));
        System.out.println("4. " + new Cat("cat1", "siamese").hashCode());
        System.out.println("4. " + new Cat("cat2", "russian blue").hashCode());
        System.out.println("4. " + new Cat("cat3", "maine coon").hashCode());
        task2(cat,hashSet);
    }
    /*
    Задание

    1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
        Поместите в него некоторое количество объектов.
    2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
        Убедитесь, что все они сохранились во множество.

    3.Создайте метод
        public boolean equals(Object o)
        Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
        То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.

    4. Создайте метод
        public int hashCode()
        который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))

    5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
     */
    public static void task1(Cat cat, HashSet<Cat> hashSet){
        hashSet.add(new Cat("cat1", "siamese"));
        hashSet.add(new Cat("cat2", "russian blue"));
        hashSet.add(new Cat("cat3", "maine coon"));
        System.out.println("1.  " + hashSet);
    }

    public static void task2(Cat cat, HashSet<Cat> hashSet){
        hashSet.add(new Cat("cat1", "siamese"));
        hashSet.add(new Cat("cat2", "russian blue"));
        hashSet.add(new Cat("cat3", "maine coon"));
        System.out.println("2    " + hashSet);
    }


}
