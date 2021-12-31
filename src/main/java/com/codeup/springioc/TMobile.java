package com.codeup.springioc;

public class TMobile implements Sim{
	@Override
	public void calling() {
		System.out.println("Calling using TMobile");
	}

	@Override
	public void data() {
		System.out.println("Browsing using TMobile");
	}
}
