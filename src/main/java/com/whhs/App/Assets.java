package com.whhs.App;

import java.util.Random;

public class Assets {
	//Everything random

	public static double rand1;
	public static double rand2;

	public Assets() {

		double max = 15.00;
		double min = 3.75;
		double range = max - min + 1;

		double max2 = 15.00;
		double min2 = 3.75;
		double range2 = max2 - min2 + 1;

		rand1 = (double)(Math.random() * range) + min;
		rand2 = (double)(Math.random() * range2) + min2;

		//Main.root.getChildren().addAll(rand, rand2);
	}

	public void Test() {
		int rangePos = 540 - 0 + 1;
		int randomPos = (int)(Math.random() * rangePos) + 0;

		//System.out.println(randomPos);
	}

	public static double getRand1() {
		 return rand1;
	}
	public static double getRand2() {
		 return rand2;
	}
}
//anything else random belongs to respective classes