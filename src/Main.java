import java.util.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
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

        // Sort using Comparator (Lambda)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Sorted Bogies by Capacity:");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}