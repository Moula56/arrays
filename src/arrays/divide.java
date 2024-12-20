package arrays;
import java.util.Scanner;
public class divide {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i=0,j=0;
System.out.println("enter the number of values");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the number of values");
for(i=0;i<n;i++) {
		arr[i]=sc.nextInt();
}
int temp[]=new int[n];
for (i=0;i<n;i++) {
      if(arr[i]==1) {
    	  temp[j]=1;
    	  j++;
      }
}
for(int k:temp) {
	System.out.println(k);
}
//System.out.println(temp[j]);
}
}