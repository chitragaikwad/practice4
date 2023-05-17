package oopspractice;
// this class is explains about Grand parents class 
public interface Grandparents extends Parents {
public void GrandFather();// non static method & 100% abstracted incomplete method
public void GrandMother(); // non static method & 100% abstracted incomplete method
public static void supportsystem() { //static method complete method 
	System.out.println("Both are Supportive"); //Interface requires body
}
}
