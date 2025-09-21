import java.util.Scanner;

class array_minmax{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Jiya Gosain, 24csu313");
System.out.print("Enter the size of array: ");
int n=sc.nextInt();

int arr[]=new int[n];

System.out.println("Enter " + n + " elements: ");
for(int i=0;i<n;i++)
{
arr[i] =sc.nextInt();
}

//Display elements
System.out.println("Array elements: ");
System.out.print("{");
for(int i=0;i<n;i++)
{

System.out.print(arr[i] +" ");
}
System.out.println("}");

//Find max and min
int max = arr[0];
int min = arr[0];
for(int i=1;i<n;i++)
{
if(arr[i]>max)
max=arr[i];
if(arr[i]<min)
min=arr[i];
}


System.out.println("Maximum element: "+max);
System.out.print("Minimum element: "+min);
}
}











