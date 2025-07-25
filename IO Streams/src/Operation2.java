import java.io.*;
import java.util.Scanner;

public class Operation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input file name
        System.out.println("Enter the input file name");
        String inputFileName = scanner.nextLine();

        // Get output file name
        System.out.println("Enter the output file name");
        String outputFileName = scanner.nextLine();

        try (
            FileInputStream fis = new FileInputStream(inputFileName);
            FileOutputStream fos = new FileOutputStream(outputFileName)
        ) {
            int byteData;
            // Copy byte by byte
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File is copied.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error during file operation: " + e.getMessage());
        }
    }
}
