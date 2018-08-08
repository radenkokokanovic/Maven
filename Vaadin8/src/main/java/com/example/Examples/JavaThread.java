package com.example.Examples;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaThread 
{
	public static 	int  i=0;
	public static void main(String[] args) 
	{
		
		ExecutorService  exe=Executors.newFixedThreadPool(10);
		
	//IZMJENE U PICKU MATERINU VISE I OVAJ GIT STO NAS JEBE
		exe.execute(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				i++;
				System.out.println("Pozdrav Nemanja");
				System.out.println(i);
				
			}//end run
		});//end runnable
		exe.execute(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				i++;
				System.out.println("Pozdrav Nemanja");
				System.out.println(i);
				
			}//end run
		});//end runnable
		exe.execute(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				i++;
				System.out.println("Pozdrav Nemanja");
				System.out.println(i);
				
			}//end run
		});//end runnable
		exe.execute(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				i++;
				System.out.println("Pozdrav Nemanja");
				System.out.println(i);
				
			}//end run
		});//end runnable
		exe.execute(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				i++;
				System.out.println("Pozdrav Nemanja");
				System.out.println(i);
				
			}//end run
		});//end runnable
		exe.shutdown();
	}//end main
}//end class
