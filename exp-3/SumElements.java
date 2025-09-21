import java.util.Scanner;

class SumElements{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Jiya Gosain, 24csu313");
System.out.print("Enter the size of array: ");
int n=sc.nextInt();

int[] arr=new int[n];

System.out.print("Enter element" + ": ");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int sumall=0;
int sumalternate=0;

for(int i=0;i<n;i++){
sumall+=arr[i];
if(i%2==0){
sumalternate+=arr[i];
}
}
System.out.println("Sum of all elements: "+ sumall);
System.out.print("Sum of alternate elements: "+ sumalternate);
}
}







