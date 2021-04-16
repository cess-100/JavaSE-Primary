package com.cess.day15;

class  Outer{
	class Inner{
	}
	public static void main(String[] args) {
		
		Outer.Inner  inner1 = new Outer().new Inner();
		
		Outer out = new Outer();
		Outer.Inner  inner2 = out.new Inner();
		
	}
}

