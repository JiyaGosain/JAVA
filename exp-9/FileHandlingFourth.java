import java.io.*;
import java.util.*;

public class FileHandlingFourth {
    public static void main(String[] args) {
        System.out.println("Jiya Gosain, 24csu313");
        Scanner sc = new Scanner(System.in);

        String filePath = "D:\\java_NCU\\exp-9\\students.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details of student " + (i + 1) + ":");
                System.out.print("Serial No: ");
                int sno = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("First Name: ");
                String name = sc.nextLine();
                System.out.print("CGPA: ");
                float cgpa = sc.nextFloat();
                System.out.print("Grade: ");
                char grade = sc.next().charAt(0);

                bw.write(sno + " " + name + " " + cgpa + " " + grade);
                bw.newLine();
            }

            System.out.println("\nData successfully written to file: " + filePath);
        } 
        catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        System.out.println("\n--- Reading Data from File ---");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }

        sc.close();
    }
}
