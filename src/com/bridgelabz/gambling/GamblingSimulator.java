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
		int betresult = rad.nextInt(2);
	//	System.out.println("Betresult "+betresult);
		int remainingstake;
		
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

	}

}
