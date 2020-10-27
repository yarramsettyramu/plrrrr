package exercise;

import java.util.Scanner;

public class Compare {
	 
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i, l;
		System.out.println("Enter a two numbers ");
		i=s.nextInt(); l=s.nextInt();
		if(i!=l)
			System.out.println("i not equal to l");
		if(i<l)
			System.out.println("i less than l");
		if(i<=l)
			System.out.println("i less than equalto l");
	}

}
