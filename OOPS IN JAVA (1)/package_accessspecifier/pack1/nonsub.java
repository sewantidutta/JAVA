package pack1;
import pack1.test;
public class nonsub {
	public static void main(String []args) {
		test t1 = new test();
		//public
		t1.getName();
		//default
		t1.getgender();
		//protected 
		t1.getMarks();
		//private
		//t1.getage();
	}

}
