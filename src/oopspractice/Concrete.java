package oopspractice;

public class Concrete extends Bloodbank {
public void bloodbankname() {
	System.out.println("Bnglore bloodbank and dognostic Laboratory");
}
public void Name() {
	System.out.println("Shri. Sumit Thakur");
}
public void age(int a) {
	 
	System.out.println("Age of sumit is:"+ a );
}
public void bloodgroup() {
	char b='o';
	System.out.println("blood group of sumit is:"+b);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete obj= new Concrete();
		obj.bloodbankname();
		obj.Name();
		obj.age(45);
		obj.bloodgroup();
		obj.blooddonation();
		healthy();
	}

}
