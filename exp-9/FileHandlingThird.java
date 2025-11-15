import java.io.*;

public class FileHandlingThird {
    public static void main(String[] args) {
        System.out.println("Jiya Gosain, 24csu313");

        File file = new File("D:\\java_NCU\\exp-9\\sample.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("This message is written using the write() method.");
            System.out.println("Data is added to file successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nReading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
