package com.helloproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		boolean Loop = true;
		int dice;
		
			System.out.println("How many times would you like to roll the dice?");
			int choice = input.nextInt();
			
			
			// Takes input on how many sides 
			System.out.println("How many sides would you like your dice to have");
			int sides = input.nextInt();
			
			for(int i = 0; i<choice; i++) {
				// Must add +1 otherwise the dice wouldn't go up to the full limit specified
				dice = rand.nextInt(sides);
				
				//Makes it so a dice can't be zero
				if(dice == 0) {
					dice += 1;
				}
				
				System.out.println(dice);
			}			
		}		
	}
