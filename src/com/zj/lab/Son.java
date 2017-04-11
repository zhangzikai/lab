package com.zj.lab;


public class Son extends Father {
	public Son() {
		// TODO Auto-generated constructor stub
		Heart name = new Heart();
		name.toSay();
		
	}
	public class Heart{
		 public Heart() {
			// TODO Auto-generated constructor stub
		}
		 public void toSay(){
			 System.out.println("son's heart");
		 }
		}
	public void  over(){
		Heart name = new Heart();
		name.toSay();
	}

}
