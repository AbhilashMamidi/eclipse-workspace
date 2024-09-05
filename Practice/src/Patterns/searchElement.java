package Patterns;

import java.util.Scanner;

public class searchElement {
  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter size of an array");
	int size=scan.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the array Elements");
	for(int i=0;i<=a.length-1;i++) {
		a[i]=scan.nextInt();
	}
	int largest1=a[0];
	int largest2=a[1];
	int temp=0;
	if(largest2>largest1) {
		temp=largest1;
		largest1=largest2;
		largest2=temp;
	}
	for(int i=2;i<=a.length-1;i++) {
		if(a[i]>largest1) {
			largest2=largest1;
			largest1=a[i];
		}
		else if(a[i]>largest2&&a[i]!=largest1){
			largest2=a[i];
		}
	}
	System.out.println(largest1);
	System.out.println(largest2);
}
}
