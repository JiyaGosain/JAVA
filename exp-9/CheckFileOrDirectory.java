import java.io.File;
import java.util.Scanner;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
    System.out.println("Jiya Gosain, 24csu313");
        Scanner sc = new Scanner(System.in);
        
        
        
        File f = new File("D:\\java_NCU\\exp-9");
        
        if (f.exists()) 
        {
            if (f.isFile()) 
            {
                System.out.println("The path refers to a FILE.");
            } else if (f.isDirectory()) {
                System.out.println("The path refers to a DIRECTORY.");
            }
        } else 
        {
            System.out.println("The specified path does not exist.");
        }
        
        sc.close();
    }
}
