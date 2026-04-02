import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;
    String type; // New field for grouping

    // Constructor
    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    // Display method
    void display() {
        System.out.println(name + " - Capacity: " + capacity + " - Type: " + type);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72, "Non-AC"));
        bogies.add(new Bogie("General", 90, "Non-AC"));
        bogies.add(new Bogie("AC Chair", 60, "AC"));
        bogies.add(new Bogie("First Class", 40, "AC"));
        bogies.add(new Bogie("Second Sitting", 80, "Non-AC"));

        // Group using Stream API
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        // Display grouped bogies
        System.out.println("Grouped Bogies by Type:");
        for (String type : groupedBogies.keySet()) {
            System.out.println("\nType: " + type);
            for (Bogie b : groupedBogies.get(type)) {
                b.display();
            }
        }
    }
}