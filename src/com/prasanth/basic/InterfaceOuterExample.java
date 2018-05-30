package com.prasanth.basic;

interface Inter {
	int j = 100;
	final int i = 90;

	void display();
}

class InterExample implements Inter {
	public void display() {
		System.out.println("Hi This is Prasanth");
	}
}

class InterfaceOuterExample implements Inter {
	public void display() {
		System.out.println("This is Perficient");
	}

	public static void main(String args[]) {
		InterfaceOuterExample ple = new InterfaceOuterExample();
		Inter pler = new InterExample();
		pler.display();
		ple.display();
		System.out.println(i);
		System.out.println(j);
	}
}
