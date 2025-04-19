package JavaPractise.HandlingEceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleThrowsExample {

    public static void readFile(String filename) throws FileNotFoundException, IOException {
        File file = new File(filename);

        // This will throw FileNotFoundException if the file is not found
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();

        // Manually throw IOException to show multiple exceptions
        if (filename.isEmpty()) {
            throw new IOException("Filename cannot be empty!");
        }
    }

    public static void main(String[] args) {
        try {
            readFile("myfile.txt");  // Change filename to test
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}