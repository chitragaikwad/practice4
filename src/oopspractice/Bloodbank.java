package oopspractice;
// This class is explains about blood bank in abstraction
public abstract class Bloodbank {
	
abstract public void Name(); // non static method incomplete method 100% abstracted 

abstract public void age(int c); // non static method incomplete method with single argument

abstract public void bloodgroup();// non static method incomplete method 100% abstracted 

public void blooddonation() { // non static method complete method 0% abstracted
	
	System.out.println("your blooddonation may save any ones life");
}
public static void healthy() {  // static method complete method 0% abstracted
	System.out.println("You must be healthy for blood donation");
}
}


	

	


