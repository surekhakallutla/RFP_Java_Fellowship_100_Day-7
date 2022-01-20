package com.bridgelabz.gambling;

import java.util.Random;
import java.util.Scanner;

public class GamblingSimulator {

	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator Program");
		
		final int startstake = 100;
		final int bet = 1;
		int stake = 100;
		Scanner scn = new Scanner(System.in);
		Random rad = new Random();
			
		int remainingstake;
		int arrays[] = new int[20];
		int days, i;
		
		for(days = 0; days < 20; days++)
		{
			for(i = 1; i <= 50; i++)
			{
				if(stake > 50)
				{
					int betresult = rad.nextInt(2);
					System.out.println("Betresult "+betresult);
					if(betresult == 1)
					{
						System.out.println("The Gambler won the bet");
						 remainingstake = stake + bet ;
						 System.out.println("The Stake after Winning the bet is "+remainingstake);
					}
					else
					{
						System.out.println("The Gambler lost the bet");
						 remainingstake = stake - bet;
						 System.out.println("The Stake after Loosing the bet is "+remainingstake);
					}
					stake = remainingstake;
				}
				
			}
			arrays[days] = stake;
			System.out.println("The final Stake after Gabling for the day is "+arrays[days]);
		}
		
		for(days = 0; days< 20; days++)
		{
			int Day = days + 1;
			System.out.println("The final Stake after Gabling for the day "+ Day +" is "+arrays[days]);	
			System.out.println("arrays[days] = "+arrays[days]);
		}
		
	}

}
