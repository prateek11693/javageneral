package com.general.general;

import org.omg.SendingContext.RunTime;

public class A {
	
	public void first() {
		System.out.println("first");
	}
	
	@Override
	public void finalize() {
		System.out.println("finalize");
	}

	public void second() {
		System.out.println("second");
	}


	public static void main(String[] args) {
		A a=new A();
		a.first();
		a.finalize();
		a.second();
		System.gc();
				 Runtime.runFinalizersOnExit(true);
	}

}
