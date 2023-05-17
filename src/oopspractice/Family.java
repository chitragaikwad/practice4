package oopspractice;
// Family class is Concrete class
public class Family implements Grandparents{
public void Familyname() {                        // non static method of Family class
	System.out.println("Thakur Family");
}
public void Sister() {                            // non static method of  Siblings class
	System.out.println("Arya is Sister");
	}
public void Brother() {
	System.out.println("Sumit is brother");       //non static method of  Siblings class
}
public static void Students() {                   // static method from sibling class
	System.out.println("Arya & Sumit are clever students in school");
}
public void Father() {
	System.out.println("Shri.Rahul Thakur is Fataher");  // non static method of Parents class
}
public void Mother () {
	System.out.println("Smt.Priya Thakur is Mother");      // non static methods of Parents class
}
public static void Helping() {                  // static method from Parents class
	System.out.println("Mr. Rahul & Mrs Priya both are very helping");
}
public void GrandFather() {
	System.out.println("Shri.Ramesh Thakur is Grand Father");  // non static methods of Grandparents class
}
public void GrandMother() {
	System.out.println("Smt.Rohini Thakur is Grand Mother");// non static methods of Grand Parents class
}
public static void supportsystem() {   // static method from Grandparents class
	System.out.println("MR. Ramesh & Mrs Rohini Is support system of Thakur Family");
}
public static void social() {    // static method from Family class
	System.out.println("Thakur Family always Participates in Social activities ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Family obj = new Family();
obj.Familyname();
obj.Sister();
obj.Brother();
Students();
obj.Father();
obj.Mother();
Helping();
obj.GrandFather();
obj.GrandMother();
supportsystem();
social();
	}
}
