package com.pack;
import java.util.Scanner;
public class Shapes {
	static Scanner sc=new Scanner(System.in);
	static void getshapesize(int size) {
		System.out.println("GOOD BYE...");
		System.exit(0);
		}
	static void  printopensquare(int size) {
		if (size%2!=0)
		{
		for (int i = 1; i < size; i++ ) 
		{
			for (int j = 1 ; j < size; j++ ) 
			{
				if (i == 1 || i == size - 1 || j == 1 || j == size - 1) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}
		else {
			System.out.println("PLEASE RE-ENTER ODD NUMBER ONLY...");
		}	
		}
	static void  printclosedsquare(int size) {
		if (size%2!=0)
		{
			for(int i = 1; i <= size; i++)
			{
				for(int j = 1; j <= size; j++)
				{
					System.out.print("*"); 
				}
				System.out.print("\n"); 
			}	
		}
		else {
			System.out.println("PLEASE RE-ENTER ODD NUMBER ONLY...");
		}	
		}
	static  void diamond(int size) {
		if (size%2!=0) {
			int i=1;
			int j; 
			do 
			{
			j=1;
			do
			{
			System.out.print(" ");
			 
			}while(++j<=size-i+1); 
			j=1;
			do
			{
			System.out.print("*");
			 
			}while(++j<=i*2-1); 
			System.out.println();
			} while(++i<=size); 
			i=size-1; 
			do 
			{
			j=1;
			do
			{
			System.out.print(" ");
			 
			}while(++j<=size-i+1); 
			j=1;
			do
			{
			System.out.print("*");
			 
			}while(++j<=i*2-1); 
			 
			System.out.println(); 
			 
			} while(--i>0);
		}
		else {
			System.out.println("PLEASE RE-ENTER ODD NUMBER ONLY...");
		}
		}
public static void main(String[] args) {
		System.out.println("PLEASE ENTER YOUR OPTION...");
		int input=sc.nextInt();
		switch (input){
		case 1:System.out.println("PLEASE SELECT ODD NUMBER...");
		printclosedsquare(sc.nextInt());
		break;
		case 2:System.out.println("PLEASE SELECT ODD NUMBER...");
		printopensquare(sc.nextInt());
		break;
		case 3:System.out.println("PLEASE SELECT ODD NUMBER...");
		diamond(sc.nextInt());
		break;
		case 4:getshapesize(0);
		default:System.out.println("SORRY YOUR SELECTED OPTION IS NOT IN THE LIST...");
			}
	     }
     }
