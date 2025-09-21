import java.util.Scanner;

class VCcheck {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jiya Gosain, 24csu313");

        System.out.print("Enter a character: ");
        char ch = scan.next().toLowerCase().charAt(0);

        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " is a vowel.");
            } else {
                System.out.print(ch + " is a consonant.");
            }
        } else {
            System.out.print("Invalid input. Please enter an alphabet.");
        }

        scan.close();
}
}