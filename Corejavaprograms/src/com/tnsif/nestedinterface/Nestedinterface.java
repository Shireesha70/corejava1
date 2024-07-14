package com.tnsif.nestedinterface;

public class Nestedinterface implements Ourinterface.Ourowninterface {
	@Override
	public void print() {
	System.out.println("own interface");
	

}
     public static void main(String[] args) {
	Nestedinterface s=new Nestedinterface();
	s.print();
	System.out.println(Nestedinterface.s);
}
}
