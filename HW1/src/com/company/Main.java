package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please Enter n :");
	int n=input.nextInt();
	System.out.println("Result : ");
	for (int i=1;i<=n;i++)
    {
        System.out.print(3+" * "+i+" = ");
        System.out.println(i*3);
    }
    }
}
