package javaders.day31collectionmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {

    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line); //[Egg, Milk, Meat, Orange, Tomatoes]

        //Elemanlari verdigimiz siraya gore dizmedi cunku constructer'i PriorityQueue'den aldi.
        //Java belirledigi oncelige gore siraladi.

        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomateos");

        //Deque ==> Iki uclu "Queue" demek. fifo ve lifo dur. queue'den daha avantajlidir.
        //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur



    }
}
