package basicPrograms;


//this can also be used to:
//
//Invoke current class constructor
//Invoke current class method
//Return the current class object
//Pass an argument in the method call
//Pass an argument in the constructor call
public class Test15 {

	int number;
	
	public Test15(int Number) {
		this.number = Number;
	}
	public static void main(String[] args) {
		Test15 obj = new Test15(6);
		System.out.println(obj.number);
	}
}
