package com.general.general;

public class Clonne {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*CloneA objaOne = new CloneA();
		objaOne.a=10;
		objaOne.b=20;
		System.out.println(objaOne.a + ""+objaOne.b);
		CloneA objTwo=objaOne;
		objTwo.a=1000;
		System.out.println(objaOne.a);
		*/
		CloneB objaOne = new CloneB();
		objaOne.a=10;
		objaOne.b=20;
		System.out.println(objaOne.a + ""+objaOne.b);
		CloneB objTwo=(CloneB) objaOne.clone();
		objTwo.a=1000;
		System.out.println(objaOne.a);
		System.out.println(objTwo.a);
		
	}

}
