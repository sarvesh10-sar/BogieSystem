import java.util.*;
import java.util.stream.*;

// Bogie Class
class Bogie {
    private int id;
    private String type;
    private int capacity;

    public Bogie(int id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return "Bogie ID: " + id + ", Type: " + type + ", Capacity: " + capacity;
    }
}

// Main
public class Main {
    public static void main(String[] args) {

        // UC7 data (list of bogies)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, "Sleeper", 72));
        bogies.add(new Bogie(2, "AC", 50));
        bogies.add(new Bogie(3, "General", 90));
        bogies.add(new Bogie(4, "Chair Car", 60));

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // UC8: Stream + Filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)   // condition
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);
    }
}