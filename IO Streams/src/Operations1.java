import java.io.*;
import java.util.Scanner;

public class Operations1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the filename from the user
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        // Get the character to be counted
        System.out.println("Enter the character to be counted:");
        char targetChar = scanner.nextLine().toLowerCase().charAt(0);

        int count = 0;

        try {
            // Read file character by character
            FileReader reader = new FileReader(fileName);
            int ch;

            while ((ch = reader.read()) != -1) {
                char currentChar = Character.toLowerCase((char) ch);
                if (currentChar == targetChar) {
                    count++;
                }
            }

            reader.close();

            System.out.println("File '" + fileName + "' has " + count +
                    " instances of letter '" + targetChar + "'.");

        } catch (FileNotFoundException e) {
            System.out.println("File '" + fileName + "' not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
