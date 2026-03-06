import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        File animalFile = new File("arrivingAnimals.txt");
        ArrayList<Animal> myZoo = new ArrayList<>();
        HashMap<String, Integer> speciesCount = new HashMap<>();

        try {
            Scanner scanner = new Scanner(animalFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                int age = Integer.parseInt(parts[0].trim().split(" ")[0]);

                if (line.toLowerCase().contains("hyena")) {
                    myZoo.add(new Hyena("Unknown", age, "hyena", "laugh"));
                    speciesCount.put("hyena", speciesCount.getOrDefault("hyena", 0) + 1);
                } else if (line.toLowerCase().contains("lion")) {
                    myZoo.add(new Lion("Unknown", age, "lion", "roar"));
                    speciesCount.put("lion", speciesCount.getOrDefault("lion", 0) + 1);
                } else if (line.toLowerCase().contains("tiger")) {
                    myZoo.add(new Tiger("Unknown", age, "tiger", "stripes"));
                    speciesCount.put("tiger", speciesCount.getOrDefault("tiger", 0) + 1);
                } else if (line.toLowerCase().contains("bear")) {
                    myZoo.add(new Bear("Unknown", age, "bear", "habitat"));
                    speciesCount.put("bear", speciesCount.getOrDefault("bear", 0) + 1);
                }
            }
            scanner.close();

            // Create the report file
            PrintWriter writer = new PrintWriter("newAnimals.txt");
            writer.println("Total animals in my zoo: " + myZoo.size());

            for (Animal a : myZoo) {
                writer.println("Animal: " + a.getSpecies() + " | Age: " + a.getAge());
            }

            writer.println("\n--- Species Report ---");
            for (String species : speciesCount.keySet()) {
                writer.println(species + ": " + speciesCount.get(species));
            }
            writer.close(); // IMPORTANT: This saves the file to your folder!

            System.out.println("Success! Your report is saved in 'newAnimals.txt'.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found! Make sure 'arrivingAnimals.txt' is in your project folder.");
        }
    }
}