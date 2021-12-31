package com.codeup.springioc;

public class Mobile {
	public static void main(String[] args) {

		// Class Reference
		TMobile tMobile = new TMobile();
		tMobile.calling();
		tMobile.data();

		// Interface Reference
		Sim sim = new Verizon();
		sim.calling();
		sim.data();

	}
}
