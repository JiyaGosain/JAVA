import java.util.Scanner;
class Pyramid{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int n=5;
for(int i=1;i<=n;i++){
//print spaces
for(int k=i;k<=n;k++){
System.out.print(" ");
}
for(int j=1;j<=(2*i-1);j++){
System.out.print("*");
}
System.out.println();
}
}
}