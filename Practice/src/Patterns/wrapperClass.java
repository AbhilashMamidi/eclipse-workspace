package Patterns;

import java.util.Scanner;
public class wrapperClass 
{
    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("Enter First Array Size");
    int size1=scan.nextInt();
    int a1[]=new int[size1];
    System.out.println("Enter First Array Elements");
     
    for(int i=0;i<=a1.length-1;i++) {
   	 a1[i]=scan.nextInt();
    }
    System.out.println("Enter Second  Array Size");
    int size2=scan.nextInt();
    int a2[]=new int[size2];
    System.out.println("Enter Second Array Elements");
     
    for(int j=0;j<=a2.length-1;j++) {
   	 a2[j]=scan.nextInt();
    }
    
    int size3=a1.length+a2.length;
    int a3[]=new int[size3];
    
    for(int i=0;i<=a1.length-1;i++) {
    	a3[i]=a1[i];
    }
    int index=a1.length;
    for(int i=0;i<=a2.length-1;i++) {
    	a3[index]=a2[i];
    	index++;
    }
    System.out.println("Merged array smallest elements is");
    int smallest=a3[0];
    for(int k=0;k<=a3.length-1;k++) {
    
      if(a3[k]<smallest) {
    	  smallest=a3[k];
      }
    }
      System.out.println(smallest);
    
    
    
    
    
    
}
}
