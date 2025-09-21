import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Jiya Gosain, 24csu313");
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter values in array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
		}
		int oddC=0,evenC=0;
		for(int i=0;i<n;i++){
			if(arr[i]%2==0)
				evenC++;
			else
				oddC++;
		}
		int EvenArray[] = new int[evenC];
		int OddArray[] = new int[oddC]; int m=0;int p=0;
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				EvenArray[m]=arr[i];
			    m++;
			}
			else{
				OddArray[p]=arr[i];
				p++;
			}
			}
			System.out.print("Original Array: ");
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			System.out.print("\nOriginal Array Length: "+n);

			System.out.print("\n\nEven Array: ");
			for(int i=0;i<evenC;i++)
				System.out.print(EvenArray[i]+" ");
			System.out.print("\nEven Array Length: "+evenC);

			System.out.print("\n\nOdd Array: ");
			for(int i=0;i<oddC;i++)
				System.out.print(OddArray[i]+" ");
			System.out.print("\nOdd Array Length: "+oddC);
		}
	}