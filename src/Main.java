import java.util.*;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor with validation
    Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0!");
        }
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        try {
            // Valid bogies
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));

            // Invalid bogie (will throw exception)
            bogies.add(new Bogie("Invalid Bogie", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}