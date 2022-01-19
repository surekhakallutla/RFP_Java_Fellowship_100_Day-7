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
		
	//	System.out.println("Betresult "+betresult);
		int remainingstake;
		while(stake > 50)
		{
			int betresult = rad.nextInt(2);
			if(betresult == 1)
			{
				System.out.println("The Gambler won the bet");
				 remainingstake = stake + bet ;
				 stake = remainingstake;
				 System.out.println("The Stake after Winning the bet is "+stake);
			}
			else
			{
				System.out.println("The Gambler lost the bet");
				 remainingstake = stake - bet;
				 stake = remainingstake;
				 System.out.println("The Stake after Loosing the bet is "+stake);
			}

		}
		
	}

}
