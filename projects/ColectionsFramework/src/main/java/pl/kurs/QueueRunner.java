package pl.kurs;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueRunner {

    public static void main(String[] args) {

        //implementacja kolejek

        //Najważniejsze metody kolejek:
        //•	offer(E e) – dodaje element do kolejki (zamiennie add());
        //•	peek() – pobiera element z kolejki ale go z niej nie usuwa;
        //•	poll() – pobiera element z kolejki i go z niej usuwa;

        //LinkedList jako kolejka dwukierunkowa
//        Deque<Task> tasks = new LinkedList<>();
//        tasks.offer(new Task("Wynieść śmieci", 4));
//        tasks.offer(new Task("Popracować na komputerze", 1));
//        tasks.offer(new Task("Rozpisać plan zajęć", 2));
//        tasks.offer(new Task("Wyczyścić kuwetkę kota", 3));
//
//        System.out.println("-----------------------------------");
//        System.out.println("Zadania:");
//        tasks.forEach(System.out::println);
//
//
//        System.out.println("-----------------------------------");
//        System.out.println("Pobieranie zadań:");
//        System.out.println(tasks.poll());
//        System.out.println(tasks.poll());
//        System.out.println(tasks.poll());
//
//        System.out.println("-----------------------------------");
//        System.out.println("Zadania, które pozostały:");
//        tasks.forEach(System.out::println);


        //ArrayBlockingQueue
//        Queue<Task> tasks = new ArrayBlockingQueue<>(3);
//        tasks.offer(new Task("Wynieść śmieci", 4));
//        tasks.add(new Task("Popracować na komputerze", 1));
//        tasks.add(new Task("Rozpisać plan zajęć", 2));
//       // tasks.add(new Task("Wyczyścić kuwetkę kota", 3)); //metoda add (w przeciwieństwie do offer) rzuci wyjątek, jeżeli chcemy dodać zadanie, które się już nie zmieści.
//
//        System.out.println("-----------------------------------");
//        System.out.println("Zadania:");
//        tasks.forEach(System.out::println);

        //PriorityQueue
        Queue<Task> tasks = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return -Integer.compare(o1.getPriority(), o2.getPriority());
            }
        });
        tasks.offer(new Task("Wynieść śmieci", 4));
        tasks.offer(new Task("Popracować na komputerze", 1));
        tasks.offer(new Task("Rozpisać plan zajęć", 2));
        tasks.offer(new Task("Wyczyścić kuwetkę kota", 3));

        System.out.println("-----------------------------------");
        System.out.println("Zadania:");
        tasks.forEach(System.out::println);


        System.out.println("-----------------------------------");
        System.out.println("Pobieranie zadań:");
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());

        System.out.println("-----------------------------------");
        System.out.println("Zadania, które pozostały:");
        tasks.forEach(System.out::println);


    }
}
