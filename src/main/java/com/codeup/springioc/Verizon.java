package com.codeup.springioc;

public class Verizon implements Sim{
	@Override
	public void calling() {
		System.out.println("Calling using Verizon");
	}

	@Override
	public void data() {
		System.out.println("Browsing using Verizon");
	}
}
