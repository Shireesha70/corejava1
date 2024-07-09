package com.tnsif.interfacedemo;

public class Warrior implements Character,Weapon {
	@Override
	public void use() {
		System.out.print("welcome");
	}
	@Override
	public void attack() {
		System.out.print("attack");
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.attack();
		w.use();
	}

}
