import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));

        // Stream + map + reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // Display result
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}