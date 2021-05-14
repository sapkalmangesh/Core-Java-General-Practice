package com.cj.modifire;

public class Internsheep {
	public    String name;
	public    String addr;
	public    String cource;
	private   String dob;
	private   long   mob;
	protected int    stypend;


	
	public void info()
	{  
		System.out.println("Student who joining to Internship");
		System.out.println("Student Name : "+name);
		System.out.println("Student Address :"+ addr);
		System.out.println("Course : " + cource);
		System.out.println("Date of Birh : "+ dob);
		System.out.println("Student Contact :"+ mob);
		System.out.println("Stypend  :"+ stypend);
	}
	
	
	public Internsheep(String name, String addr, String cource, String dob, long mob, int stypend) {
		
		this.name    = name;
		this.addr    = addr;
		this.cource  = cource;
		this.dob     = dob;
		this.mob     = mob;
		this.stypend = stypend;
		
		
		
	}




	public static void main(String[] args) 
	{

		Internsheep i = new Internsheep("Vaibhav", "Nandura", "Bcom", "15 jan 1999", 9587485698l, 4500);

		i.info();



	}
}


