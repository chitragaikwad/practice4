package oopspractice;

public class Mechanical extends Drawing    {
public void vernierscale() {
	System.out.println("use linear meassurement");
}
public void micrometer() {
	System.out.println("use for range meassurement");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mechanical obj = new Mechanical();
obj.medical1();
obj.medical2();
obj.medical3();
obj.percussion();
obj.stringed();
obj.keyboard();
obj.wind();
obj.pencil();
obj.Draftingboard();
obj.frenchcurve();
obj.vernierscale();
obj.micrometer();

	}

}
