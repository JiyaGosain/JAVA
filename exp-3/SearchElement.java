import java.util.Scanner;
public class SearchElement{
static Scanner scan= new Scanner(System.in);

public static void main(String[] args) 
{
System.out.println("Jiya Gosain, 24csu313");
System.out.print("Enter the limit: ");
int n = scan.nextInt();
int arr[] = new int[n];
System.out.print("Enter the elements in the array: ");
for (int i = 0; i < n; i++) {
arr[i] = scan.nextInt();
}
System.out.print("Enter the element to search: ");
int a = scan.nextInt();
boolean found = false;
for (int i = 0; i < arr.length; i++) 
{
if (arr[i] == a) 
{
System.out.println("Element found at index: " + i);
found = true;
break;
}
}
if (!found)
System.out.println("Element not found in the array");
}
}