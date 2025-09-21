import java.util.Scanner;

class FtoC {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Jiya Gosain, 24csu313");


        System.out.println("Enter the temperature in Fahrenheit: ");
      float f=sc.nextFloat();
        float c=(f-32)*5f/9f;
        System.out.println(f + " in Celsius is: " + c);
    }
}