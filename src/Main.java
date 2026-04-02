import java.util.*;

class Bogie {
    String type;   // Cylindrical / Box
    String cargo;  // Petroleum / Coal / Goods

    // Constructor
    Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    void display() {
        System.out.println("Type: " + type + ", Cargo: " + cargo);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create list of goods bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Cylindrical", "Petroleum"));
        bogies.add(new Bogie("Box", "Coal"));
        bogies.add(new Bogie("Box", "Goods"));
        bogies.add(new Bogie("Cylindrical", "Petroleum"));

        // Safety Check using allMatch()
        boolean isSafe = bogies.stream().allMatch(b ->
                (b.type.equals("Cylindrical") && b.cargo.equals("Petroleum")) ||
                        (!b.type.equals("Cylindrical"))
        );

        // Display bogies
        System.out.println("Bogie Details:");
        for (Bogie b : bogies) {
            b.display();
        }

        // Result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }
    }
}