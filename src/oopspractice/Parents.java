package oopspractice;
// this class is explains about Parents class
public interface Parents extends Siblings {
public void Father();  // non static method And 100% abstracted
public void Mother();// non static method And 100% abstracted
public static void Helping() {  //Static method is complete method 
	System.out.println("Both are Helping In nature");// Interface Static method requires body
}
}
