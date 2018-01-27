package com.example.Examples;

public class Rekurzija
{
	
	public static void main(String[] args) 
	{
		System.out.println(fact(5));
	}
	public static long fact (long n)
	{
		if (n<=1)
		{
			return 1;
		}else
		{
			System.out.println("vrijednost ne je "+n);
			System.out.println(n* fact(n-1));
			return n* fact(n-1);
		}
	}

}
