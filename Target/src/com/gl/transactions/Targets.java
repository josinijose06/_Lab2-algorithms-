package com.gl.transactions;

import java.util.Scanner;

public class Targets {
	public static  void main (String[] args)throws Exception{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the transaction count");
		int size=sc.nextInt(); //size=3
		int arr[]=new int [size];// array size= 3,0,1,2
		System.out.println("enter the value");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the target value");
		int targetNo=sc.nextInt();
		while(targetNo-- !=0) {
			int flag=0;
			long target;
			
			
			System.out.println("Enter total target value");
			target=sc.nextInt();
			
			long sum = 0;
			for(int i=0;i<size;i++) {
				sum +=arr[i];
				
				if(sum>=target) {
					System.out.println("Target reached");
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.println("Target not reached !!");
			}
		}
		}

}
