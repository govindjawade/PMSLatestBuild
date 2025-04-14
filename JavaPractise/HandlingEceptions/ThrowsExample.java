package JavaPractise.HandlingEceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
    public static void readFile() throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner sc = new Scanner(file);
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

