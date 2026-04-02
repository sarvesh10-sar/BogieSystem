import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        // Create large dataset for testing
        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Bogie" + i, (i % 100) + 20));
        }

        // ---------------- LOOP METHOD ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM METHOD ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- OUTPUT ----------------
        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // Optional comparison
        if (loopTime < streamTime) {
            System.out.println("Loop is faster ⚡");
        } else {
            System.out.println("Stream is faster ⚡");
        }
    }
}